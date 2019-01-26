package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //lets it know that there is some mapping
@Table(name="donationreqs")
public class DonationRequest {

	@Id
	@Column(name="donation_req_id")
    private int id;
	
	
	private String donor_id;
    private String volunteer_id;
    private String track_url;
    private String declaration_form;
    private String awb_attachment;
    private String status;
    private String Mobile;
    private String address;
    private String Landmark;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String no_of_book;
    private String no_of_cartons;
    private String app_books_weight;
    private String donated_book_category;
    private String pickup_date_time;
    private String donation_image;
    private String how_do_u_know_abt_us;
    private String wastage;
    private String document_mail_sent;
    private String is_blocked;
    private String i_date;
    private String u_date;
    private String tracking_no;
    private String is_paid_donation;
    private String payment_url;
    private String payment_id;

	public String getVolunteer_id() {
		return volunteer_id;
	}

	public void setVolunteer_id(String volunteer_id) {
		this.volunteer_id = volunteer_id;
	}

	public String getTrack_url() {
		return track_url;
	}

	public void setTrack_url(String track_url) {
		this.track_url = track_url;
	}

	public String getDeclaration_form() {
		return declaration_form;
	}

	public void setDeclaration_form(String declaration_form) {
		this.declaration_form = declaration_form;
	}

	public String getAwb_attachment() {
		return awb_attachment;
	}

	public void setAwb_attachment(String awb_attachment) {
		this.awb_attachment = awb_attachment;
	}

	public String getApp_books_weight() {
		return app_books_weight;
	}

	public void setApp_books_weight(String app_books_weight) {
		this.app_books_weight = app_books_weight;
	}

	public String getDonated_book_category() {
		return donated_book_category;
	}

	public void setDonated_book_category(String donated_book_category) {
		this.donated_book_category = donated_book_category;
	}

	public String getDonation_image() {
		return donation_image;
	}

	public void setDonation_image(String donation_image) {
		this.donation_image = donation_image;
	}

	public String getWastage() {
		return wastage;
	}

	public void setWastage(String wastage) {
		this.wastage = wastage;
	}

	public String getDocument_mail_sent() {
		return document_mail_sent;
	}

	public void setDocument_mail_sent(String document_mail_sent) {
		this.document_mail_sent = document_mail_sent;
	}

	public String getIs_blocked() {
		return is_blocked;
	}

	public void setIs_blocked(String is_blocked) {
		this.is_blocked = is_blocked;
	}

	public String getI_date() {
		return i_date;
	}

	public void setI_date(String i_date) {
		this.i_date = i_date;
	}

	public String getU_date() {
		return u_date;
	}

	public void setU_date(String u_date) {
		this.u_date = u_date;
	}

	public String getTracking_no() {
		return tracking_no;
	}

	public void setTracking_no(String tracking_no) {
		this.tracking_no = tracking_no;
	}

	public String getIs_paid_donation() {
		return is_paid_donation;
	}

	public void setIs_paid_donation(String is_paid_donation) {
		this.is_paid_donation = is_paid_donation;
	}

	public String getPayment_url() {
		return payment_url;
	}

	public void setPayment_url(String payment_url) {
		this.payment_url = payment_url;
	}

	public String getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(String donor_id) {
		this.donor_id = donor_id;
	}

	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNo_of_book() {
        return no_of_book;
    }

    public void setNo_of_book(String no_of_book) {
        this.no_of_book = no_of_book;
    }

    public String getNo_of_cartons() {
        return no_of_cartons;
    }

    public void setNo_of_cartons(String no_of_cartons) {
        this.no_of_cartons = no_of_cartons;
    }

    public String getPickup_date_time() {
        return pickup_date_time;
    }

    public void setPickup_date_time(String pickup_date_time) {
        this.pickup_date_time = pickup_date_time;
    }

    public String getHow_do_u_know_abt_us() {
        return how_do_u_know_abt_us;
    }

    public void setHow_do_u_know_abt_us(String how_do_u_know_abt_us) {
        this.how_do_u_know_abt_us = how_do_u_know_abt_us;
    }
    
}
