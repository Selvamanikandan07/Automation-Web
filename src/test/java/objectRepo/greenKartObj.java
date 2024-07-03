package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class greenKartObj {
	
	 WebDriver driver;


	public greenKartObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	//String Vege;


	@FindBy(xpath = "//input[@type='search']")
	public WebElement search_Txtbx;
	
	@FindBy(xpath = "//a[@id='testing']")
	public WebElement WorkSpace_hdr;
	
	


}
