package prac15March;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnMouse {

	public static void main(String[] args)
	throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com");
		
		Actions act = new Actions(driver);
		WebElement WomenLink = driver.findElement(By.xpath("//a[text()='Women']"));
		act.moveToElement(WomenLink).build().perform();
		driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();
		Thread.sleep(3000);
		
		Actions move = new Actions(driver);
		WebElement DressesLink = driver.findElement(By.xpath("(//a[@title = 'Dresses'])[2]"));
		move.moveToElement(DressesLink).build().perform();
		driver.findElement(By.xpath("(//a[@title = 'Summer Dresses'])[2]")).click();

	}

}
