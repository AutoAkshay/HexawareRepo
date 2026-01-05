package hybridFramework.baseTest;

import hybridFramework.drivers.DriverFactory;
import hybridFramework.properties.ReadPropertiesFile;
import hybridFramework.utilities.CommonHelper;
//import java_programs.practice.CommonHelper;
//import java_programs.practice.DriverFactory;
//import java_programs.practice.ReadPropertiesFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseTest {
	
	public static WebDriver driver;
	public CommonHelper helper;
	public ReadPropertiesFile propertiesFile;
	Logger logger=LogManager.getLogger(BaseTest.class);
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test cases started..!!");
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		driver = DriverFactory.driver();
		driver.manage().window().maximize();
		helper=new CommonHelper(driver);
		propertiesFile = new ReadPropertiesFile();
		logger.info("Browser launched");
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) {
		if(driver!=null){
		driver.quit();
		}
		logger.info("Browser closed");	
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test cases finished..!!");
		
	}

}
