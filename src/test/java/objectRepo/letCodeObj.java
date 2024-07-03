package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class letCodeObj {
	
	WebDriver driver;
	
	public letCodeObj(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@id='testing']")
	public WebElement WorkSpace_hdr;
	
	@FindBy(xpath = "//input[@id='fullName']")
	public WebElement Fullname_txtbx;
	
	@FindBy(xpath = "//input[@id='join']")
	public WebElement Append_txtbx;
	
	@FindBy(xpath = "//input[@id='getMe']")
	public WebElement Inside_txtbx;	
	
	@FindBy(xpath = "//input[@id='clearMe']")
	public WebElement Clear_txtbx;	
	
	
	@FindBy(xpath = "//input[@id='noEdit']")
	public WebElement NoEdit_txtbx;
	
	
	
	@FindBy(xpath = "//input[@id='dontwrite']")
	public WebElement ReadOnly_txtbx;


}
