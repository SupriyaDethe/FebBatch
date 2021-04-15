package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTest extends TestBase {
	
	@Test (groups = {"HomePage", "SmokeTest", "RegressionTest"})
	void contactUsPage_01() throws InterruptedException {
		
		String ContactUsPageText = "CUSTOMER SERVICE - CONTACT US";
		homePageObj.getContactUs().click();
		Thread.sleep(3000);
		String TextFromWeb = contactUsPageObj.getContactUs().getText();
		Assert.assertEquals(ContactUsPageText, TextFromWeb);
	}
	
	@Test (groups = {"HomePage", "RegressionTest"}, invocationCount = 3)
	void signInPage_01() throws InterruptedException {
		
		String SignInPageText = "AUTHENTICATION";
		homePageObj.getSignIn().click();
		Thread.sleep(3000);
		String TextFromWeb1 = signInPageObj.getAuthentication().getText();
		Assert.assertEquals(SignInPageText, TextFromWeb1);
	}

}
