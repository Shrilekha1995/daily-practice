package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.TaskDao;
import com.app.model.Task;


@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskDao taskDao;
	
	public List<Task> findAllTasks() {
		
		List<Task> taskList= taskDao.findAllTasks();
		return taskList;
	}

	public void deleteTaskId(int id) {
		taskDao.deleteTaskId(id);
		
	}

	public void saveTask(Task tasks) {
		taskDao.saveTask(tasks);
		
	}

	public Task findTaskById(int id) {
		Task t=taskDao.findTaskById(id);
		return t;
	}

	public void updateTask(Task task) {
		
		        Task entity = taskDao.findTaskById(task.getId());
		        if(entity!=null){
		        	 entity.setId(task.getId());
		            entity.setName(task.getName());
		            entity.setTask(task.getTask());
		            entity.setAssignedBy(task.getAssignedBy());
		            entity.setStatus(task.getStatus());
		        }
		 
		
	}

	public Task findTaskByName(String name) {
		Task t=taskDao.findTaskByName(name);
		return t;
	}

}
