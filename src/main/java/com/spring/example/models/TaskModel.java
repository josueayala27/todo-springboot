package com.spring.example.models;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class TaskModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "priority_id")
  private PriorityModel priority;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PriorityModel getPriority() {
    return this.priority;
  }

  public void setPriority(PriorityModel priority) {
    this.priority = priority;
  }
}