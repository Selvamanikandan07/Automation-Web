package stepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;
import objectRepo.MyPracticeObjRepo;
import objectRepo.letCodeObj;
import pages.LetCodePage;
import utils.WebDriverManager;


public class LetCodeStepDef {

	WebDriver driver;
	
    private letCodeObj LC;
    private LetCodePage LCpage;
    private WebDriverManager WM;
	
	public LetCodeStepDef() {

       // WM = new WebDriverManager();
        //this.driver=WM.driverInitialisation();
		LCpage = new LetCodePage();

	}
	
	
	@Given("browser is initialised and opened")
	public void browser_is_initialised_and_opened() {


		System.out.println("Browser is initialised and opened");


	}

	@And("user validates the title and Url")
	public void user_validates_the_title_and_url() {
     
		LCpage.validateTitleAndUrl("https://letcode.in/","LetCode with Koushik");


	}

	@When("user clicks on workspace header test page should be displayed")
	public void user_clicks_on_workspace_header_test_page_should_be_displayed() {
		
		LCpage.inputFields();
		LCpage.dropDowns();

		
		
          		 


	}



	@Then("user validates the cards under workspace header")
	public void user_validates_the_cards_under_workspace_header() {
		// Write code here that turns the phrase above into concrete 

		

		  
      LCpage.alertsValidation();
      LCpage.iframesValidation();
		  
		 


	}

	@And("close the browser")
	public void close_the_browser() {

		LCpage.closeDriver();
		System.out.println("***********Browser Closed successfully**********");
	}


}
