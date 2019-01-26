package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.*;

public interface CityRepository extends JpaRepository<Cities, Integer> {
	List<Cities> findByStateId(int stateId);
}
