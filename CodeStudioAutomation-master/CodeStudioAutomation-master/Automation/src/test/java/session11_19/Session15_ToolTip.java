package session11_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Session15_ToolTip {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		String toolTip=driver.findElement(By.name("q")).getAttribute("title");
		
		System.out.println("Tool Tip:: "+toolTip);
		
		String expectedToolTip="Search for Products, Brands and More";
		
		Assert.assertEquals(toolTip, expectedToolTip,"Not matched");
	}

}
