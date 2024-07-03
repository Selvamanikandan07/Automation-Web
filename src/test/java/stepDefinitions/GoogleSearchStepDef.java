package stepDefinitions;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import objectRepo.AutomationSiteobj;

public class GoogleSearchStepDef {
	
	WebDriver driver=null;
	
	
	//AutomationSiteobj SiteObj = new AutomationSiteobj(driver);
	

	@Given("browser is opened")
	public void browser_is_open() {
		
		
		  String Prjpath = System.getProperty("user.dir");
		  
		  System.setProperty("webdriver.chrome.driver",Prjpath+"/src/test/resources/Drivers/chromedriver.exe ");
		  
		  driver = new ChromeDriver();
		 
		//WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
        
	}

	@And("user is on search googlepage")
	public void user_is_on_search_googlepage() {
		
		driver.navigate().to("https://www.hevyapp.com/");
		//driver.switchTo().frame("callout");
		//SiteObj.Staysignout_Btn.click();
		//driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		//dri ver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.switchTo().defaultContent();
		

		

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		
		//SiteObj.Googlesearch_TxtBx.sendKeys("Automation step by step");
		//driver.findElement(By.id("APjFqb")).sendKeys("heavyapp");

	}

	@And("User clicks enter")
	public void user_clicks_enter() {
		
		//SiteObj.Googlesearch_TxtBx.sendKeys(Keys.ENTER);
		//driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

	}
	
	@Then("user is navigated to Search results and clicks")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		
		//driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING");
		
	   //WebElement wb = driver.findElement(By.xpath("https://www.hevyapp.com/"));
		//wb.click();
		driver.findElement(By.xpath("//a[@href='https://www.hevy.com/signup?utm_source=hevyapp.com&utm_medium=menu']")).click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[contains(text(),'Sign up with Google')]")));
		//Wait<WebDriver> w1 = new FluentWait<WebDriver>(driver);
		/*
		 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(2));
		 * .ignoring(NoSuchElementException.class); WebElement element =
		 * wait.until(webDriver ->
		 * webDriver.findElement(By.xpath("//p[contains(text(),'Sign up with Google')]")
		 * ));
		 */
		/*
		 * element.sendKeys(Keys.DOWN); element.sendKeys(Keys.BACK_SPACE);
		 * element.sendKeys(Keys.CONTROL + "c");
		 */
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//p[contains(text(),'Sign up with Google')]"))));
		driver.findElement(By.xpath("//p[contains(text(),'Sign up with Google')]")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windows);
		


		System.out.println("****************************" +windows);
		
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		WebElement HevyLnk = driver.findElement(By.xpath("//div[@id='headingSubtext']/span/button"));
		wait.until(ExpectedConditions.visibilityOf(HevyLnk));
		
		
		/*
		 * public void validateMsg(WebElement element,String Expected){
		 * 
		 * String Actualmsg = element.getText();
		 * 
		 * if(Expected.equals(Actualmsg)){
		 * 
		 * System.out.println("Actual  message is matched with Expected"); }
		 * 
		 * else
		 * 
		 * System.out.println("Actual  message is  not matched with Expected");
		 */
				
		

		/*
		 * FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		 * .withTimeout(Duration.ofSeconds(30)); .pollingEvery(Duration.ofSeconds(1));
		 * .ignoring(org.openqa.selenium.NoSuchElementException.class);
		 */

	
		String text = HevyLnk.getText();
		System.out.println(text);
		//String expectedstr = "Hevy - Gym Workout Tracker";
		driver.switchTo().window(list.get(0));	
		driver.navigate().back();
		List<WebElement> webelelist = driver.findElements(By.xpath("//ul[@id='menu-1-c518b24']/li"));
		for (WebElement Ele : webelelist) {
			
			String str = Ele.getText();
			System.out.println(str);
			
		}
		
		WebElement  Articles =  driver.findElement(By.xpath("//li[@id='menu-item-5153']/div/a"));
		Actions Ac = new Actions(driver);
		Ac.moveToElement(Articles).perform();
		
		

		List<WebElement> List1   = driver.findElements(By.xpath("//ul[@class='sub-menu']/li/a"));
		for(int i=0;i<List1.size();i++) {
			
			String str2 = List1.get(i).getText();
			System.out.println(str2);
		}
		
		System.out.println(List1.get(List1.size()-2).getText());
		List1.get(List1.size()-2).click();
		
			
		
		
		driver.quit();

	
	}
	
	

     
     
		
		
	}
	
	

	

