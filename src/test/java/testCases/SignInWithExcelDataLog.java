package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class SignInWithExcelDataLog extends TestBase {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	
  @Test (groups = {"SignIn", "RegressionTest"}, dependsOnMethods = {"LogInTestCase_02"})
  public void LogInTestCase_01() throws InterruptedException {
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  logger = extent.startTest(TestcaseId, "test1 i am running");
	  
	  log.info("fetc the usrename and password from excelsheel");
	  logger.log(LogStatus.INFO, "fetc the usrename and password from excelsheel");
	  
	  int rowCount = datatable.getRowCount("logincred");
	  String username = datatable.getCellData("logincred", "username", 2);
	  String password = datatable.getCellData("logincred", "password", 2);
	  
	  log.info("Row count of sheet is " + rowCount );
	  log.info("Username is " + username);
	  log.info("Password is " + password );
	  
	  homePageObj.getSignIn().click();
	  signInPageObj.setEmailID(username);
	  signInPageObj.setPassword(password);
	  Thread.sleep(5000);
	  signInPageObj.getLogInButton().click();
	  Thread.sleep(5000);
	  
	  try {
		  if(welcomeHomePageObj.getMyAccountText().getText().equals("MY ACCOUNT")) {
			  log.info("Logged In successfully ");
			  logger.log(LogStatus.PASS, "Text Pass");
			  Assert.assertTrue(true);
		  }
	  }
	  catch (Exception e) {
		  log.error("Logged In Failed ");
		  logger.log(LogStatus.FAIL, "Test Failed due to mismatch og ID and Password");
		  Assert.assertTrue(false);	  
	}
  }
  
  @Test (groups = {"SignIn", "SmokeTest", "RegressionTest"})
  public void LogInTestCase_02() throws InterruptedException {
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  logger = extent.startTest(TestcaseId, "test2 i am running");
	  
	  log.info("fetc the usrename and password from excelsheel");
	  logger.log(LogStatus.INFO, "fetc the usrename and password from excelsheel");
	  
	  int rowCount = datatable.getRowCount("logincred");
	  String username = datatable.getCellData("logincred", "username", 3);
	  String password = datatable.getCellData("logincred", "password", 3);
	  
	  log.info("Row count of sheet is " + rowCount );
	  log.info("Username is " + username);
	  log.info("Password is " + password );
	  
	  homePageObj.getSignIn().click();
	  signInPageObj.setEmailID(username);
	  signInPageObj.setPassword(password);
	  Thread.sleep(5000);
	  signInPageObj.getLogInButton().click();
	  Thread.sleep(5000);
	  
	  try {
		  if(welcomeHomePageObj.getMyAccountText().getText().equals("MY ACCOUNT")) {
			  log.info("Logged In successfully ");
			  logger.log(LogStatus.PASS, "Text Pass");
			  Assert.assertTrue(true);
		  }
	  }
	  catch (Exception e) {
		  log.error("Logged In Failed ");
		  logger.log(LogStatus.FAIL, "Test Failed due to mismatch og ID and Password");
		  Assert.assertTrue(false);
	}
  }
}
