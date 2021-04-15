package testCases;

import org.testng.annotations.Test;

import base.TestBase;

public class CreateAccountTestCases extends TestBase {
	
	@Test (groups = {"CreateAccount", "SmokeTest", "RegressionTest"})
	public void CreateAccountPageTest_01() {
		
		homePageObj.getSignIn().click();
		
		signInPageObj.setCreateEmailID("supriya040795@gmail.com");
		signInPageObj.getCreateAccountButton().click();
		
		createAccountPageObj.GetTitleMrs().click();
		createAccountPageObj.SetCustomerFirstName("Supriya");
		createAccountPageObj.SetCustomerLastName("Dethe");
		createAccountPageObj.SetPassword("123456");
		createAccountPageObj.SetDate("4  ");
		createAccountPageObj.SetMonth("July ");
		createAccountPageObj.SetYear("1995  ");
		createAccountPageObj.GetNewsLetter().click();
		
		createAccountPageObj.SetFirstName("supriya");
		createAccountPageObj.SetLastName("dethe");
		createAccountPageObj.SetCompanyName("ABC");
		createAccountPageObj.SetAddress1("near xyz college");
		createAccountPageObj.SetAddress2("Babanagar");
		createAccountPageObj.Setcity("Nanded");
		createAccountPageObj.SetState("California");
		createAccountPageObj.SetPostalCode("987654");
		createAccountPageObj.GetCountry().click();
		createAccountPageObj.SetMobileNumber("123456789");
		
	}
	
	@Test (groups = {"CreateAccount", "RegressionTest"})
	public void CreateAccountPageTest_02() {
		
		homePageObj.getSignIn().click();
		
		signInPageObj.setCreateEmailID("supriya@gmail.com");
		signInPageObj.getCreateAccountButton().click();
		
		createAccountPageObj.GetTitleMrs().click();
		createAccountPageObj.SetCustomerFirstName("Supriya");
		createAccountPageObj.SetCustomerLastName("Dethe");
		createAccountPageObj.SetPassword("1234567");
		createAccountPageObj.SetDate("4  ");
		createAccountPageObj.SetMonth("July ");
		createAccountPageObj.SetYear("1995  ");
		createAccountPageObj.GetNewsLetter().click();
		
		createAccountPageObj.SetFirstName("supriya");
		createAccountPageObj.SetLastName("dethe");
		createAccountPageObj.SetCompanyName("ABC");
		createAccountPageObj.SetAddress1("near xyz college");
		createAccountPageObj.SetAddress2("Babanagar");
		createAccountPageObj.Setcity("Nanded");
		createAccountPageObj.SetState("California");
		createAccountPageObj.SetPostalCode("987654");
		createAccountPageObj.GetCountry().click();
		createAccountPageObj.SetMobileNumber("123456789");
		
	}

}
