package session52_ReadFromPropertyFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadFromPropertyFile {
	
		@Test
		public void TC() throws InterruptedException, IOException {
		
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		Reporter.log("Browser opened...");
		ReadFileConfig config=new ReadFileConfig();
		
		driver.get(config.getURL());
		Reporter.log("URL opened....");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(config.getUserName());
		driver.findElement(By.name("password")).sendKeys(config.getPassword());
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Reporter.log("Successful login....");
	}

}
