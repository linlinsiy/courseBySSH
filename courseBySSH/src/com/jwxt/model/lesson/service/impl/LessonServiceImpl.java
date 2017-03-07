package com.jwxt.model.lesson.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jwxt.core.service.impl.BaseServiceImpl;
import com.jwxt.model.lesson.dao.LessonDao;
import com.jwxt.model.lesson.entity.Lesson;
import com.jwxt.model.lesson.service.LessonService;

@Service("lessonService")
public class LessonServiceImpl extends BaseServiceImpl<Lesson> implements
		LessonService {
	
	private LessonDao lessonDao;

	@Resource
	public void setLessonDao(LessonDao lessonDao) {
		super.setBaseDao(lessonDao);
		this.lessonDao = lessonDao;
	}
	


}
