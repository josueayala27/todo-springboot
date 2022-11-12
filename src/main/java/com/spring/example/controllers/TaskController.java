package com.spring.example.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.models.TaskModel;
import com.spring.example.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
  @Autowired
  TaskService taskService;

  @GetMapping()
  public ArrayList<TaskModel> getTasks() {
    return taskService.getTasks();
  }

  @PostMapping()
  public TaskModel saveTask(@RequestBody TaskModel task) {
    return taskService.saveTask(task);
  }

  @GetMapping(path = "/{id}")
  public Optional<TaskModel> getTaskById(@PathVariable("id") Long id) {
    return taskService.getTask(id);
  }

  @DeleteMapping(path = "{id}")
  public String deleteTaskById(@PathVariable("id") Long id) {
    boolean status = taskService.deleteTask(id);
    if (status) {
      return "Register has been deleted successfully.";
    } else {
      return "The task could not be deleted.";
    }
  }
}