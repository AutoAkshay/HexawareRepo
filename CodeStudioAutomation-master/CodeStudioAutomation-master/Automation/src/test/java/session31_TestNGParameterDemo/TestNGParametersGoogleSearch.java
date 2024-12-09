package session31_TestNGParameterDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersGoogleSearch {
	
	@Parameters({"keyword"})
	@Test
	public void googleSearch(String searchData) throws AWTException {
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(searchData);
		
		Assert.assertEquals(searchData, searchBox.getAttribute("value"));
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
//		driver.quit();
	}

}
