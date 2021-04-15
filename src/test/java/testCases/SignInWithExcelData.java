package testCases;

import org.testng.annotations.Test;

import base.TestBase;

public class SignInWithExcelData extends TestBase {
	
  @Test
  public void readExcel() throws InterruptedException {
	  
	  int rowCount = datatable.getRowCount("logincred");
	  String username = datatable.getCellData("logincred", "username", 2);
	  String password = datatable.getCellData("logincred", "password", 2);
	  
	  System.out.println("Row count of sheet is " + rowCount );
	  System.out.println("Username is " + username);
	  System.out.println("Password is " + password );
	  
	  homePageObj.getSignIn().click();
	  signInPageObj.setEmailID(username);
	  signInPageObj.setPassword(password);
	  Thread.sleep(5000);
	  signInPageObj.getLogInButton().click();
	  Thread.sleep(5000);

  }
}
