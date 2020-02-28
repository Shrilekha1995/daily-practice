package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDao;
import com.app.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> l=studentDao.getAllStudent();
		return l;
	}

	@Override
	public void createStudent(Student student) {
		studentDao.createStudent(student);
		
	}

}
