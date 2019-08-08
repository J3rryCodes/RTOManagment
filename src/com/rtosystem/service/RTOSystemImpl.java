package com.rtosystem.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.rtosystem.dao.DBConnection;
import com.rtosystem.models.Complaints;
import com.rtosystem.models.License;
import com.rtosystem.models.VehicleRegistration;

public class RTOSystemImpl implements RTOSystem {
	private static RTOSystemImpl rtoSystemImpl;
	private DBConnection dbConnection;

	private RTOSystemImpl() {
		dbConnection = new DBConnection();
	}

	public static RTOSystemImpl getInstence() {
		if (rtoSystemImpl == null)
			rtoSystemImpl = new RTOSystemImpl();
		return rtoSystemImpl;
	}

	@Override
	public void applyLicence(String fullname,String email, String phno, String Address, String city, String pin,String type, String pic1,
			String bloodGroup, String pic2, String pic3) {
		
		System.out.println("    [S]----applyLicence");
		String sql = "insert into license(fullname,email,phno,address,city,pin,type,photo,bloodgroup,eyefitness,idproof,status) values('"
				+ fullname + "','"+email+"','" + phno + "','" + Address + "','" + city + "','" + pin + "','"+ type + "','" + pic1 + "','"
				+ bloodGroup + "','" + pic2 + "','" + pic3 + "',0)";
System.out.println(sql);
		dbConnection.putData(sql);
	}

	@Override
	public void vehicleRegistration(String fullName, String phno,String email, String engineNumber, String licenseCopy,
			String rcBookCopy) {
		System.out.println("    [S]----vehicleRegistration");
		String sql = "insert into VehicleRegistration(fullName,phno,email,engineNumber,licenseCopy,rcbookCopy,status) values('"
				+ fullName + "','" + phno + "','"+ email + "','" + engineNumber + "','" + licenseCopy + "','" + rcBookCopy + "',0)";
		
		dbConnection.putData(sql);

	}

	@Override
	public ArrayList<String> getAdmingIp() {
		System.out.println("    [S]----");
		String sql="select ipAddress from AdminIP";
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs=dbConnection.getData(sql);
		try {
			while(rs.next())
				list.add(rs.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<License> getNewLicenseForms() {
		System.out.println("    [S]----getNewLicenseForms");
		ArrayList<License> list =new ArrayList<License>();
		String sql = "select * from license where status=0";
		
		ResultSet rs=dbConnection.getData(sql);
		try {
			while(rs.next()) {
				list.add(new License(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
						rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getBoolean(13)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public License getLicenseFormById(int id) {
		System.out.println("    [S]----getLicenseFormById");
		String sql = "select * from license where id="+id;
		License license = null;
		ResultSet rs=dbConnection.getData(sql);
		try {
			license = (rs.next())? new License(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
					rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getBoolean(13)
					) : null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return license;
	}

	@Override
	public void verifyLicense(int id) {
		System.out.println("    [S]----verifyLicense");
		String sql = "update license set status=1 where id="+id;
		dbConnection.updateData(sql);
	}

	@Override
	public void rejectLicense(int id) {
		System.out.println("    [S]----rejectLicense");
		String sql = "update License set status=2 where id="+id;
		dbConnection.updateData(sql);
	}

	@Override
	public ArrayList<VehicleRegistration> getVehicleRegistrationForms() {
		System.out.println("    [S]----getVehicleRegistrationForms");
		String sql = "select * from VehicleRegistration where status=0";
		ArrayList<VehicleRegistration> list=new ArrayList<VehicleRegistration>();
		try {
			ResultSet rs= dbConnection.getData(sql);
			while(rs.next())
				list.add(new VehicleRegistration(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7)));
		}catch(Exception e) { e.printStackTrace();}
		
		return list;
	}

	@Override
	public VehicleRegistration getVehileRegidtrationById(int id) {
		System.out.println("    [S]----getVehileRegidtrationById");
		String sql = "select * from VehicleRegistration where id="+id;
		try {
			ResultSet rs= dbConnection.getData(sql);
			return (rs.next())? new VehicleRegistration(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7)) : null;
		}catch(Exception e) { e.printStackTrace();}
		
		return null;
	}

	@Override
	public void verifyVehicleRegistration(int id) {
		System.out.println("    [S]----verifyVehicleRegistration");
		String sql = "update VehicleRegistration set status=1 where id="+id;
		dbConnection.updateData(sql);
	}

	@Override
	public void rejectVehicleRegistration(int id) {
		System.out.println("    [S]----rejectVehicleRegistration");
		String sql = "update VehicleRegistration set status=2 where id="+id;
		dbConnection.updateData(sql);
	}

	@Override
	public boolean checkAvailableNumber(String number) {
		String sql="select * from VehicleNumber where reg_no="+number;
		ResultSet rs=dbConnection.getData(sql);
		boolean b=false;
		try {
			b= rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public void registerComplaint(String name, String number, String email, String complaint) {
		System.out.println("    [S]----registerComplaint");
		String sql="insert into Complaints(name,number,mail,complaint,status) values('"+name+"','"+number+"','"+
	email+"','"+complaint+"',0)";
		dbConnection.putData(sql);
	
	}

	@Override
	public ArrayList<Complaints> getAllComplaints() {
		System.out.println("    [S]----getAllComplaints");
		ArrayList<Complaints> list=new ArrayList<Complaints>();
		String sql = "select * from complaints where status=0";
		ResultSet rs=dbConnection.getData(sql);
		try {
			while(rs.next())
				list.add(new Complaints(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),
						rs.getBoolean(6)));
		}catch(Exception e) {e.printStackTrace();}
		return list;
	}

	@Override
	public Complaints getComplaintByID(int id) {
		System.out.println("    [S]----getComplaintByID");

		String sql = "select * from complaints where id="+id;
		ResultSet rs=dbConnection.getData(sql);
		try {
			return (rs.next())? new Complaints(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),
					rs.getBoolean(6)) : null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
