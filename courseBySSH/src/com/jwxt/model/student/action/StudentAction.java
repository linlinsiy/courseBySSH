package com.jwxt.model.student.action;

import java.io.File;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwxt.model.student.entity.Student;
import com.jwxt.model.student.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentAction {
	
	private ServletContext servletContext;  
    public void setServletContext(ServletContext arg0) {  
        this.servletContext = arg0;  
    }  
    private ServletConfig servletConfig;  
    public void setServletConfig(ServletConfig arg0) {  
        this.servletConfig = arg0;  
    }
	
	private File stuPic;
	private String stuPicFileName;
	private String stuPicContentType;
	
	@Autowired 
	private StudentService studentService;
	
	@RequestMapping(value="/save")
	public String save(Student student,ModelMap map){
		System.out.println("---action.save:"+student);
		studentService.save(student);
		map.addAttribute("student", student);
		return "forward:/WEB-INF/jsp/test/main.jsp";
	}
	@RequestMapping(value="/find")
	public String find(int id,ModelMap map){
		Student student = studentService.findObjectById(id);
		map.addAttribute("student", student);
		System.out.println("---action.find:"+student);
		return "forward:/WEB-INF/jsp/test/main.jsp";
	}
	
	//跳转编辑页面
	@RequestMapping(value="/editUI")
	public String editUI(){		
		return "forward:/WEB-INF/jsp/model/editUI.jsp";
	}
	
	//保存编辑
	@RequestMapping(value="/edit")
	public String edit(Student student, ModelMap map){
//		try {
//			ServletContext servletContext = request.getSession().getServletContext();
//			System.out.println(student);
//			stuPic = (File)request.getAttribute("stuPic");
//			if(student!=null){
//				if(stuPic != null){
//					//1.获取
//					//2.保存头像文件
//					String filePath = servletContext.getRealPath("upload/student");
//					String fileName = UUID.randomUUID().toString().replace("-", "") + stuPicFileName.substring(stuPicFileName.lastIndexOf("."));
//					FileUtils.copyFile(stuPic, new File(filePath,fileName));
//					//3.设置用户头像路径
//					student.setStuPic("student/" + fileName);
//				}
//				student.setStuBirth((Date)request.getAttribute("stuBirth"));
//				studentService.update(student);
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(student);
		return "redirect:/home/home.action";
	}
	
	public File getStuPic() {
		return stuPic;
	}
	public void setStuPic(File stuPic) {
		this.stuPic = stuPic;
	}
	public String getStuPicFileName() {
		return stuPicFileName;
	}
	public void setStuPicFileName(String stuPicFileName) {
		this.stuPicFileName = stuPicFileName;
	}
	public String getStuPicContentType() {
		return stuPicContentType;
	}
	public void setStuPicContentType(String stuPicContentType) {
		this.stuPicContentType = stuPicContentType;
	}
	
	
}
