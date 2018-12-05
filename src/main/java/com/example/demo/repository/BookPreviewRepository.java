package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Books;


public interface BookPreviewRepository extends CrudRepository<Books,Integer>{
	
	public List<Books> findBycategory(int category);
	//public List<Books> findBybook_id(int book_id);

}
