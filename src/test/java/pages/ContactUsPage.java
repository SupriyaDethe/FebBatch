package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
	WebDriver driver = null;
	public ContactUsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//select[@id='id_contact']")
	private WebElement subjectHeading;
	
	public void SetSubjectHeading (String val) {
		subjectHeading.sendKeys(val);
	}
	
	public WebElement getSubjectHeading() {
		return subjectHeading;
	}
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement email;
	
	public void SetEmail (String val) {
		email.sendKeys(val);
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	@FindBy (xpath = "//input[@id='id_order']")
	private WebElement orderReference;
	
	public void SetOrderReference (String val) {
		orderReference.sendKeys(val);
	}
	
	public WebElement getOrderReference() {
		return orderReference;
	}
	
	@FindBy (xpath = "//textarea[@id='message']")
	private WebElement message;
	
	public void SetMessage (String val) {
		message.sendKeys(val);
	}
	
	public WebElement getMessage() {
		return message;
	}
	
	@FindBy (xpath = "//button[@id='submitMessage']")
	private WebElement sendButton;
	
	public WebElement getSendButton() {
		return sendButton;
	}
	
	@FindBy (xpath = "//h1[contains(text(),'Customer service - Contact us')]")
	private WebElement contactUs;
	
	public WebElement getContactUs() {
		return contactUs;
	}
	
}
