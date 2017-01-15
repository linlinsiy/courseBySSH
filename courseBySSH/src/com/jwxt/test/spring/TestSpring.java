package com.jwxt.test.spring;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;

import com.jwxt.model.student.action.StudentAction;
import com.jwxt.model.student.dao.StudentDao;
import com.jwxt.model.student.entity.Student;
import com.jwxt.model.student.service.StudentService;

public class TestSpring {
	ClassPathXmlApplicationContext ctx;
	
	@Before
	public void loadCtx() {
		ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void testHibernate() {
		SessionFactory sf = (SessionFactory)ctx.getBean("sessionFactory");
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(new Student("用户1"));
		transaction.commit();
		session.close();
	}
	
	@Test
	public void testDao(){
		StudentDao sd = (StudentDao)ctx.getBean("studentDao");
		Student student = sd.findObjectById(1);
		System.out.println(student);
	}
	@Test
	public void testService(){
		StudentService ss = (StudentService)ctx.getBean("studentService");
		Student student = ss.findObjectById(1);
		System.out.println(student);
	}
	@Test
	public void testAction(){
		StudentAction sa = new StudentAction();
		String find = sa.find(1, new ModelMap());
		System.out.println(find);
	}
}
