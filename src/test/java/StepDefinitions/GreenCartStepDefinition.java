package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenCartStepDefinition {
public WebDriver driver;
public String landingPageproductname;
public String offerPageProductName;
	//This is my new code.
	@Given("User is on GreenCart Landing Page")
	public void User_is_on_GreenCart_Landing_Page()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@When("^User searched with Shortname (.+) and extracted actual name of product$")
	public void User_searched_with_Shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException
	{
		driver.findElement(By.cssSelector("input[class='search-keyword']")).sendKeys(shortname);
		Thread.sleep(3000);
		String landingPageproductname=driver.findElement(By.cssSelector("h4.product-name ")).getText().split("-")[0].trim();
		System.out.println(landingPageproductname+" is extracted from Home Page");

	}
	
	@Then ("User searched for {string} shortname in offers page")
	public void User_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException
	{
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String ParentWindow=it.next();
		String ChildWindow=it.next();
		driver.switchTo().window(ChildWindow);
		driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys(shortname);
		String offerPageProductName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		Thread.sleep(3000);
	
	}
	
	@Then ("Validate product name in offers page matches with Landing page")
	public void Validate_product_name_in_offers_page_matches_with_Landing_page()
	{
		Assert.assertEquals(landingPageproductname, offerPageProductName);
	}

}
