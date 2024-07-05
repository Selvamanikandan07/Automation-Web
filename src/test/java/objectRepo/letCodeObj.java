package objectRepo;

import java.util.List;

import org.openqa.selenium.By;
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
	
	// Dropdown 
	
	@FindBy(xpath = "//a[@href='/dropdowns']")
	public WebElement DropDown_hdr;
	
	@FindBy(xpath = "//select[@id='fruits']")
	public WebElement DropDown_Fruits;
	
	@FindBy(xpath = "//select[@id='fruits']/option")
	public List<WebElement> DropDown_FruitsList;
	
	
	
	@FindBy(xpath = "//select[@id='superheros']")
	public WebElement DropDown_Superheros;
	
	@FindBy(xpath = "//select[@id='lang']")
	public WebElement DropDown_Lang;
	
	@FindBy(xpath = "//select[@id='country']")
	public WebElement DropDown_Country;
	
	//Alerts
	
	@FindBy(xpath = "//a[@href='/alert']")
	public WebElement Alert_Hdr;

	@FindBy(xpath = "//button[@id='accept']")
	public WebElement Alert_SimpleAlert;
	
	@FindBy(xpath = "//button[@id='confirm']")
	public WebElement Alert_confirmAlert;
	
	@FindBy(xpath = "//button[@id='prompt']")
	public WebElement Alert_promptAlert;
	
	@FindBy(xpath = "//button[@id='modern']")
	public WebElement Alert_modernAlert;
	
	@FindBy(xpath = "//p[@class='title']")
	public WebElement Alert_title;
	
	@FindBy(xpath = "//button[@aria-label='close']")
	public WebElement Alert_close;
	
	//iframes
	
	  //driver.findElement(By.xpath("//a[@href='/frame']")).click();
	  
		@FindBy(xpath = "//a[@href='/frame']")
		public WebElement Frame_Hdr;
	  	  
		@FindBy(xpath = "//input[@name='fname']")
		public WebElement Frame_Uname;
		
		@FindBy(xpath = "//input[@name='lname']")
		public WebElement Frame_pwd;
		
		@FindBy(xpath = "//iframe[@src='innerFrame']")
		public WebElement Frame_Inner;
		
		@FindBy(xpath = "//input[@name='email']")
		public WebElement Frame_email;	  
	  
	
	
	
	


}
