package project_listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testCases.LogTest;

public class Listener implements ITestListener {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	
	public void onTestStart(ITestResult result) {
		//called
		// TODO Auto-generated method stub
		log.info("New Test Started " +result.getName());
	}

	public void onTestSuccess(ITestResult result) { //called
		// TODO Auto-generated method stub
		log.info("Test Successfully Finished " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.error("Test Failed " +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test Skipped " +result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		log.error("Test Failed But Within Success Percentage " +result.getName());
	}

	public void onStart(ITestContext context) { //called
		// TODO Auto-generated method stub
		log.info("This is onStart Method " +context.getOutputDirectory());
	}

	public void onFinish(ITestContext context) { //called
		// TODO Auto-generated method stub
		log.info("This is OnFinish Method " +context.getPassedTests());
		log.info("This is OnFinish Method " +context.getFailedTests());
	}


}
