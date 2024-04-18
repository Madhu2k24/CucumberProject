package TestNg.pageobjects;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loan {
	
	@Test
	 public void HomeLoan()
	  {
		  System.out.println("HomeLoan");
	  }
	
	 @Test
	 public void CarLoan()
	  {
		  System.out.println("CarLoan");
	  }
	 
	 @Test
	 public void GoldLoan()
	  {
		  System.out.println("GoldLoan");
	  }
	 @BeforeTest
	 public void prerequiste()
	 {
		 System.out.println("BeforeTest will execute before the execution "
		 		            + "of all the classes of specific folder");
		 
	 }

}
