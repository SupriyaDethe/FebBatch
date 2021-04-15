package prac17Mar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Demo6 {
	WebDriver driver;
 
		@Test
		public void Test() {
			Actions act = new Actions(driver);
			WebElement WomenLink = driver.findElement(By.xpath("//a[text()='Women']"));
			act.moveToElement(WomenLink).build().perform();
			driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();
			}
 
		@BeforeMethod
  		public void beforeClass() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
			driver.navigate().to("http://automationpractice.com");
			} 

		@AfterMethod
		public void afterClass() {
			driver.close();
			}
		
		@Test
		public void Test1() {
			driver.findElement(By.xpath("(//a[contains(text(),'Printed Dress')])[2]")).click();
			String getDressName = driver.findElement(By.xpath("//h1[contains(text(),'Printed Dress')]")).getText();
			System.out.println("Name of dress is " + getDressName);
			}

}
