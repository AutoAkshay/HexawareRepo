package session49_ExtentReportDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		htmlReporter=new ExtentSparkReporter("ExtentReportDemo.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		reports.setSystemInfo("Machie", "testpc1");
		reports.setSystemInfo("OS", "Windows 10");
		reports.setSystemInfo("user", "Akshay");
		reports.setSystemInfo("Browser", "chrome");
		
		htmlReporter.config().setDocumentTitle("Extent report Demo");
		htmlReporter.config().setDocumentTitle("Test report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd,yyyy, hh:mm a '('zzz')'");		
	}
	
	@Test
	public void LaunchBrowser() {
		
		test=reports.createTest("Launch Browser");
		Assert.assertTrue(false);
	}
	
	@Test
	public void VerifyTitle() {
		
		test=reports.createTest("Verify Browser title");
		Assert.assertTrue(true);
	}
	
	@Test
	public void VerifyLogo() {
		
		test=reports.createTest("Verify Browser logo");
		Assert.assertTrue(true);
	}
	
	@Test
	public void VerifyEmail() {
		
		test=reports.createTest("Verify email...");
		throw new SkipException("Skip this test with exception");
	}
	
	@Test
	public void VerifyUserName() {
		
		test=reports.createTest("Verify email...");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void getTestResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAIL", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASS", ExtentColor.GREEN));
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIP", ExtentColor.AMBER));
			test.skip(result.getThrowable());
		}		
	}
	
	@AfterTest
	public void tearDown() {
		reports.flush();
	}

}

