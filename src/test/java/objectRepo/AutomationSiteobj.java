package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationSiteobj {
	
	 WebDriver driver;
	
 public AutomationSiteobj(WebDriver driver) {
	 
	 this.driver= driver;
 }


	@FindBy(linkText = "https://automationstepbystep.com/")
	public WebElement Automation_Lnk;
		
	@FindBy(xpath = "//button[@aria-label='Stay signed out']")
	public WebElement Staysignout_Btn;
	
	
	@FindBy(id = "APjFqb")
	public WebElement Googlesearch_TxtBx;
	
	

}
