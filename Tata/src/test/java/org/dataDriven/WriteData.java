package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\DURAI\\eclipse-workspace\\Tata\\sheet\\XSSF.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet createSheet = wb.createSheet("chiranjeevi");
        XSSFRow createRow = createSheet.createRow(0);
        XSSFCell createCell = createRow.createCell(0);
        createCell.setCellValue("username");
        
        
        wb.getSheet("chiranjeevi").getRow(0).createCell(1).setCellValue("Password");
        wb.getSheet("chiranjeevi").getRow(0).createCell(2).setCellValue("location");
        
        wb.getSheet("chiranjeevi").createRow(1).createCell(0).setCellValue("chiranjeevi");
        wb.getSheet("chiranjeevi").getRow(1).createCell(1).setCellValue("password123");
        wb.getSheet("chiranjeevi").getRow(1).createCell(2).setCellValue("chennai");
        
        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);
        wb.close();
	}

}
