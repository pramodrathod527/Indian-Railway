package excelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.google.common.collect.Table.Cell;

public class Test {

	public static <XSSFWorkbook> void main(String[] args) throws Exception {

//		FileInputStream file = new FileInputStream("C:\\Users\\C zone\\Documents\\Book3.xlsx");
//		
//		//create a workbook
//		
//		Workbook workbook = new XSSFWorkbook(file);
//		
//		org.apache.poi.ss.usermodel.Sheet sheet1 = workbook.getSheetAt(0);
//		
//		Row row = sheet1.getRow(0);
//		org.apache.poi.ss.usermodel.Cell cell =row.getCell(0);
//		
//		System.out.println(sheet1.getRow(0).getCell(0));
		
		 File src = new File("C:\\Users\\C zone\\Documents\\Book3.xlsx");
		 
		 FileInputStream fis = new FileInputStream(src);
		 
		 org.apache.poi.xssf.usermodel.XSSFWorkbook workbook = new org.apache.poi.xssf.usermodel.XSSFWorkbook(fis);
		 
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();
		 
		 System.out.println(entry1);
		 
		 workbook.close();


	}

}
