package session1_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session1_BoxDimesion {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement fontSize= driver.findElement(By.name("q"));
		
		
		Dimension dimension=fontSize.getSize();
		Dimension dimensi1=fontSize.getSize();
		System.out.println("===================");
		System.out.println("height::"+dimension.height);
		System.out.println("Width::"+dimension.width);
		
		
	}

}
