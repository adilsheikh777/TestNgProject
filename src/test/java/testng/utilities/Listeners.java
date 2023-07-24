package testng.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	
	public void onTestFailure(ITestResult result) {
		System.out.println("i failed execute and my name is  " + result.getName());
	}


	/*
	 * @Override public void onTestSuccess(ITestResult result) {
	 * System.out.println("sucessful test name is  " + result.getName()); }
	 */
	
}
