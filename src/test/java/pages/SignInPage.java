package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver = null;
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='email_create']")
	private WebElement createEmailID;
	
	public void setCreateEmailID (String val) {
		createEmailID.sendKeys(val);
	}
	public WebElement getCreateEmailID() {
		return createEmailID;
	}
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElement createAccountButton;
	
	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailID;
	
	public void setEmailID (String val) {
		emailID.sendKeys(val);
	}
	public WebElement getEmailID() {
		return emailID;
	}

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	
	public void setPassword (String val) {
		password.sendKeys(val);
	}
	public WebElement getPassword() {
	return password;
	}
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement logInButton;
		
	public WebElement getLogInButton() {
		return logInButton;	
	}
	
	@FindBy (xpath = "//h1[contains(text(),'Authentication')]")
	private WebElement authentication;
	
	public WebElement getAuthentication() {
		return authentication;
	}
}
	
