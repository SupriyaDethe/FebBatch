package prac17Mar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Demo1 {
  @Test
  public void test() {
	  System.out.println("I am from test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from After Method");
  }
  
  @Test
  public void test1() {
	  System.out.println("I am from test1");
  }

}
