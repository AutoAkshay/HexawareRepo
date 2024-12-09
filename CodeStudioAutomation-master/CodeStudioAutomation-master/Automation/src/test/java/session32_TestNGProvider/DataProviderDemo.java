package session32_TestNGProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	
	@Test(dataProvider = "searchDataSet",dataProviderClass = DataMethodProvider.class)
	public void TestCaseGoogleSearch(String country,String monument) {
		
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(country+" "+monument);
		
		driver.findElement(By.name("btnK")).submit();
	}

}
