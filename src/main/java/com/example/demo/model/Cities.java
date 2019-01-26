package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //lets it know that there is some mapping
@Table(name="cities")
public class Cities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id", nullable = false, unique = true)
	private int cityId;
	
	@Column(name="state_id", nullable=false, unique=true)
	private int stateId;
	
	@Column(name = "city", nullable = false, unique=true)
	private String city;

	public Cities() {
		
	}

	public Cities(String city) {
		this.city = city;
	}

	public int getCityId() {
		return cityId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
