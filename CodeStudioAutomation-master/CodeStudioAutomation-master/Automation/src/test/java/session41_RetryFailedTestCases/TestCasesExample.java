package session41_RetryFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesExample {

	@Test//(retryAnalyzer = RetryAnalyzer.class)//---> use when method to be retried at method level
	public void tc01() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void tc02() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void tc03() {
		Assert.assertTrue(true);
	}
}
