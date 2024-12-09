package session1_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session7_CountHyperLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		
		System.out.println("Count of links::"+elements.size());
		int count=0;
		for(WebElement elString:elements) {
			System.out.println((++count)+"::"+elString.getText());
		}
		
	}

}
