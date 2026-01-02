package java_programs.practice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	
	public static WebDriver driver;
	CommonHelper helper;
	ReadPropertiesFile propertiesFile;
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
		if(driver!=null)
		driver.quit();
		logger.info("Browser closed");	
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test cases finished..!!");
		
	}

}
