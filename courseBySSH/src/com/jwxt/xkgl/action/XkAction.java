package com.jwxt.xkgl.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwxt.core.constant.Constant;
import com.jwxt.model.lesson.entity.Lesson;
import com.jwxt.model.lesson.service.LessonService;
import com.jwxt.model.student.entity.Student;
import com.jwxt.model.util.LessonUtil;;

@Controller
@RequestMapping(value="/xkgl")
public class XkAction {

	@Autowired 
	private LessonService lessonService;
	private Student student;
	
	@RequestMapping(value="/xk")
	public String xk(){
		
		return null;
	}

}
