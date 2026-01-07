package hybridFramework.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import hybridFramework.properties.ReadPropertiesFile;
//import java_programs.hybridFramework.ReadPropertiesFilFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;

public class DriverFactory {

	public static WebDriver driver() throws IOException {
		ReadPropertiesFile propertiesFile=new ReadPropertiesFile();
		String browser= propertiesFile.browser();
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
		
		case "safari":
			driver=new SafariDriver();
			break;
		
		default: 
			throw new IllegalArgumentException("Invalid browser: "+browser);
		
		}
		
		return driver;
		
	}
}
