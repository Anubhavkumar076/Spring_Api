package com.example.demo.model;

public class CartSessionInfo {
	
	public int book_id;
	public int qty;
	public int shipping_cost;
	public int handelling_cost;
	public int getHandelling_cost() {
		return handelling_cost;
	}
	public void setHandelling_cost(int handelling_cost) {
		this.handelling_cost = handelling_cost;
	}
	public int getShipping_cost() {
		return shipping_cost;
	}
	public void setShipping_cost(int shipping_cost) {
		this.shipping_cost = shipping_cost;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String title;
	public float price;
	public String thumb;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	

}
