package com.rtosystem.controller.admin;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rtosystem.models.VehicleRegistration;
import com.rtosystem.pdf.PDFGenerator;
import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class ViewRegistrationForm
 */
@WebServlet("/ViewRegistrationForm")
public class ViewRegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[C]----ViewRegistrationForm");
		
		 response.setContentType("application/pdf");
		 OutputStream out=response.getOutputStream();
		 
		if ((String) request.getAttribute("admin") != null) {
			int id = Integer.parseInt(request.getParameter("id"));
			
			RTOSystem service = RTOSystemImpl.getInstence();
			VehicleRegistration vehicleRegistration = service.getVehileRegidtrationById(id);

			PDFGenerator.vehicleRegistrationForm(out, vehicleRegistration);
	
		}
	}
}
