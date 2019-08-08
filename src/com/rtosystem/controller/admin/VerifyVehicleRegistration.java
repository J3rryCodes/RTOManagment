package com.rtosystem.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rtosystem.models.VehicleRegistration;
import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class VerifyVechileRegistration
 */
@WebServlet("/VehicleRegistration")
public class VerifyVehicleRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if((String)request.getAttribute("admin")!=null){
			System.out.println("[C]----VerifyVechileRegistration");
			RTOSystem service = RTOSystemImpl.getInstence();
			ArrayList<VehicleRegistration> list=service.getVehicleRegistrationForms();
			request.getSession().setAttribute("forms", list);
			request.getRequestDispatcher("verifyVechileRegistration.jsp").forward(request, response);
		}
		else
			response.sendRedirect("index.jsp");
	}

}
