package session45_ExcelSheetDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelSheetDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		
		File file=new File("C:\\Software\\ExcelSheet.xlsx");
		
		FileInputStream inputStream=new FileInputStream(file);
		
		workbook=new XSSFWorkbook(inputStream);
		sheet=workbook.getSheetAt(0);
		int totalRow=sheet.getLastRowNum()+1;
		int totalCell=sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<totalRow;i++) {
			
			System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver(options);

			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
			
			driver.findElement(By.id("user-name")).sendKeys(sheet.getRow(i).getCell(0).toString());
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(i).getCell(1).toString());
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(5000);
			for (int j = 0; j < totalCell; j++) {
				
				System.out.print(sheet.getRow(i).getCell(j).toString());
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
		workbook.close();
	}

}
