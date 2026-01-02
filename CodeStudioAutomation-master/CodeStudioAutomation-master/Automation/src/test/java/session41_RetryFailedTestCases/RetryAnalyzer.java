package session41_RetryFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int countOfRety=0;
	int setLimit=3;
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()) {
			if(countOfRety<setLimit) {
				countOfRety++;
				return true;
			}
		}
		return false;
	}
	
//	int countRetryAttempt=0;
//	int setMaxLimitForRetry=3;
//	@Override
//	public boolean retry(ITestResult result) {
//		if (!result.isSuccess()) {
//			if (countRetryAttempt < setMaxLimitForRetry) {
//
//				countRetryAttempt++;
//				return true;
//			}
//		}
//
//		return false;
//	}
	
	
	
//	@Override
//	public boolean retry(ITestResult result) {
//		if(!result.isSuccess()) {
//			if(countRetryAttempt<setMaxLimitForRetry) {
//				countRetryAttempt++;
//				return true;
//			}
//		}
//		return false;
//	}
}
