package com.example.demo.model;

public class Orders {
	
	private long order_id;
	private long i_date;
	private long delivery_by;
	private String book_img;
	private int mrp;
	private int shipping;
	private int cod;
	private int coupon;
	private int status;
	private int fast_delivery;
	private int handling_charge;
	private int book_id;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getHandling_charge() {
		return handling_charge;
	}
	public void setHandling_charge(int handling_charge) {
		this.handling_charge = handling_charge;
	}
	public int getFast_delivery() {
		return fast_delivery;
	}
	public void setFast_delivery(int fast_delivery) {
		this.fast_delivery = fast_delivery;
	}
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	
	public long getI_date() {
		return i_date;
	}
	public void setI_date(long i_date) {
		this.i_date = i_date;
	}
	public long getDelivery_by() {
		return delivery_by;
	}
	public void setDelivery_by(long delivery_by) {
		this.delivery_by = delivery_by;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public int getShipping() {
		return shipping;
	}
	public void setShipping(int shipping) {
		this.shipping = shipping;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
