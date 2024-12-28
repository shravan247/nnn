package generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends utilityTest implements ITestListener {


	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		takeSS(result.getTestContext().getName() + "_" + result.getMethod().getMethodName() + ".png");

	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Starting");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test failed with timeout");
	}

}
