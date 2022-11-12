package com.spring.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.models.PriorityModel;

@Repository
public interface PriorityRepository extends CrudRepository<PriorityModel, Long> {

}
