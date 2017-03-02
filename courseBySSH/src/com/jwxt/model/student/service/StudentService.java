package com.jwxt.model.student.service;

import java.util.List;

import com.jwxt.core.service.BaseService;
import com.jwxt.model.student.entity.Student;

public interface StudentService extends BaseService<Student> {

	List<Student> findStudentsByStuIdAndStuPwd(int stuId, String stuPwd);

}
