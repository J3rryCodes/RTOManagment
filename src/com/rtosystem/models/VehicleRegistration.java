package com.rtosystem.models;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistration {
	private int id;
	private String fullName;
	private String number;
	private String email;
	private String engineNumber;
	private String licenseCopy;
	private String rcbookCopy;
	private String status;
	
	
	
	public VehicleRegistration() {
		super();
	}



	public VehicleRegistration(int id, String fullName, String number, String email, String engineNumber,
			String licenseCopy, String rcbookCopy) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.number = number;
		this.email = email;
		this.engineNumber = engineNumber;
		this.licenseCopy = licenseCopy;
		this.rcbookCopy = rcbookCopy;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getEngineNumber() {
		return engineNumber;
	}



	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getLicenseCopy() {
		return licenseCopy;
	}

	public void setLicenseCopy(String licenseCopy) {
		this.licenseCopy = licenseCopy;
	}

	public String getRcbookCopy() {
		return rcbookCopy;
	}

	public void setRcbookCopy(String rcbookCopy) {
		this.rcbookCopy = rcbookCopy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
