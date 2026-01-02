package java_programs.practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory{
	
	public static WebDriver driver() throws IOException {
		
		String browser=ReadPropertiesFile.browser();
		WebDriver driver;
		
		switch (browser.toLowerCase()) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		
		
		case "edge": 
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			 break;
		
		case "internet explorer": 
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		
		default: 
			throw new IllegalArgumentException("Invalid browser: "+browser);
		
		}
		
		return driver;
		
	}
}
