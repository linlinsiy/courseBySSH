package com.jwxt.model.student.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwxt.model.student.entity.Student;
import com.jwxt.model.student.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentAction {
	
	@Autowired 
	private StudentService studentService;
	
	@RequestMapping(value="/save")
	public String save(Student student,ModelMap map){
		System.out.println("---action.save:"+student);
		studentService.save(student);
		map.addAttribute("student", student);
		return "forward:/WEB-INF/jsp/test/main.jsp";
	}
	@RequestMapping(value="/find")
	public String find(int id,ModelMap map){
		Student student = studentService.findObjectById(id);
		map.addAttribute("student", student);
		System.out.println("---action.find:"+student);
		return "forward:/WEB-INF/jsp/test/main.jsp";
	}
	
}
