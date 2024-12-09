package session40_CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void LauchBrowser(String broswer) throws InterruptedException {
		
		switch (broswer.toLowerCase()){
		case "chrome": 
		{
			
			System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver(options);

			driver.manage().window().maximize();
			break;
		}
		
		case "edge": 
		{
			
			System.setProperty("webdriver.edge.driver", "C:\\Software\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			break;
		}
		
		case "firefox": 
		{
			
			System.setProperty("webdriver.edge.driver", "C:\\Software\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + broswer.toLowerCase());
		}
	
	
	}
	
	@Test
	public void verifyTitle() {
		
		driver.get("https://www.google.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		
		Assert.assertEquals(actualTitle, expectedTitle,"Tile not matched");
	}
	
	@AfterMethod
	public void tearDownBrowser() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
		driver.quit();
	}

}
