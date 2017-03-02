package com.jwxt.login.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jwxt.core.constant.Constant;
import com.jwxt.model.student.entity.Student;
import com.jwxt.model.student.service.StudentService;

@Controller
@RequestMapping(value="/login")
@SessionAttributes("SYS_STUDENT")
public class LoginAction {

	private String loginResult;
	
	@Resource
	private StudentService studentService;
	//登录界面
	@RequestMapping(value="/loginUI")
	public String loginUI(){
		return "forward:/WEB-INF/jsp/loginUI.jsp";
	}
	//登录
	@RequestMapping(value="/login")
	public String login(Student student,ModelMap map){
		Log log = LogFactory.getLog(getClass());
		if(student != null){
			//1.1、根据账号、密码查询用户记录
			if(student.getStuId()>0 && StringUtils.isNotBlank(student.getStuPwd())){
				//1.2、根据账号、密码查询用户记录
				List<Student> list = studentService.findStudentsByStuIdAndStuPwd(student.getStuId(), student.getStuPwd());
				if(list != null && list.size() > 0){
					//1.3、登录成功（有用户记录）
					//1.3.1、获取用户信息
					student = list.get(0);
					//1.3.2、根据用户id将用户对应的所有用户角色设置到用户中
//					student.setStudentRoles(studentService.findStudentRolesByStudentId(student.getId()));
					//1.3.3、将用户信息存入session
					map.addAttribute(Constant.STUDENT, student);
					//1.3.4、将用户登录信息记录到日志文件
					log.info("用户名称为：" + student.getStuName() + "的用户登录系统。");
					//1.3.5、跳转到系统首页（重定向）
					return "forward:/WEB-INF/jsp/home/home.jsp";
				}else {
					//1.4、登录失败
					log.info("账号或密码错误");
					loginResult = "账号或密码错误";
				}				
			}else{
				log.info("账号或密码不能为空");
				loginResult = "账号或密码不能为空";
			}
		}else{
			log.info("账号密码不能为空");
			loginResult = "账号密码不能为空";
		}
		map.put("loginResult", loginResult);
		return "forward:/WEB-INF/jsp/loginUI.jsp";
	}
}
