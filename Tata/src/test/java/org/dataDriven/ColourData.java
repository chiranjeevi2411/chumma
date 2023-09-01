package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColourData {

	public static void main(String[] args) throws Exception {
		
		File file = new File ("C:\\Users\\DURAI\\eclipse-workspace\\Tata\\sheet\\XSSF.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet = wb.createSheet("coloursheet");
		XSSFRow Row = Sheet.createRow(0);
		
		XSSFCellStyle Style = wb.createCellStyle();
		Style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		Style.setFillPattern(FillPatternType.SQUARES);
		
		XSSFCell Cell = Row.createCell(1);
		Cell.setCellValue("CHIRANJEEVI");
		Cell.setCellStyle(Style);
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}

}
