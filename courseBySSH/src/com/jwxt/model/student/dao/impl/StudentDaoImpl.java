package com.jwxt.model.student.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.jwxt.core.dao.impl.BaseDaoImpl;
import com.jwxt.model.student.dao.StudentDao;
import com.jwxt.model.student.entity.Student;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {

	@Override
	public List<Student> findStudentsByStuIdAndStuPwd(int stuId, String stuPwd) {
		String sSQL = "FROM Student WHERE stuId=? AND stuPwd=?";
		Query query = getCurrentSession().createQuery(sSQL);
		query.setParameter(0, stuId);
		query.setParameter(1, stuPwd);
		return query.list();
	}

}
