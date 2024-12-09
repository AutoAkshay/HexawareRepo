package session1_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session4_CSSselector {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		// tag & id = tag#value-of id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//tag and attribute,value =  tag[attribute=value]
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
		
		//tag and classValue  = tag.classValue
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//tag,classValue,attribute and value = tag.classValue[attribute=value]		
		driver.findElement(By.cssSelector("div.inventory_item_name[data-test=inventory-item-name]")).click();
		
		driver.close();
		System.out.println("Test case is passed");
		
	}

}
