package com.jwxt.model.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jwxt.core.service.impl.BaseServiceImpl;
import com.jwxt.model.student.dao.StudentDao;
import com.jwxt.model.student.entity.Student;
import com.jwxt.model.student.service.StudentService;

@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {
	
	private StudentDao studentDao;
	
	@Resource
	public void setUserDao(StudentDao studentDao) {
		super.setBaseDao(studentDao);
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findStudentsByStuIdAndStuPwd(int stuId, String stuPwd) {
		List<Student> list = studentDao.findStudentsByStuIdAndStuPwd(stuId,stuPwd);
		return list;
	}


}
