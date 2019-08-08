package com.rtosystem.models;

public class License {
	private int id;
	private String fullName;
	private String email;
	private String number;
	private String address;
	private String city;
	private String pin;
	private String type;
	private String photo;
	private String bloodgroup;
	private String eyefitness;
	private String idproof;
	
	private boolean verified;
	
 

	public License() {
		super();
	}




	public License(int id, String fullName, String email, String number, String address, String city, String pin,
			String type, String photo, String bloodgroup, String eyefitness, String idproof, boolean verified) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.number = number;
		this.address = address;
		this.city = city;
		this.pin = pin;
		this.type = type;
		this.photo = photo;
		this.bloodgroup = bloodgroup;
		this.eyefitness = eyefitness;
		this.idproof = idproof;
		this.verified = verified;
	}




	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPin() {
		return pin;
	}



	public void setPin(String pin) {
		this.pin = pin;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}



	public String getBloodgroup() {
		return bloodgroup;
	}



	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}



	public String getEyefitness() {
		return eyefitness;
	}



	public void setEyefitness(String eyefitness) {
		this.eyefitness = eyefitness;
	}



	public String getIdproof() {
		return idproof;
	}



	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}



	public boolean isVerified() {
		return verified;
	}



	public void setVerified(boolean verified) {
		this.verified = verified;
	}


}
