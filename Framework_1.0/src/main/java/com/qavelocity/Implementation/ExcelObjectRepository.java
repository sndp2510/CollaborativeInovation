package com.qavelocity.Implementation;

import java.util.HashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qavelocity.architecture.IObjectRepository;

public class ExcelObjectRepository implements IObjectRepository{
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	@Override
	public  HashMap<String, String> getObjectProperties(String objectLogicalName) {		
		System.out.println("f");
		File f=new File("E:\\Ma Personal\\Keyword Driven Framework\\Projects\\Framework_1.0\\src\\main\\java\\com\\qavelocity\\data\\dataEngine.xlsx");
		System.out.println("g");
		FileInputStream fis;
		System.out.println("a");
		try {
			fis = new FileInputStream(f);
			System.out.println("b");
		workbook=new XSSFWorkbook(fis);
		System.out.println("c");
	    sheet = workbook.getSheet("Sheet1");
	    System.out.println("d");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//    System.out.println( getValue(objectLogicalName).toString());
	    HashMap<String,String> hmap=new LinkedHashMap<String,String>();
		for(int row=0;row<9;row++)
		{
			XSSFCell cell0 = sheet.getRow(row).getCell(0);
			String value = cell0.getStringCellValue();
			if (value.equalsIgnoreCase(objectLogicalName)) {
				
				XSSFRow row2 = cell0.getRow();
				int rowNum = row2.getRowNum();
				XSSFCell cell1 = sheet.getRow(rowNum).getCell(1);
				XSSFCell cell2 = sheet.getRow(rowNum).getCell(2);
				XSSFCell cell3 = sheet.getRow(rowNum).getCell(3);
				XSSFCell cell4 = sheet.getRow(rowNum).getCell(4);
				String Name=cell1.getStringCellValue();
				String Id=cell2.getStringCellValue();
				String Xpath=cell3.getStringCellValue();
				String Css=cell4.getStringCellValue();
				hmap.put("Name", Name);
				hmap.put("Id", Id);
				hmap.put("Xpath", Xpath);
				hmap.put("Css", Css);
			}
	
			
		}
	
		
		return hmap;
	
	}	
			
}
	
	
	
	
