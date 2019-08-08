package com.rtosystem.filehandler;

import java.io.File;
import java.util.List;

import org.apache.commons.fileupload.FileItem;

import com.rtosystem.controller.AppProperties;

public class HandleFile {
	
	private static HandleFile handleFile=null;
	private HandleFile() {}
	
	public static HandleFile getInstence() {
		if(handleFile==null)
			return new HandleFile();
		else
			return handleFile;
	}
	
	List<FileItem> items;
	public void setItems(List<FileItem> items) {
		this.items=items;
	}
	
	public String saveFile(int index,String number) throws Exception {
		String fileName = items.get(index).getName().replaceAll("\\s", "");
		fileName=number.substring(0,10)+"-"+((int)(Math.random()*100000))+fileName.substring(fileName.lastIndexOf("."), fileName.length());
		System.out.println("File : "+fileName+" is Saving");
		if(fileName != "") {
			String filePath = AppProperties.filePath+ fileName;
			File projectFile = new File(filePath);
			items.get(index).write(projectFile);
		}
		return fileName;
	}
}
