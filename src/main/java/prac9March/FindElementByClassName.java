package prac9March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.com");
		
		driver.findElement(By.className("inputNew form-control grey newsletter-input")).sendKeys("Dresses");
		
		//*driver.findElement(By.name("submit_search")).click();

	}

}
