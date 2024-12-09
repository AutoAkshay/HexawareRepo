package practice_selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetryAnalyzer {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.navigate().to("https://www.google.com/");
		
	}
	
	
} 



