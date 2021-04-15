package prac13March;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAndClose {

	public static void main(String[] args)
	throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/");
		driver.findElement(By.className("login")).click();
		
		WebElement email;
		email = driver.findElement(By.id("email_create"));
		email.sendKeys("dethesupriyaa@gmail.com");
		Thread.sleep(5000);
		
		//to close only current browser
		driver.close();

	}

}
