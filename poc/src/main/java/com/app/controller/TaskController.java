package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.app.model.Task;
import com.app.service.TaskService;

@Controller
@RequestMapping("/")
public class TaskController {

	@Autowired
	TaskService taskService;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listTasks(ModelMap model) {
        List<Task> tasks = taskService.findAllTasks();
		model.addAttribute("tasks", tasks);
		return "allTasks";
	}

	@RequestMapping(value = { "/create" }, method = RequestMethod.GET)
	public String newTask(ModelMap model) {
		Task tasks = new Task();
		model.addAttribute("tasks", tasks);
		return "registration";
	}

	@RequestMapping(value = { "/create" }, method = RequestMethod.POST)
	public String saveTask(Task tasks, ModelMap model) {
        taskService.saveTask(tasks);
		return "redirect:list";
	}

    
	@RequestMapping(value={ "/", "/list" },method = RequestMethod.POST)
	public String searchTaskByID(Task task, ModelMap model) {
		System.out.println(task);
        Task t = taskService.findTaskById(task.getId());
		model.addAttribute("tasks", t);
		return "search";
	}

	@RequestMapping(value = { "/edit{id}" }, method = RequestMethod.GET)
	public String editTask(@PathVariable int id, ModelMap model) {
		Task tasks = taskService.findTaskById(id);
		model.addAttribute("tasks", tasks);
		return "registration";
	}

	@RequestMapping(value = { "/edit{id}" }, method = RequestMethod.POST)
	public String updateTask(Task task) {
        taskService.updateTask(task);
        return "redirect:list";
	}

	@RequestMapping(value = { "/delete{id}" }, method = RequestMethod.GET)
	public String deleteTask(@PathVariable int id) {
		taskService.deleteTaskId(id);
		return "redirect:list";
	}

}
