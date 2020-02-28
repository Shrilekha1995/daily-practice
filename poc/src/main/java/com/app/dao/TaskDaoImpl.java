package com.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.model.Task;



@Repository
public class TaskDaoImpl implements TaskDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	public List<Task> findAllTasks() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Task");
 	    @SuppressWarnings("unchecked")
		List <Task> taskList=query.list();
 	    return taskList;
		
	}

	public void deleteTaskId(int id) {
		  Query query = sessionFactory.getCurrentSession().createQuery("delete from Task where id = :id");
	        query.setInteger("id", id);
	        query.executeUpdate();
	}

	public void saveTask(Task tasks) {
		sessionFactory.getCurrentSession().persist(tasks);
		
	}

	public Task findTaskById(int id) {
		  Task  t=(Task) sessionFactory.getCurrentSession().byId(Task.class).getReference(id);
		  System.out.println(t);
	       return t;
	}

	public Task findTaskByName(String name) {
		Task  t=(Task) sessionFactory.getCurrentSession().byId(Task.class).getReference(name);
		  System.out.println(t);
	       return t;
	}

	
}
