package java_programs.practice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryFailedcases implements IRetryAnalyzer {
	int countRetryAttempt = 0;
	int setMaxLimitForRetry = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if (countRetryAttempt<setMaxLimitForRetry) {
				countRetryAttempt++;
				return true;
			}
			
			
		}
		return false;
		
		
		
	}
}
