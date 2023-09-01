package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadData {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\DURAI\\eclipse-workspace\\Tata\\sheet\\XSSF.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		
		System.out.println(cell);
		

	}

}
