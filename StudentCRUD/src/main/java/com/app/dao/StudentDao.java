package com.app.dao;



import java.util.List;

import com.app.model.Student;

public interface StudentDao {
	
	
	public List<Student> getAllStudent();

	public void createStudent(Student student);


}
