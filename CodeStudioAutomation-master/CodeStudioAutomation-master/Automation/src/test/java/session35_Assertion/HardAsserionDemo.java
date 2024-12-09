package session35_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserionDemo {
	WebDriver driver;
	@Test
	public void testMethod() {		
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Verifying title...");
		String actualTitle=driver.getTitle();
		System.out.println("Title of URL::"+actualTitle);
		String expectedTitle="Automation Testing Practice";
		Assert.assertEquals(actualTitle, expectedTitle,"Title not matched");
		
		System.out.println("Wikipedia icon::");
		WebElement icon= driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());
		
		System.out.println("Wikipedia search icon::");
		WebElement searchBtn=driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(searchBtn.isDisplayed());
		
		driver.close();
		
		
	}

}
