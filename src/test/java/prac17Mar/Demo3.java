package prac17Mar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo3 {
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
  
  @Test
  public void test2() {
	  System.out.println("I am form Test 2");
  }

}
