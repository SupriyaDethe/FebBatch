package prac17Mar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Demo4 {
	  @Test
	  public void test1() {
		  System.out.println("I am form Test 1");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("I am form Before Method");
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("I am form After Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("I am form Before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("I am form After Class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("I am form Before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("I am form After Test");
	  }
	  
	  @Test
	  public void test2() {
		  System.out.println("I am form Test 2");
	  }

}
