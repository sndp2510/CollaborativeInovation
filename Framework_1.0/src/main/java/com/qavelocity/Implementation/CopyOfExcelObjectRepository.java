package com.qavelocity.Implementation;

import java.util.HashMap;







import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.qavelocity.architecture.IObjectRepository;
import com.qavelocity.communication.excel.Exceldata;

public class CopyOfExcelObjectRepository implements IObjectRepository{


	XSSFCell cell,cell1,cell2;
	@Override
	public HashMap<String, String> getObjectProperties(String objectLogicalName) {
		
	XSSFSheet Sheet = Exceldata.setFile("E:\\Ma Personal\\Keyword Driven Framework\\Framework\\Framework_1.0\\src\\main\\java\\com\\qavelocity\\data");	
	for(int row=0;row<9;row++)
	{
		 cell = Sheet.getRow(row).getCell(0);
		String cellvalue = cell.getStringCellValue();
		
		if(cellvalue.equalsIgnoreCase("obj1"))
		{
		XSSFRow row2 = Sheet.getRow(row);	
		}

	}


		;
		return null;
	}
}
