package com.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Student;
import com.app.service.StudentService;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	   @Autowired
	    private SessionFactory sessionFactory;
	   
	   

		
		@Override
	   public  List<Student> getAllStudent() {
	    	   Query query = sessionFactory.getCurrentSession().createQuery("from Student");
	    	   List <Student>empList=query.list();
	    	   return empList;
	    }




		@Override
		public void createStudent(Student student) {
			sessionFactory.getCurrentSession().persist(student);
			
		}
	}


