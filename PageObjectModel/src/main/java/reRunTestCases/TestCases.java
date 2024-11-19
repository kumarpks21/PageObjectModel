package reRunTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
@Test(retryAnalyzer=RetryAnalyzer.class)
	public void method1() {
	Assert.assertTrue(false);
	}
@Test
public void method2() {
	Assert.assertTrue(true);
}
@Test
public void method3() {
	Assert.assertTrue(true);
}
}
