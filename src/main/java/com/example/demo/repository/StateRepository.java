package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.States;

public interface StateRepository extends JpaRepository<States, Integer>
{
	States findByStateName(String stateName);
}
