package session34_ListenerTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//uncomment if want to run from here
//@Listeners(session34_ListenerTestNG.ListenerClass.class)
public class ListenDemo {

	WebDriver driver;
	@Test
	public void OrangeDemo() {
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
	
	@Test
	public void failedTestCase() {
		System.out.println("TC is failed...");
		Assert.assertTrue(false);
	}
	
	@Test
	public void skippedTestCase() {
		System.out.println("TC is skipped...");
		throw new SkipException("Test is skipped");
	}
}
