package session44_Chaining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class ExecutionInOneLine {
	
	@Test
	public void TC01() throws InterruptedException {
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		Actions actions=new Actions(driver);
		
		Action action=	actions.moveToElement(driver.findElement(By.name("username")))
						.click()
						.sendKeys("Admin",Keys.TAB)
						.sendKeys("admin123",Keys.ENTER).build();
		
		action.perform();
	}

}
