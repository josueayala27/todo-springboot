package com.spring.example.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tasks")
public class TaskModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String task;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "priority_id")
  private PriorityModel priority;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTask() {
    return this.task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public PriorityModel getPriority() {
    return this.priority;
  }

  public void setPriority(PriorityModel priority) {
    this.priority = priority;
  }
}