package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.*;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	Users findUsersByEmail(String email);
	Users findTopByOrderByIdDesc();
}
