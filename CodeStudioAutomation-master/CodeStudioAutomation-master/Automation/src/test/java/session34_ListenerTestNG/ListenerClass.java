package session34_ListenerTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test case is started::"+result.getName());
	  }

	  public void onTestSuccess(ITestResult result) {
	    System.out.println("Test case is succesfully run::"+result.getName());
	  }

	  
	  public void onTestFailure(ITestResult result) {
	    System.out.println("Test case is failed::"+result.getName());
	  }

	 
	  public void onTestSkipped(ITestResult result) {
	    System.out.println("Test case is skipped::"+result.getName());
	  }

	 
	  public void onStart(ITestContext context) {
	    System.out.println("Test case is started::"+context.getName());
	  }

	 
	  public void onFinish(ITestContext context) {
	    System.out.println("Test case is finished::"+context.getName());
	  }
	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    
	  }

	 
	  public void onTestFailedWithTimeout(ITestResult result) {
	    
	  }

}
