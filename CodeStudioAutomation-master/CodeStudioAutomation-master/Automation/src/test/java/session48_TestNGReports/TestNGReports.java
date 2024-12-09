package session48_TestNGReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import session52_ReadFromPropertyFile.ReadFileConfig;

public class TestNGReports {
	
	@Test
	public void TC() throws InterruptedException, IOException {
	
	System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
	WebDriver driver=new ChromeDriver(options);
	Reporter.log("Browser opened...");
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Reporter.log("URL opened....");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Reporter.log("username entered....");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Reporter.log("password entered....");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Reporter.log("submit button entered....");
	Reporter.log("And finally successful login....");
}

}
