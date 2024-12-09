package session47_ChromeHeadlessBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowserDemo {
	
	@Test
	public void headlessTesting() {
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		options.addArguments("--start-maximized");
		options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.google.com/");
		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys("TajMahal");
		searchBox.sendKeys(Keys.ENTER);
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
