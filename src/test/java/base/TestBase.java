package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import project_listeners.WebEventListeners;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excel.ExcelReader;
import pages.ContactUsPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignInPage;
import pages.WelcomeHomePage;

public class TestBase {
	
	static WebDriver driver;
	
	//Create Objects
	protected HomePage homePageObj;
	protected ContactUsPage contactUsPageObj;
	protected SignInPage signInPageObj;
	protected CreateAccountPage createAccountPageObj;
	protected WelcomeHomePage welcomeHomePageObj;
	
	//To read properties
	public Properties prop;
	public FileInputStream fis;	

	public ExcelReader datatable = null;
	
	public static ExtentReports extent;		//to create the report
	public static ExtentTest logger;		//to log the messages
	
	@BeforeMethod (groups = {"CreateAccount", "HomePage", "SignIn", "SmokeTest", "RegressionTest"})
	public void  beforeMethod() throws IOException {
		
		datatable = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\resources\\inputdata.xlsx");
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		prop.load(fis);
		
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("browser do not exist");
			driver.navigate().to("http://automationpractice.com");
		}
		
		WebEventListeners ecapture = new WebEventListeners();
		EventFiringWebDriver eventDriver =  new EventFiringWebDriver(driver);
		eventDriver.register((WebDriverEventListener) ecapture);
		
		eventDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		eventDriver.navigate().to("http://automationpractice.com/");
		
		//Create Constructors
		homePageObj = new HomePage(eventDriver);
		contactUsPageObj =new ContactUsPage(eventDriver);
		signInPageObj = new SignInPage(eventDriver);
		createAccountPageObj = new CreateAccountPage(eventDriver);
		welcomeHomePageObj = new WelcomeHomePage(eventDriver);
		
	}
	
	@AfterMethod (groups = {"CreateAccount", "HomePage", "SignIn", "SmokeTest", "RegressionTest"})
	public void closeBrowser() {
		driver.quit();
		extent.endTest(logger);
		extent.flush();
	}
	
	@BeforeTest (groups = {"CreateAccount", "HomePage", "SignIn", "SmokeTest", "RegressionTest"})
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
	}

	@AfterTest (groups = {"CreateAccount", "HomePage", "SignIn", "SmokeTest", "RegressionTest"})
	public void testafter() {
		extent.close();
	}

}
