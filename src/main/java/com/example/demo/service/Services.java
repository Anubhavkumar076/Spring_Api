package com.example.demo.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import com.example.demo.model.*;;

@Service
public class Services {
	
	 @Autowired  
	    JdbcTemplate jdbc; 
	 
	 
	 
	 //*******************************For Cart Details*****************************************************************
	 public List<CartSessionInfo> getCartDetails(int userid)
	 {
		 
		 List<CartSessionInfo> cart_session= jdbc.query("SELECT DISTINCT U.user_id, B.book_id, B.price, B.title, B.thumb, B.author, B.qty, P.shipping_cost, P.handling_charge from cart_session as U INNER join books as B on B.book_id=U.book_id INNER JOIN book_pricing_new as P on P.book_id=U.book_id WHERE U.user_id="+userid+"  GROUP BY B.book_id"
				  ,new ResultSetExtractor<List<CartSessionInfo>>(){
				         
				         public List<CartSessionInfo> extractData(
				            ResultSet rs) throws SQLException, DataAccessException {
				            
				            List<CartSessionInfo> list = new ArrayList<CartSessionInfo>();  
				            while(rs.next()){  
				            	
				            	CartSessionInfo cartsession=new CartSessionInfo();
				            	cartsession.setBook_id(rs.getInt("book_id"));
				            	cartsession.setTitle(rs.getString("title"));
				            	cartsession.setThumb(rs.getString("thumb"));
				            	cartsession.setPrice(rs.getFloat("price"));
				            	cartsession.setQty(rs.getInt("qty"));
				            	cartsession.setHandelling_cost(rs.getInt("handling_charge"));
				            	cartsession.setShipping_cost(rs.getInt("shipping_cost"));
				            	list.add(cartsession);
				            }  
				            return list;  
				         }    	  
				      });
		return cart_session;
	 }
	 
	 
	 //**************************For Full ProductView***************************************************************
	 
	 
	 public List<ProductFullData> getFullProductDetails(int book_id)
	 {
		 
		 List<ProductFullData> product_details= jdbc.query("SELECT B.book_id, B.title,B.price, B.thumb, B.author, B.shipping_cost,P.handling_charge, I.book_inv_id, I.donation_req_id, D.donor_id, U.first_name, U.last_name from books as B INNER JOIN bookinventory as I  ON B.book_id=I.book_id INNER JOIN donationreqs as D on I.donation_req_id=D.donation_req_id INNER JOIN users as U on U.id=D.donor_id INNER JOIN book_pricing_new as P on P.book_id=B.book_id WHERE B.book_id="+book_id+" ORDER BY I.book_inv_id ASC LIMIT 1"
				  ,new ResultSetExtractor<List<ProductFullData>>(){
				         
				         public List<ProductFullData> extractData(
				            ResultSet rs) throws SQLException, DataAccessException {
				            
				            List<ProductFullData> list = new ArrayList<ProductFullData>();  
				            while(rs.next()){  
				            	
				            	ProductFullData productfulldata=new ProductFullData();
				            	productfulldata.setBook_id(rs.getInt("book_id"));
				            	productfulldata.setTitle(rs.getString("title"));
				            	productfulldata.setThumb(rs.getString("thumb"));
				            	productfulldata.setShipping_cost(rs.getFloat("shipping_cost"));
				            	productfulldata.setHandling_charge(rs.getInt("handling_charge"));
				            	productfulldata.setAuthor(rs.getString("author"));
				            	productfulldata.setBook_inv_id(rs.getInt("book_inv_id"));
				            	productfulldata.setDonation_req_id(rs.getInt("donation_req_id"));
				            	productfulldata.setDonor_id(rs.getInt("donor_id"));
				            	productfulldata.setFirst_name(rs.getString("first_name"));
				            	productfulldata.setLast_name(rs.getString("last_name"));
				            	list.add(productfulldata);
				            }  
				            return list;  
				         }    	  
				      });
		return product_details;
	 }
	 
	 
	 //**************************************FOR SELECT DELIVERY ADDRESS************************************************
	 
	 public List<SelectDeliveryAddress> getDeliveryAddress(int user_id)
	 {
		 
		 List<SelectDeliveryAddress> select_delivery_address= jdbc.query("SELECT A.address_id, A.user_id, A.title, A.rec_name, A.pincode, A.address, A.landmark, A.country_id,A.state_id,A.city_id, A.phone_no, C.country, Ci.city, S.state_name FROM useraddresses as A INNER JOIN countries as C on A.country_id=C.id INNER JOIN cities as Ci on Ci.city_id=A.city_id INNER JOIN states as S on S.state_id=A.state_id where A.user_id="+user_id
				  ,new ResultSetExtractor<List<SelectDeliveryAddress>>(){
				         
				         public List<SelectDeliveryAddress> extractData(
				            ResultSet rs) throws SQLException, DataAccessException {
				            
				            List<SelectDeliveryAddress> select_delivery = new ArrayList<SelectDeliveryAddress>();  
				            while(rs.next()){  
				            	
				            	SelectDeliveryAddress delivery_address=new SelectDeliveryAddress();
				            	delivery_address.setAddress_id(rs.getInt("address_id"));
				            	delivery_address.setUser_id(rs.getInt("user_id"));
				            	delivery_address.setTitle(rs.getString("title"));
				            	delivery_address.setRec_name(rs.getString("rec_name"));
				            	delivery_address.setPincode(rs.getInt("pincode"));
				            	delivery_address.setAddress(rs.getString("address"));
				            	delivery_address.setLandmark(rs.getString("landmark"));
				            	delivery_address.setCountry_id(rs.getInt("country_id"));
				            	delivery_address.setState_id(rs.getInt("state_id"));
				            	delivery_address.setCity_id(rs.getInt("city_id"));
				            	delivery_address.setPhone_no(rs.getLong("phone_no"));
				            	delivery_address.setCountry(rs.getString("country"));
				            	delivery_address.setCity(rs.getString("city"));
				            	delivery_address.setState_name(rs.getString("state_name"));
				            	
				            	select_delivery.add(delivery_address);
				            }  
				            return select_delivery;  
				         }    	  
				      });
		return select_delivery_address;
	 }
	 
 //**************************************FOR MY ORDERS************************************************
	 
	 public List<Orders> getOrders(int user_id)
	 {
		 
		 List<Orders> myorders= jdbc.query("SELECT O.order_id, O.i_date, O.cod_charge,O.fast_delivery, O.coupon_amount,O.status, OB.book_id, B.thumb, B.price, BP.shipping_cost, BP.handling_charge FROM orders as O INNER JOIN order_books as OB on O.order_id=OB.order_id INNER JOIN books as B on B.book_id=OB.book_id INNER JOIN book_pricing_new as BP on BP.book_id=OB.book_id where O.user_id="+user_id+" GROUP BY O.order_id"
				  ,new ResultSetExtractor<List<Orders>>(){
				         
				         public List<Orders> extractData(
				            ResultSet rs) throws SQLException, DataAccessException {
				            
				            List<Orders> orders = new ArrayList<Orders>();  
				            while(rs.next()){  
				            	
				            	Orders order=new Orders();
				            	order.setBook_img(rs.getString("thumb"));
				            	order.setCod(rs.getInt("cod_charge"));
				            	order.setCoupon(rs.getInt("coupon_amount"));
				            	order.setMrp(rs.getInt("price"));
				            	order.setI_date(rs.getLong("i_date"));
				            	order.setFast_delivery(rs.getInt("fast_delivery"));
				            	order.setOrder_id(rs.getLong("order_id"));
				            	order.setShipping(rs.getInt("shipping_cost"));
				            	order.setStatus(rs.getInt("status"));
				            	order.setHandling_charge(rs.getInt("handling_charge"));
				            	order.setBook_id(rs.getInt("book_id"));
				            	orders.add(order);
				            }  
				            return orders;  
				         }    	  
				      });
		return myorders;
	 }
	 
	 

}