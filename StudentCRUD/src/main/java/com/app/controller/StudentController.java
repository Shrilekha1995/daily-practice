package com.app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Student;
import com.app.service.StudentService;




@Controller
@RequestMapping("/")
public class StudentController {
	
	
	@Autowired
	StudentService studentService;
	
	 @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
	public String listStudents(ModelMap model)
	{
		
		List<Student> students=studentService.getAllStudent();
		model.addAttribute("students", students);
		return "allStudents";
	}
	 
	 @RequestMapping(value={"/create"},method= RequestMethod.GET)
	 public String createStudent()
	 {
		 return "registerStudent";
		 
	 }
	 @RequestMapping(value={"/create"},method= RequestMethod.POST)
	 public String createStudents(Student student, BindingResult result,
	            ModelMap model)
	 {
		 studentService.createStudent(student);
		 
		 return "success";
		 
	 }
	 
	

}
