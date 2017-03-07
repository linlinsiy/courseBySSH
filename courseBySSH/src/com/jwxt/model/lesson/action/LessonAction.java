package com.jwxt.model.lesson.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwxt.model.lesson.service.LessonService;

@Controller
@RequestMapping(value="/lesson")
public class LessonAction {

	@Autowired
	private LessonService lessonservice;
	
	//列表
	
	//跳转到新增
	
	//保存课程
	
	//查询课程
}
