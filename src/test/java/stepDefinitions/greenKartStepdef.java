package stepDefinitions;

import java.lang.reflect.Constructor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.GreenkartHomePage;
import utils.WebDriverManager;

public class greenKartStepdef {
	
	WebDriver driver;
	GreenkartHomePage Hp;
	WebDriverManager WM;
	
	
 public void setUp() {
	 
		/*
		 * String Prjpath = System.getProperty("user.dir");
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * Prjpath+"/src/test/resources/Drivers/chromedriver.exe "); driver = new
		 * ChromeDriver();
		 */
		  
	      WM = new WebDriverManager();
	      WM.driverInitialisation();
	      WM.loadUrl("https://rahulshettyacademy.com/seleniumPractise");
		  Hp = new GreenkartHomePage(driver);
	  
 }
	
	

	
	@Given("WebDriver is initialized and browser is opened")
	public void web_driver_is_initialized_and_browser_is_opened() {
		
		
		
		System.out.println("*************** Driver initialised***************");
		
	

	}

	@Given("the user is navigated to Greenkart Homepage")
	public void the_user_is_navigated_to_greenkart_homepage() {
		
		setUp();  
		/*
		 * driver.get("https://rahulshettyacademy.com/seleniumPractise");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		 * driver.manage().window().maximize();
		 */
		

	}
	
	@And("the user selects on Vegetable as {string} and enters Qty as {string}")
	public void the_user_selects_on_vegetable_as_and_enters_qty_as(String Vege, String Qty) throws InterruptedException {
		
  
		Hp.searchVegetable(Vege);
		Hp.entervegQty(Vege, Qty);	
		

	}



	@And("the user clicks on Add to cart button for {string}")
	public void the_user_clicks_on_add_to_cart_button(String Veg) throws InterruptedException {
		
		Hp.clickCartBtn(Veg);

	}

	@Then("the user will be navigated to cart page")
	public void the_user_will_be_navigated_to_cart_page() {
		
		driver.quit();

	}


}
