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
import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;


/**
 * Servlet implementation class ApplyLicence
 */
@WebServlet("/applyForLicense")
public class ApplyLicence extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<FileItem> items;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[C]----applyForLicense");
		try {
			items = new ServletFileUpload(new DiskFileItemFactory())
					.parseRequest(new ServletRequestContext(request));
			
			// TO save File
			HandleFile handleFile = HandleFile.getInstence();
			//setting List<FileItem>
			handleFile.setItems(items);
			
			String fullName = items.get(0).getString();
			String email = items.get(1).getString();
			String phoneNumer = items.get(2).getString();
			String address = items.get(3).getString();
			String city = items.get(4).getString();
			String pin = items.get(5).getString();
			
			String type= items.get(6).getString();
			String photo = handleFile.saveFile(7,phoneNumer);
			String bGroup = items.get(8).getString();
			String eyeFitness = handleFile.saveFile(9,phoneNumer);
			String idProof = handleFile.saveFile(10,phoneNumer);
	
			
			RTOSystem rtoSystem = RTOSystemImpl.getInstence();
			rtoSystem.applyLicence(fullName,email, phoneNumer, address, city, pin,type, photo, bGroup, eyeFitness, idProof);
			
			String msg="Successfully registered we will notify Test date on "+email+" ";
			request.setAttribute("result", msg);
			request.getRequestDispatcher("replay.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
