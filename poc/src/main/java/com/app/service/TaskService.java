package com.app.service;

import java.util.List;

import com.app.model.Task;

public interface TaskService {

	List<Task> findAllTasks();

	void deleteTaskId(int id);

	void saveTask(Task tasks);

	Task findTaskById(int id);

	void updateTask(Task task);

	Task findTaskByName(String name);

}
