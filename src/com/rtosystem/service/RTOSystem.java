package com.rtosystem.service;

import java.util.ArrayList;

import com.rtosystem.models.Complaints;
import com.rtosystem.models.License;
import com.rtosystem.models.VehicleRegistration;

public interface RTOSystem {
	public void applyLicence(String fullname,String email,String phno,String Address,String city,String pin,String type,String pic1,String bloodGroup,String pic2,String pic3);
	public void vehicleRegistration(String fullName,String phno,String email,String engineNumber,String licenseCopy,String rcBookCopy);
	public ArrayList<String> getAdmingIp();
	public ArrayList<License> getNewLicenseForms();
	public License getLicenseFormById(int id);
	public void verifyLicense(int id);
	public void rejectLicense(int id);
	public ArrayList<VehicleRegistration> getVehicleRegistrationForms();
	public VehicleRegistration getVehileRegidtrationById(int id);
	public void verifyVehicleRegistration(int id);
	public void rejectVehicleRegistration(int id);
	public boolean checkAvailableNumber(String number);
	public void registerComplaint(String name,String number,String email,String complaint);
	public ArrayList<Complaints> getAllComplaints();
	public Complaints getComplaintByID(int id);
}
