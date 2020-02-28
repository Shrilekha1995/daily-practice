package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();

	public void createStudent(Student student);

}
