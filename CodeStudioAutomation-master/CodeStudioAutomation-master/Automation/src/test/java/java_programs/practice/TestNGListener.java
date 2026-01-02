package java_programs.practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TestNGListener implements ITestListener {
	
	ExtentReports extentManager=ExtentManager.getReports();
	
	ThreadLocal<ExtentTest> test=new ThreadLocal<>();
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test case started..!! :: "+result.getName());
	    test.set(extentManager.createTest(result.getName()));
	  }

	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test case is successful..!! :: "+result.getName());
		  test.get().pass("Test case passed");
		  test.get().pass(result.getThrowable());
	  }

	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test case is failed..!! :: "+result.getName());
		  test.get().fail("Test case failed");
		  test.get().fail(result.getThrowable());
		  CommonHelper helper=new CommonHelper(BaseTest.driver);
		  helper.takeScreenShot();
	  }

	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test case is skipped..!! :: "+result.getName());
		  test.get().skip("Test case skipped");
		  test.get().skip(result.getThrowable());
	  }
	  
	  public void onStart(ITestContext context) {
		  System.out.println("All Test cases are started successfully..!! :: "+context.getName());
	  }

	  
	  public void onFinish(ITestContext context) {
		  System.out.println("All Test cases are finished successfully..!! :: "+context.getName());
		  extentManager.flush();
	  }

}
