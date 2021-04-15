package prac14March;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com");
		
		//Get title method
		String HomePageTitle = "My Store";
		
		String title = driver.getTitle();
		System.out.println("Title of current page is " + title);
		
		if(HomePageTitle.equals(title)) {
			System.out.println("Title is Verified PASS");
		} else {
			System.out.println("Title is NOT verifried FAIL");
		}
		
		//Get URL method
		String CurrentWebPageURL = driver.getCurrentUrl();
		System.out.println("Current page URL is " + CurrentWebPageURL );
		
		//Get Page Source Method
		String CurrentPageSource = driver.getPageSource();
		System.out.println("Current Page Source is " + CurrentPageSource);

	}

}
