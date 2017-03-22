package com.jwxt.model.lesson.service;

import javax.servlet.ServletOutputStream;

import com.jwxt.core.service.BaseService;
import com.jwxt.model.lesson.entity.Lesson;

public interface LessonService extends BaseService<Lesson> {

	public void exportExcell(Lesson[][] lessonTable, ServletOutputStream outputStream);

}
