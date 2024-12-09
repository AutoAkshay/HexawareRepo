package session45_ExcelSheetDemo;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInExcelSheet {

	//Creates excel work and sheet automatically and no need to create own sheet
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("ExampleSheet");
		
		Row row = sheet.createRow(0);
		
		Cell cell1 = row.createCell(0);
		cell1.setCellValue("Hello Fucking world");

		Cell cell2 = row.createCell(1);
		cell2.setCellValue("World");

		Cell cell3 = row.createCell(2);
		cell3.setCellValue(123);

		Cell cell4 = row.createCell(3);
		cell4.setCellValue(true);

		FileOutputStream fileOut = new FileOutputStream("C:\\Software\\ExcelSheet2.xlsx");
		
		workbook.write(fileOut);
		workbook.close();

		System.out.println("Excel file written successfully!");
	}

}
