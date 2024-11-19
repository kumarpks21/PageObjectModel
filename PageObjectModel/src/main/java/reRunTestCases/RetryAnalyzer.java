package reRunTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counterForRetryAttempt=0;
	int setMaxLimitForRetry=3;
	@Override
	public boolean retry(ITestResult result) {
		 if (counterForRetryAttempt < setMaxLimitForRetry) {
	            counterForRetryAttempt++;
	            return true;
	}
		 return false;
}
}
