package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DonationRequest;

@Repository
public interface DonationRequestsRepository extends JpaRepository<DonationRequest, Integer> {
	DonationRequest findTopByOrderByIdDesc();
}