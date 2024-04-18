package TestNg.pageobjects;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test
	 public void WebLogin()
	  {
		  System.out.println("I am from WebLogin.");
	  }
	
	 @Test
	 public void MobileLogin()
	  {
		  System.out.println("I am from MobileLogin.");
	  }
	 
	 @Test
	 public void LoginAPI()
	  {
		  System.out.println("I am from LoginAPI.");
	  }

}
