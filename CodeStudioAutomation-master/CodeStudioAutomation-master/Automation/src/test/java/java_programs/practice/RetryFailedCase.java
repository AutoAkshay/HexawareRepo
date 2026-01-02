package java_programs.practice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedCase implements IRetryAnalyzer {

	int count = 0;
	int attemptToRetry = 2;

	@Override
	public boolean retry(ITestResult result) {
		
		if (!result.isSuccess()) {
			if (count < attemptToRetry) {
				count++;
				
				return true;
			}
			
			
		}
		return false;
	}
}