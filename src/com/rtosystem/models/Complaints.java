package com.rtosystem.models;

public class Complaints {
	private int id;
	private String name;
	private String number;
	private String mail;
	private String complaint;
	private boolean status;
	public Complaints() {
		super();
	}
	public Complaints(int id, String name, String number, String mail, String complaint, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.mail = mail;
		this.complaint = complaint;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
