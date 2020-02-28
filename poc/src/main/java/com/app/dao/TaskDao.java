package com.app.dao;

import java.util.List;

import com.app.model.Task;

public interface TaskDao {

	List<Task> findAllTasks();

	void deleteTaskId(int id);

	void saveTask(Task tasks);

	Task findTaskById(int id);

	Task findTaskByName(String name);

}
