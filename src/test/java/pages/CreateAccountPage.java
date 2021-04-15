package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	WebDriver driver = null;
	public CreateAccountPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='id_gender1']")
	private WebElement titleMr;
	
	public WebElement GetTitleMr() {
		return titleMr;
	}
	
	@FindBy (xpath = "//input[@id='id_gender2']")
	private WebElement titleMrs;
	
	public WebElement GetTitleMrs() {
		return titleMrs;
	}
	
	@FindBy (xpath = "//input[@id='customer_firstname']")
	private WebElement customerfirstName;
	
	public void SetCustomerFirstName(String val) {
		customerfirstName.sendKeys(val);
	}
	
	public WebElement GetCustomerFirstName() {
		return customerfirstName;
	}
	
	@FindBy (xpath = "//input[@id='customer_lastname']")
	private WebElement customerlastName;
	
	public void SetCustomerLastName(String val) {
		customerlastName.sendKeys(val);
	}
	
	public WebElement GetCustomerLastName() {
		return customerlastName;
	}
	
	@FindBy (xpath = "//input[@id='passwd']")
	private WebElement password;
	
	public void SetPassword(String val) {
		password.sendKeys(val);
	}
	
	public WebElement GetPassword() {
		return password;
	}
	
	@FindBy (xpath = "//select[@id='days']")
	private WebElement date;
	
	public void SetDate(String val) {
		date.sendKeys(val);
	}
	
	public WebElement GetDate() {
		return date;
	}
	
	@FindBy (xpath = "//select[@id='months']")
	private WebElement month;
	
	public void SetMonth(String val) {
		month.sendKeys(val);
	}
	
	public WebElement GetMonth() {
		return month;
	}
	
	@FindBy (xpath = "//select[@id='years']")
	private WebElement year;
	
	public void SetYear(String val) {
		year.sendKeys(val);
	}
	
	public WebElement GetYear() {
		return year;
	}
	
	@FindBy (xpath = "//input[@id='newsletter']")
	private WebElement newsLetter;
	
	public WebElement GetNewsLetter() {
		return newsLetter;
	}
	
	@FindBy (xpath = "//input[@id='optin']")
	private WebElement receiveSpecislOffer;
	
	public WebElement GetReceiveSpecialOffer() {
		return receiveSpecislOffer;
	}
	
	@FindBy (xpath = "//input[@id='firstname']")
	private WebElement firstName;
	
	public void SetFirstName (String val) {
		firstName.sendKeys(val);
	}
	
	public WebElement GetFirstName() {
		return firstName;
	}
	
	@FindBy (xpath = "//input[@id='lastname']")
	private WebElement lastName;
	
	public void SetLastName (String val) {
		lastName.sendKeys(val);
	}
	
	public WebElement GetLastName() {
		return lastName;
	}
	
	@FindBy (xpath = "//input[@id='company']")
	private WebElement companyName;
	
	public void SetCompanyName (String val) {
		companyName.sendKeys(val);
	}
	
	public WebElement GetCompanyName() {
		return companyName;
	}
	
	@FindBy (xpath = "//input[@id='address1']")
	private WebElement address1;
	
	public void SetAddress1 (String val) {
		address1.sendKeys(val);
	}
	
	public WebElement GetAddress1() {
		return address1;
	}
	
	@FindBy (xpath = "//input[@id='address2']")
	private WebElement address2;
	
	public void SetAddress2 (String val) {
		address2.sendKeys(val);
	}
	
	public WebElement GetAddress2() {
		return address2;
	}
	
	@FindBy (xpath = "//input[@id='city']")
	private WebElement city;
	
	public void Setcity (String val) {
		city.sendKeys(val);
	}
	
	public WebElement Getcity() {
		return city;
	}
	
	@FindBy (xpath = "//select[@id='id_state']")
	private WebElement state;
	
	public void SetState (String val) {
		state.sendKeys(val);
	}
	
	public WebElement GetState() {
		return state;
	}
	
	@FindBy (xpath = "//input[@id='postcode']")
	private WebElement postalCode;
	
	public void SetPostalCode (String val) {
		postalCode.sendKeys(val);
	}
	
	public WebElement GetPostalCode() {
		return postalCode;
	}
	
	@FindBy (xpath = "//select[@id='id_country']")
	private WebElement country;
	
	public void SetCountry (String val) {
		country.sendKeys(val);
	}
	
	public WebElement GetCountry() {
		return country;
	}
	
	@FindBy (xpath = "//textarea[@id='other']")
	private WebElement additionalInfo;
	
	public void SetAdditionalInfo (String val) {
		additionalInfo.sendKeys(val);
	}
	
	public WebElement GetAdditionalInfo() {
		return additionalInfo;
	}
	
	@FindBy (xpath = "//input[@id='phone']")
	private WebElement phoneNumber;
	
	public void SetPhoneNumber (String val) {
		phoneNumber.sendKeys(val);
	}
	
	public WebElement GetPhoneNumber() {
		return phoneNumber;
	}
	
	@FindBy (xpath = "//input[@id='phone_mobile']")
	private WebElement mobileNumber;
	
	public void SetMobileNumber (String val) {
		mobileNumber.sendKeys(val);
	}
	
	public WebElement GetMobileNumber() {
		return mobileNumber;
	}
	
	@FindBy (xpath = "//input[@id='alias']")
	private WebElement addressAlias;
	
	public void SetAddressAlias (String val) {
		addressAlias.sendKeys(val);
	}
	
	public WebElement GetAddressAlias() {
		return addressAlias;
	}
	
	@FindBy (xpath = "//button[@id='submitAccount']")
	private WebElement register;
	
	public WebElement GetRegister() {
		return register;
	}

	@FindBy (xpath = "//h1[contains(text(),'Create an account')]")
	private WebElement createAccount;
	
	public WebElement getCreateAccount() {
		return createAccount;
	}
}
