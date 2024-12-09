package java_programs.practice;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class SecondStarPattern {

	@Test(retryAnalyzer = retryFailedcases.class)
	public void tc01() {
		Assert.assertTrue(false);
	}
}
