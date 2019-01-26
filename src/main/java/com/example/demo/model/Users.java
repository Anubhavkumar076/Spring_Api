package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//***************************In Model******************//
@Entity //lets it know that there is some mapping
@Table(name="users")
public class Users {
	@Id
	@Column(name = "id")
	private int id;
	private String first_name;
  private String last_name;
	private String email;
  private String alternative_email;
  private String password;
  private String user_role_id;
  private String avatar;
  private String birth_date;
  private String communication_address;
  private String mobile;
  private String contact_no;
  private String profession;
  private String contribution;
  private String profile_percentage;
  private String is_volunteer;
  private String is_donor;
  private String is_customer;
  private String is_verified;
  private String is_deleted;
  private String is_active;
  private String i_date;
  private String i_by;
  private String u_date;
  private String u_by;
  private String registered_date;
  private String wallet_amount;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAlternative_email() {
		return alternative_email;
	}

	public void setAlternative_email(String alternative_email) {
		this.alternative_email = alternative_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(String user_role_id) {
		this.user_role_id = user_role_id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getCommunication_address() {
		return communication_address;
	}

	public void setCommunication_address(String communication_address) {
		this.communication_address = communication_address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getContribution() {
		return contribution;
	}

	public void setContribution(String contribution) {
		this.contribution = contribution;
	}

	public String getProfile_percentage() {
		return profile_percentage;
	}

	public void setProfile_percentage(String profile_percentage) {
		this.profile_percentage = profile_percentage;
	}

	public String getIs_volunteer() {
		return is_volunteer;
	}

	public void setIs_volunteer(String is_volunteer) {
		this.is_volunteer = is_volunteer;
	}

	public String getIs_donor() {
		return is_donor;
	}

	public void setIs_donor(String is_donor) {
		this.is_donor = is_donor;
	}

	public String getIs_customer() {
		return is_customer;
	}

	public void setIs_customer(String is_customer) {
		this.is_customer = is_customer;
	}

	public String getIs_verified() {
		return is_verified;
	}

	public void setIs_verified(String is_verified) {
		this.is_verified = is_verified;
	}

	public String getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(String is_deleted) {
		this.is_deleted = is_deleted;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getI_date() {
		return i_date;
	}

	public void setI_date(String i_date) {
		this.i_date = i_date;
	}

	public String getI_by() {
		return i_by;
	}

	public void setI_by(String i_by) {
		this.i_by = i_by;
	}

	public String getU_date() {
		return u_date;
	}

	public void setU_date(String u_date) {
		this.u_date = u_date;
	}

	public String getU_by() {
		return u_by;
	}

	public void setU_by(String u_by) {
		this.u_by = u_by;
	}

	public String getRegistered_date() {
		return registered_date;
	}

	public void setRegistered_date(String registered_date) {
		this.registered_date = registered_date;
	}

	public String getWallet_amount() {
		return wallet_amount;
	}

	public void setWallet_amount(String wallet_amount) {
		this.wallet_amount = wallet_amount;
	}
	
	
}