package com.qavelocity.Implementation;

import com.qavelocity.architecture.IObjectRepository;

public class Controller {

	public static void main(String[] args) {
		String channelType = "excel";
		
		IObjectRepository myObject = null;
		
		if ((channelType.contentEquals("db"))) {

			myObject = new DatabaseObjectRepository();
		}else{
			myObject = new ExcelObjectRepository();
		}
		
		
		
		myObject.getObjectProperties("userNme");
	}

}
