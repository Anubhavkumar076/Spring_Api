package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.model.CartSessionInfo;
import com.example.demo.model.Orders;
import com.example.demo.model.ProductFullData;
import com.example.demo.model.SelectDeliveryAddress;
import com.example.demo.repository.BookPreviewRepository;
import com.example.demo.service.Services;

@RestController  
public class Controllers {

	    @Autowired  
	    JdbcTemplate jdbc;    
	    
	    @Autowired
	    Services service;
	    
	    @Autowired
		private BookPreviewRepository bprepository;
		
		@RequestMapping("/preview/{category}")
		public List<Books> getBookDetails(@PathVariable int category)
		{
			
			
			return bprepository.findBycategory(category);
			
		}
		
	    
	    
	    //*******************************CART SESSION CONTROLLER*************************************************************************
	    
	    @RequestMapping("/cart/{user_id}")  
	    @Produces(MediaType.APPLICATION_XML)
	    public List<CartSessionInfo> getCartData(@PathVariable int user_id){  
	        return service.getCartDetails(user_id);  
	    }  
	    
	    
	    //************************PRODUCT FULL VIEW DATA*******************************************************
	    @RequestMapping("/productfullview/{book_id}")  
	    @Produces(MediaType.APPLICATION_XML)
	    public List<ProductFullData> getProductFullData(@PathVariable int book_id){  
	        return service.getFullProductDetails(book_id);
	    }  
	    
	    //************************PRODUCT FULL VIEW DATA*******************************************************
	    @RequestMapping("/selectadd/{user_id}")  
	    @Produces(MediaType.APPLICATION_XML)
	    public List<SelectDeliveryAddress> getDeliveryAddress(@PathVariable int user_id){  
	        return service.getDeliveryAddress(user_id);
	    }  
	    
	    //************************PRODUCT FULL VIEW DATA*******************************************************
	    @RequestMapping("/my_orders/{user_id}")  
	    @Produces(MediaType.APPLICATION_XML)
	    public List<Orders> getOrders(@PathVariable int user_id){  
	        return service.getOrders(user_id);
	    }  
	
}
