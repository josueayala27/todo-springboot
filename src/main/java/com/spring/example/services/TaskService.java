package com.spring.example.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.models.TaskModel;
import com.spring.example.repositories.TaskRepository;

@Service
public class TaskService {
  @Autowired
  TaskRepository taskRepository;

  public ArrayList<TaskModel> getTasks() {
    return (ArrayList<TaskModel>) taskRepository.findAll();
  }

  public TaskModel saveTask(TaskModel task) {
    return taskRepository.save(task);
  }

  public Optional<TaskModel> getTask(Long id) {
    return taskRepository.findById(id);
  }

  public boolean deleteTask(Long id) {
    try {
      taskRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}