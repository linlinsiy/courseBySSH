package com.jwxt.xkgl.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwxt.core.constant.Constant;
import com.jwxt.model.lesson.entity.Lesson;
import com.jwxt.model.lesson.service.LessonService;
import com.jwxt.model.student.entity.Student;
import com.jwxt.model.util.LessonUtil;

@Controller
@RequestMapping(value="/wdkb")
public class KbAction {

	@Autowired 
	private LessonService lessonService;
	private Student student;
	
	//跳转页面框架
	@RequestMapping(value="/frame")
	public String frame(){
		return "forward:/WEB-INF/jsp/wdkb/frame.jsp";
	}
	
	@RequestMapping(value="/top")
	public String top(){
		return "forward:/WEB-INF/jsp/home/top.jsp";
	}
	//跳转到课表界面
	@RequestMapping(value="/kb")
	public String kb(HttpSession httpSession,Lesson lesson){
		//从session域中获取当前学生
		student = (Student)httpSession.getAttribute(Constant.STUDENT);
		//查询本学生所有课程
		List<Lesson> lessons = lessonService.findObjects();
		//将课程保存为map形式，key为上课时间，value为课程
		Lesson[][] lessonTable = LessonUtil.list2Map(lessons);
		//将所有课程保存到session域中
		httpSession.setAttribute("lessonTable", lessonTable);
		//各节次时间保存到session域
		String[] time = {"8:00~8:45","8:55~9:40","10:00~10:45","10:55~11:40","12:10~12:55",
				"13:05~13:50","14:10~14:55","15:05~15:50","16:00~16:45","16:05~17:50",
				"18:00~18:45","18:55~19:40","19:50~20:35"};
		httpSession.setAttribute("time", time);
		return "forward:/WEB-INF/jsp/wdkb/kebiao.jsp";
	}
	//导出excel课表
	@RequestMapping(value="/exportExcel")
	public void exportExcel(HttpServletResponse response, HttpSession httpSession){
		try {
			response.setContentType("application/x-excel");
			response.setHeader("Content-Disposition", "attachment;filename=" + new String("课表.xls".getBytes(),"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			lessonService.exportExcell((Lesson[][])httpSession.getAttribute("lessonTable"),outputStream);
			if(outputStream != null){
				outputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
