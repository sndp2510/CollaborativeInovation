package com.qavelocity.communication.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static XSSFWorkbook wbook;
	static XSSFSheet sheet;
	XSSFCell cell;
	public static XSSFSheet setFile(String file) 
	{
		File f=new File(file);
			FileInputStream fis;													
			try {
				fis = new FileInputStream(f);
				wbook=new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
				sheet = wbook.getSheetAt(0);
				
				return sheet;
	}
	
	
}
