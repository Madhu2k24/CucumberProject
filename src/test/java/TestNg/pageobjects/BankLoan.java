package TestNg.pageobjects;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankLoan {
	
	
	@AfterTest
	 public void lastexecution()
	  {
		  System.out.println("AfterTest will execute after the execution +"
		                       + "of all the classes of specific folder");
	  }
	
	@Test
  public void axisBank()
  {
	  System.out.println("I am from Axis Bank.");
  }
  
	@BeforeTest
  public void icicBank()
  {
	  System.out.println("I am from ICICI Bank.( Using Before with @test annotaion)");
  }
  
	@AfterTest
  public void sbiBank()
  {
	  System.out.println("I am from SBI Bank.(Using after with @test annotaion)");
  }
  
	@Test
  public void kotakBank()
  {
	  System.out.println("I am from KOTAK Bank.");
  }
	
	
	
	
	
	
	
}
