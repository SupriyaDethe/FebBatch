package prac17Mar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo2 {
  @Test
  public void test1() {
	  System.out.println("I am form Test1");
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
