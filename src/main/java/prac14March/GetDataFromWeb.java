package prac14March;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String ContactUsPageText = "CUSTOMER SERVICE - CONTACT US";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com");
		
		//Get Text from Web Site
		//get phone no text
		String PhoneNumber = driver.findElement(By.xpath("//strong[text()='0123-456-789']")).getText();
		System.out.println("Phone Number is " + PhoneNumber);
		
		//get facebook text
		String FollowUsOnFacebookText = driver.findElement(By.xpath("//div[@id='facebook_block']/h4")).getText();
		System.out.println("Follow us on facebook text is " + FollowUsOnFacebookText);
		
		//get contact text
		driver.findElement(By.linkText("Contact us")).click();
		String ContactUsPageTextFromWebsite = driver.findElement(By.xpath("//div[@id='center_column']/h1")).getText();
		if (ContactUsPageText == ContactUsPageTextFromWebsite) {
			System.out.println("User is on contact us page - PASS");
		} else {
			System.out.println("User is NOT on contact us page -FAIL");
		}
		
	}

}
