  package prac12March;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args)
	throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com");
		
		//Enter sign in page
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("dethesupriyaa@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		//Enter your personal information
		driver.findElement(By.xpath("(//input[@name='id_gender'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Supriya");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Dethe");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Sup123");

		//select days
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys("4  ");
		Thread.sleep(3000);
		
		//select month
		Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		month.selectByVisibleText("May ");
		Thread.sleep(3000);
		
		month.selectByValue("6");
		Thread.sleep(3000);
		
		month.selectByIndex(7);
		Thread.sleep(3000);
		
		//select year
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1995  ");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(3000);
		
		//tick check boxes
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(3000);
		boolean checkBoxResult = driver.findElement(By.xpath("//input[@id='newsletter']")).isSelected();
		System.out.println(checkBoxResult);
		if (checkBoxResult == false) {
			driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		}
		
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		Thread.sleep(3000);
		
		//Enter your address
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("");
		Thread.sleep(3000);
		
		//Enter company info
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("XYZ company");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("ABC college Road");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Nanded");
		driver.findElement(By.xpath("//select[@id='id_state']")).sendKeys("California");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("12345");
		Thread.sleep(3000);
		
		//Select country
		Select Country = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
		Country.selectByVisibleText("United States");
		boolean check = driver.findElement(By.xpath("//select[@id='id_country']")).isSelected();
		System.out.println("Country is " + check);
		if  (check == false) {
			driver.findElement(By.xpath("//select[@id='id_country']")).sendKeys("United States");
			Thread.sleep(3000);
		}
		
		//Enter phone no
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("0123456789");
		Thread.sleep(3000);
		
		//Enter future reference address
		driver.findElement(By.xpath("//input[@id= 'alias']")).sendKeys(".");
		Thread.sleep(3000);
		
		//Click register
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
	}

}
