package session46_DataProviderWithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);

	}


	@Test(dataProvider = "searchDataProvider")
	public void searchKeyWord(String KeyWord) {
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(KeyWord);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	@DataProvider(name = "searchDataProvider")
	public Object[][] searchDataProvider() throws IOException{
		
		String path="C:\\Software\\SearchData.xlsx";
		Object[][] searchData=getExcelData(path,"sheet1");
		return searchData;
		
	}
	
	public String[][] getExcelData(String fileName,String sheetName) throws IOException{
		String data[][];
		FileInputStream inputStream=new FileInputStream(fileName);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		XSSFSheet sheet= workbook.getSheet(sheetName);
		
		int row=sheet.getLastRowNum()+1;
		int cell=sheet.getRow(0).getLastCellNum();
		
		data=new String[row-1][cell];
		for(int i=1;i<row;i++) {
			for(int j=0;j<cell;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		workbook.close();
		return data;
	}

	@AfterMethod
	public void tearDown() {
//		driver.close();
	}
}
