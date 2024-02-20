package stepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.*;
import objectRepo.MyPracticeObjRepo;

 
public class MyPractice {
	
	WebDriver driver;
	
	MyPracticeObjRepo Mpobj = new MyPracticeObjRepo(driver);
	
	@FindBy(xpath = "//a[@id='testing']")
	public WebElement WorkSpace_hdr;
	
	
	public MyPractice() {
		

		
	      String Path = System.getProperty("user.dir");
	      
	      System.setProperty("webdriver.chrome.driver",Path+"/src/test/resources/Drivers/chromedriver.exe");
	      //System.setProperty("webdriver.chrome.driver",Prjpath+"/src/test/resources/Drivers/chromedriver.exe ");
	      driver = new ChromeDriver();
	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	      driver.manage().window().maximize();
	      
	}
	@Given("browser is initialised and opened")
	public void browser_is_initialised_and_opened() {


      
      
		

	}

	@And("user validates the title and Url")
	public void user_validates_the_title_and_url() {
	    
	driver.get("https://letcode.in/");
	String Title = driver.getTitle();
	System.out.println(Title);
	String Url =driver.getCurrentUrl();
	System.out.println(Url);
	Assert.assertEquals(Title, "LetCode with Koushik");
	//Thread.sleep(5000);
	
	   
	}

	@When("user clicks on workspace header test page should be displayed")
	public void user_clicks_on_workspace_header_test_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		//Mpobj.WorkSpace_hdr.click();
		driver.findElement(By.xpath("//a[@id='testing']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select DD = new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		DD.selectByVisibleText("Apple");
		List<WebElement> LS = driver.findElements(By.xpath("//select[@id='fruits']/option"));
		for (WebElement Ele : LS) {
			
			String fruits = Ele.getText();
			System.out.println(fruits);
			
		}
		
		WebElement lastfruit = LS.get(LS.size()-1);
		System.out.println(lastfruit.getText());
		lastfruit.click();
		Select DD1 = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		DD1.selectByValue("India");
		DD1.getFirstSelectedOption();
		WebElement selectedoption =  DD1.getFirstSelectedOption();
		String str = selectedoption.getText();
		System.out.println("*************************"+str);
		
		/*
		 * List<WebElement> LS1 =
		 * driver.findElements(By.xpath("//select[@id='country']/option")); for(int
		 * i=0;i<LS1.size();i++) {
		 * 
		 * String countries = LS1.get(i).getText(); System.out.println(countries); }
		 */
		
		
		
		
		
		
		
		
	   
	}
	
	

	@Then("user validates the cards under workspace header")
	public void user_validates_the_cards_under_workspace_header() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@And("close the browser")
	public void close_the_browser() {
	  
		driver.quit();
	}


}
