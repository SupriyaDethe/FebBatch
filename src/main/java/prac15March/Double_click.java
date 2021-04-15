package prac15March;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com");
		
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("Dresses");
		act.moveToElement(driver.findElement(By.xpath("//input[@id = 'search_query_top']"))).doubleClick().build().perform();

	}

}
