package com.jwxt.model.student.dao;

import java.util.List;

import com.jwxt.core.dao.BaseDao;
import com.jwxt.model.student.entity.Student;


public interface StudentDao extends BaseDao<Student> {

	//根据学号和密码查找学生列表
	public List<Student> findStudentsByStuIdAndStuPwd(int stuId, String stuPwd);

}
