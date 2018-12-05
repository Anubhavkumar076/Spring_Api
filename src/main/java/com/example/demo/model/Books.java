package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class Books {
	
	@Id
	private int book_id;
//	private String sku;
//	private String isbn;
	
	@Column(name = "title")
	private String title;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscount_price() {
		return discount_price;
	}
	public void setDiscount_price(String discount_price) {
		this.discount_price = discount_price;
	}
	//private String slug;
	
	@Column(name = "thumb")
	private String thumb;
	
	@Column(name = "author")
	private String author;
	//private String publication;
	
	@Column(name = "category")
	private int category;
	//private String publication_date;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "discount_price")
	private String discount_price;
//	private String weight;
//	private String binding;
//	private String edition;
//	private String shipping_cost;
//	private String book_desc;
//	private String book_desc_url;
//	private String no_of_pages;
//	private String language;
//	private String is_allow_multi_order;
//	private String qty;
//	private String published;
//	private String is_cashondelivery;
//	private String is_featured;
//	private String is_publication_house;
//	private String is_out_of_stack;
//	private String is_deleted;
//	private String is_doubtful;
//	private String keywords;
//	private String i_by;
//	private String i_date;
//	private String u_by;
//	private String u_date;
//	private String uploaded_by;
//	private String actual_date_upload;
	

}
