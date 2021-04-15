package prac9March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.com");
				
		driver.findElement(By.linkText("Contact us")).click();
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		//driver.findElement(By.linkText("Specials")).click();
		
		//driver.findElement(By.linkText("New products")).click();
		
		//driver.findElement(By.linkText("About us")).click();
		
		//driver.findElement(By.linkText("Women")).click();
		
		//driver.findElement(By.linkText("My orders")).click();

	}

}
