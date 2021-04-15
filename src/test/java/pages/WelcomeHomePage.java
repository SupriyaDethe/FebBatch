package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeHomePage {
	
	WebDriver driver = null;
	public WelcomeHomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='My account']")
	private WebElement MyAccountText;
	
	public WebElement getMyAccountText() {
		return MyAccountText;
	}

}
