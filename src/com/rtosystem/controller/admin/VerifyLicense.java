package com.rtosystem.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rtosystem.models.License;
import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class LicenseForms
 */
@WebServlet("/VerifyLicense")
public class VerifyLicense extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[C]----VerifyLicense");
		if((String)request.getAttribute("admin")!=null){
			RTOSystem service = RTOSystemImpl.getInstence();
			ArrayList<License> licenses= service.getNewLicenseForms();
			request.getSession().setAttribute("forms", licenses);
			request.getRequestDispatcher("verifyLicense.jsp").forward(request, response);
		}
		else
			response.sendRedirect("index.jsp");
	}

}
