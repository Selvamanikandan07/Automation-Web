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


public class LetCodeStepDef {

	WebDriver driver;
	
    private letCodeObj LC;
	
	

		
	
	


	public LetCodeStepDef() {



		String Path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",Path+"/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",Prjpath+"/src/test/resources/Drivers/chromedriver.exe ");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		LC = new letCodeObj(driver);
		
        


	}
	
	
	@Given("browser is initialised and opened")
	public void browser_is_initialised_and_opened() {



		System.out.println("Browser is initialised and opened");


	}

	@And("user validates the title and Url")
	public void user_validates_the_title_and_url() {

		driver.navigate().to("https://letcode.in/");
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
		LC.WorkSpace_hdr.click();
		//driver.findElement(By.xpath("//a[@id='testing']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@href='/edit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LC.Fullname_txtbx.sendKeys("Selvamanikandan");
		LC.Append_txtbx.sendKeys(" Good Man",Keys.TAB);

        String Text = LC.Inside_txtbx.getAttribute("value");
        System.out.println(Text);
        LC.Clear_txtbx.clear();
       boolean b=  LC.NoEdit_txtbx.isEnabled();
        if(b==false) {
        	
        	System.out.println("Confirm Edit field is disabled");
        }
        else
        	System.out.println("Confirm Edit field is not disabled");
        
        String readonly = LC.ReadOnly_txtbx.getAttribute("readonly");
        System.out.println(readonly);
        	
		
		
           LC.WorkSpace_hdr.click();
		
		  driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		  WebElement
		  DropDown = driver.findElement(By.xpath("//select[@id='fruits']")); 
		  Select DD = new Select(DropDown); DD.selectByVisibleText("Apple");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //List<WebElement> LS =
		  driver.findElements(By.xpath("//select[@id='fruits']/option"));
		  List<WebElement> LS = DD.getOptions(); 
		  for (WebElement Ele : LS) {
		  
		  String fruits = Ele.getText(); System.out.println(fruits);
		  
		  }
		  
		  WebElement SuperHeroDD =
		  driver.findElement(By.xpath("//select[@id='superheros']")); Select DD1 = new
		  Select(SuperHeroDD); boolean b1= DD1.isMultiple();
		  System.out.println("Boolean value is " +b1); DD1.selectByValue("bt");
		  DD1.selectByIndex(1); 
		  List<WebElement> selectedheros =
		  DD1.getAllSelectedOptions(); //System.out.println(selectedheros.ge); 
		  for(WebElement Ele : selectedheros) {
		  
		  System.out.println(Ele.getText());
		  
		  }
		  
		  
		  WebElement lanDD = driver.findElement(By.xpath("//select[@id='lang']"));
		  Select DD2 = new Select(lanDD); 
		  List<WebElement> langs = DD2.getOptions();
		  WebElement lastElement = langs.get(langs.size()-1); 
		  String lastoption =
		  lastElement.getText();
		  System.out.println("last option slected is  "+lastoption);
		  lastElement.click(); //System.out.println(langs[langs.size()-1]); 
		  for (int i= 0; i < langs.size(); i++) {
		  
		  WebElement ele = langs.get(i); 
		  System.out.println(ele.getText());
		  
		  }
		  
		  
		  WebElement CountryDD = driver.findElement(By.xpath("//select[@id='country']")); 
		  Select DD3 = new Select(CountryDD); 
		  DD3.selectByValue("India"); 
		  WebElement selectedCountry =
		  DD3.getFirstSelectedOption(); String Country = selectedCountry.getText();
		  System.out.println("*******Country Selected us "+Country);
		  
		  //*[contains(text(),'Select') or contains(text(),'select')] 
		  List<WebElement> listSelect = driver.findElements(By.xpath("//*[contains(text(),'Select') or contains(text(),'select')]")); 
		  int
		  sizeCount = listSelect.size(); System.out.println(sizeCount); for (WebElement
		  Ele : listSelect) {
		  
		  System.out.println(Ele.getText());
		  
		  }
		 


	}



	@Then("user validates the cards under workspace header")
	public void user_validates_the_cards_under_workspace_header() {
		// Write code here that turns the phrase above into concrete 

		
		  LC.WorkSpace_hdr.click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//a[@href='/frame']")).click();
		  
		  
		  driver.findElement(By.xpath("//a[@href='/alert']")).click(); WebElement
		  SimpleAlert = driver.findElement(By.xpath("//button[@id='accept']"));
		  SimpleAlert.click(); WebDriverWait wait = new WebDriverWait(driver,
		  Duration.ofSeconds(10)); wait.until(ExpectedConditions.alertIsPresent());
		  Alert Al = driver.switchTo().alert(); Al.accept();
		  
		  WebElement confirmAlert =
		  driver.findElement(By.xpath("//button[@id='confirm']"));
		  confirmAlert.click(); Al.dismiss(); WebElement promptAlert =
		  driver.findElement(By.xpath("//button[@id='prompt']")); promptAlert.click();
		  Al.sendKeys("Selva"); Al.accept(); WebElement modernAlert =
		  driver.findElement(By.xpath("//button[@id='modern']")); modernAlert.click();
		  
		  String str =driver.findElement(By.xpath("//p[@class='title']")).getText();
		  System.out.println(str);
		  driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		  
		  driver.switchTo().frame("firstFr");
		  driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Selva");
		  driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Selva");
		  WebElement innerframe =
		  driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		  driver.switchTo().frame(innerframe);
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Selva");
		  
		  
		 




		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOf(Inputlbl)); WebElement txBox
		 * =driver.findElement(By.xpath("//input[@id='noEdit']")); if(txBox.isEnabled())
		 * {
		 * 
		 * System.out.println("*********************fail"); } else
		 * System.out.println("passssssssssssssss");
		 */
		 


	}

	@And("close the browser")
	public void close_the_browser() {

		driver.close();
	}


}
