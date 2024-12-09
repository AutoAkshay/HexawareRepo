package session35_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	WebDriver driver;
	@Test
	public void testMethod() {		
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		SoftAssert softAssert=new SoftAssert();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		System.out.println("Verifying title...");
		String actualTitle=driver.getTitle();
		System.out.println("Title of URL::"+actualTitle);
		String expectedTitle="Automation Testing Practice1";
		softAssert.assertEquals(actualTitle, expectedTitle,"Title not matched");
		
		System.out.println("Wikipedia icon::");
		WebElement icon= driver.findElement(By.className("wikipedia-icon"));
		softAssert.assertTrue(icon.isDisplayed(),"Icon not matched");
		
		System.out.println("Wikipedia search icon::");
		WebElement searchBtn=driver.findElement(By.className("wikipedia-search-button"));
		softAssert.assertTrue(searchBtn.isDisplayed(),"Button not matched");
		
		driver.close();
		
		//assert.All will pass all validation forcefully
		softAssert.assertAll();
		
		
	}

}
