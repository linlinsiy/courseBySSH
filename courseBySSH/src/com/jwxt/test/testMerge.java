package com.jwxt.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jwxt.model.lesson.entity.Lesson;
import com.jwxt.model.lesson.service.LessonService;
import com.jwxt.model.util.LessonUtil;

public class testMerge {

	ClassPathXmlApplicationContext ctx;
	
	@Before
	public void loadCtx() {
		ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	@Test
	public void testSpringMVC() {
		
	}

	@Test
	public void testlessontable(){
		LessonService ls = (LessonService)ctx.getBean("lessonService");
		List<Lesson> lessons = ls.findObjects();
		Lesson[][] lessonTable = LessonUtil.list2Map(lessons);
		System.out.println(lessons);
	}

}
