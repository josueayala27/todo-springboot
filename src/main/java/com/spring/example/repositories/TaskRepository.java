package com.spring.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.models.TaskModel;

@Repository
public interface TaskRepository extends CrudRepository<TaskModel, Long> {
  // public abstract ArrayList<TaskModel> findById(Integer id);
}