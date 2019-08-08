package com.rtosystem.pdf;

import java.io.OutputStream;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.rtosystem.controller.AppProperties;
import com.rtosystem.models.Complaints;
import com.rtosystem.models.License;
import com.rtosystem.models.VehicleRegistration;

public class PDFGenerator {
	public static void licenseForm(OutputStream out,License license) {
		PdfWriter writer = new PdfWriter(out);
		 PdfDocument pdf = new PdfDocument(writer);
		 
		try {
			PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD); 
			Document document = new Document(pdf);
		
        Paragraph heading=new Paragraph("Licence Application Form");
        heading.setFont(font);
        heading.setPaddingLeft(140l);
        heading.setFontSize(20f);
       
                  
        ImageData data = ImageDataFactory.create(AppProperties.filePath+license.getPhoto());  
        Image img = new Image(data); 
        img.scaleAbsolute(100, 120);
        
        float [] ColumnWidths = {400F,50F}; 
        Table main = new Table(ColumnWidths);
        main.setBorder(Border.NO_BORDER);

        
        float [] pointColumnWidths = {140F, 300F}; 
        Table table = new Table(pointColumnWidths);
        table.setBorder(Border.NO_BORDER);
        

        table.addCell(new Cell().add("Full Name"));
        table.addCell(new Cell().add(license.getFullName()));
        
        table.addCell(new Cell().add("Contact Number"));
        table.addCell(new Cell().add(license.getNumber()));
        
        table.addCell(new Cell().add("Blood Group"));
        table.addCell(new Cell().add(license.getBloodgroup()));
        
        table.addCell(new Cell().add("Address"));
        table.addCell(new Cell().add(license.getAddress()));
        
        table.addCell(new Cell().add("City"));
        table.addCell(new Cell().add(license.getCity()));
        
        table.addCell(new Cell().add("PIN"));
        table.addCell(new Cell().add(license.getPin()));
        
        table.addCell(new Cell().add("Type"));
        table.addCell(new Cell().add(license.getType()));
        
        float [] widths = {450F}; 
        Table imageTable = new Table(widths);
        
        ImageData data2 = ImageDataFactory.create(AppProperties.filePath+license.getIdproof());  
        Image img2 = new Image(data2); 
        img2.scaleAbsolute(300, 220);
        
        ImageData data3 = ImageDataFactory.create(AppProperties.filePath+license.getEyefitness());  
        Image img3 = new Image(data3); 
        img3.scaleAbsolute(500,280);
        
        
        document.add(heading);
        main.addCell(table);
        main.addCell(img);
        
        imageTable.addCell(img2);
        
        imageTable.addCell(img3);
        
        document.add(main); 
        document.add(imageTable);
        
        document.close();
        writer.close();
        System.out.println("PDF Created");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void vehicleRegistrationForm(OutputStream out, VehicleRegistration vehicleRegistration) {

		PdfWriter writer = new PdfWriter(out);
		PdfDocument pdf = new PdfDocument(writer);
		 
		try {
			PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD); 
			Document document = new Document(pdf);
		
        Paragraph heading=new Paragraph("Vehicle Registration Form");
        heading.setFont(font);
        heading.setPaddingLeft(140l);
        heading.setFontSize(20f);

        
        float [] pointColumnWidths = {140F, 300F}; 
        Table table = new Table(pointColumnWidths);
        table.setBorder(Border.NO_BORDER);
        

        table.addCell(new Cell().add("Full Name"));
        table.addCell(new Cell().add(vehicleRegistration.getFullName()));
        
        table.addCell(new Cell().add("Contact Number"));
        table.addCell(new Cell().add(vehicleRegistration.getNumber()));

        table.addCell(new Cell().add("Email ID"));
        table.addCell(new Cell().add(vehicleRegistration.getEmail()));
        
        table.addCell(new Cell().add("Engine Number"));
        table.addCell(new Cell().add(vehicleRegistration.getEngineNumber()));
        
        float [] widths = {450F}; 
        Table imageTable = new Table(widths);
        
        ImageData data2 = ImageDataFactory.create(AppProperties.filePath+vehicleRegistration.getLicenseCopy());  
        Image img2 = new Image(data2); 
        img2.scaleAbsolute(300, 220);
        
        ImageData data3 = ImageDataFactory.create(AppProperties.filePath+vehicleRegistration.getRcbookCopy());  
        Image img3 = new Image(data3); 
        img3.scaleAbsolute(500,280);
        
        
        document.add(heading);
        document.add(table); 
        
        imageTable.addCell(img2);
        
        imageTable.addCell(img3);
        
        document.add(imageTable);
        
        document.close();
        writer.close();
        System.out.println("PDF Created");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void complaintForm(OutputStream out, Complaints complaints) {
		PdfWriter writer = new PdfWriter(out);
		PdfDocument pdf = new PdfDocument(writer);
		 
		try {
			PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD); 
			Document document = new Document(pdf);
		
        Paragraph heading=new Paragraph("Complaint Form");
        heading.setFont(font);
        heading.setPaddingLeft(140l);
        heading.setFontSize(20f);

        
        float [] pointColumnWidths = {140F, 300F}; 
        Table table = new Table(pointColumnWidths);
        table.setBorder(Border.NO_BORDER);
        

        table.addCell(new Cell().add("Full Name"));
        table.addCell(new Cell().add(complaints.getName()));
        
        table.addCell(new Cell().add("Contact Number"));
        table.addCell(new Cell().add(complaints.getNumber()));

        table.addCell(new Cell().add("Email ID"));
        table.addCell(new Cell().add(complaints.getMail()));

        
        
        document.add(heading);
        document.add(table); 
        
        Paragraph complaint=new Paragraph("\n\n		"+complaints.getComplaint());
        document.add(complaint);

        document.close();
        writer.close();
        System.out.println("PDF Created");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
