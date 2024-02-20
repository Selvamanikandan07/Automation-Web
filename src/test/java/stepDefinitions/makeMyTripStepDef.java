package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import utils.BasePage;

public class makeMyTripStepDef extends BasePage{
	
	WebDriver driver;
	BasePage BP = new BasePage(driver);
	
	
	
	public makeMyTripStepDef(WebDriver driver) {
		super(driver);
		
	      String Path = System.getProperty("user.dir");
	      
	      System.setProperty("webdriver.chrome.driver",Path+"/src/test/resources/Drivers/chromedriver.exe");
	      driver = new ChromeDriver();
	      BP.waitForPageToLoad();
	      driver.manage().window().maximize();
	}
	
	
	
	
	
	@FindBy(xpath = "//div[@class='makeFlex column flexOne whiteText latoBold']")
	public WebElement login_Btn;
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement username_TxtBox;
	
	@FindBy(xpath = "//button[@data-cy='continueBtn']")
	public WebElement continue_Btn;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password_TxtBox;
		
	@FindBy(xpath = "//button[@data-cy='login']")
	public WebElement plogin_Btn;
	
	//p[@data-cy='commonModal']
	
	@FindBy(xpath = "//p[@data-cy='commonModal']")
	public WebElement verifyMobileNumber_Lbl;
	
	@FindBy(xpath = "//span[@data-cy='modalClose']")
	public WebElement close_Btn;
	
	//a[@data-cy='mmtLogo']
	
	@FindBy(xpath = "//a[@data-cy='mmtLogo']")
	public WebElement mMtHP_Icon;
	
	
	

	
	@Given("makeMyTrip website is launced and title is validated")
	public void make_my_trip_website_is_launced_and_title_is_validated() {
		
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String HpTitle =driver.getTitle();
		System.out.println(HpTitle);
		//assert.assertEquals(0, 0)
   

	}

	@And("the user clicks on Login button")
	public void the_user_clicks_on_login_button() {
		
		login_Btn.click();
	    

	}

	@Then("user enters email address and clicks continue button")
	public void user_enters_email_address_and_clicks_continue_button() {
		
		BP.enterValueInTextBox(username_TxtBox, "nselvamanikandan@gmail.com");
		//username_TxtBox.sendKeys("nselvamanikandan@gmail.com");
		continue_Btn.click();
		BP.waitForElementisVisible(password_TxtBox, 10);
		
		
		
	    

	}

	@And("user enters password and clicks Login button")
	public void user_enters_password_and_clicks_login_button() {
		
		//password_TxtBox.sendKeys("Peace@1991");
		BP.enterValueInTextBox(password_TxtBox, "Peace@1991");
		plogin_Btn.click();
	    

	}

	@When("verify mobile number screen displayed click the close button")
	public void verify_mobile_number_screen_displayed_click_the_close_button() {
		
		close_Btn.click();
	    

	}

	@Then("user validates the Homepage")
	public void user_validates_the_homepage() {
		
		BP.verifyElementIsDisplayed(mMtHP_Icon);
	    

	}

}
