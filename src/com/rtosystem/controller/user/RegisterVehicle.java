package com.rtosystem.controller.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import com.rtosystem.filehandler.HandleFile;
import com.rtosystem.service.RTOSystemImpl;

/**
 * Servlet implementation class RegisterVehicle
 */
@WebServlet("/RegisterVehicle")
public class RegisterVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<FileItem> items;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[C]----RegisterVehicle");
		try {
			items = new ServletFileUpload(new DiskFileItemFactory())
					.parseRequest(new ServletRequestContext(request));
			
			// TO save File
			HandleFile handleFile = HandleFile.getInstence();
			//setting List<FileItem>
			handleFile.setItems(items);
			
			String fullName = items.get(0).getString();
			String phoneNumer = items.get(1).getString();
			String email = items.get(2).getString();
			
			String engineNo = items.get(3).getString();
			String licenseCopy = handleFile.saveFile(4,phoneNumer);
			String ecBookCopy = handleFile.saveFile(5,phoneNumer);
	
			
			RTOSystemImpl.getInstence().vehicleRegistration(fullName, phoneNumer,email, engineNo, licenseCopy, ecBookCopy);
		
			String msg="Successfully registered your Vehicle we will notify registration date on "+email+" ";
			request.setAttribute("result", msg);
			request.getRequestDispatcher("replay.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
