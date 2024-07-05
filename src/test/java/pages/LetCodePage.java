package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import objectRepo.letCodeObj;
import utils.BasePage;
import utils.WebDriverManager;

public class LetCodePage {
	
	WebDriver driver;
	private WebDriverManager WM;
	 private letCodeObj LC;
	 //private BasePage BP;
	 
	

public LetCodePage() {
	
	
	WM = new WebDriverManager();
	this.driver=WM.driver;
	LC = new letCodeObj(driver);	
	
}
	
	public void validateTitleAndUrl(String Weburl,String ExpTitle) {
		
		
		driver.navigate().to(Weburl);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		String Url =driver.getCurrentUrl();
		System.out.println(Url);
		Assert.assertEquals(Title, ExpTitle);
		//Thread.sleep(5000);
	}
	
	public void inputFields() {
		
		LC.WorkSpace_hdr.click();
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

	}
	
public void dropDowns() {
	
	   LC.WorkSpace_hdr.click();
		
	  LC.DropDown_hdr.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  Select DD = new Select(LC.DropDown_Fruits); DD.selectByVisibleText("Apple");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  LC.DropDown_FruitsList = DD.getOptions(); 
	  for (WebElement Ele : LC.DropDown_FruitsList) {
	  
	  String fruits = Ele.getText(); 
	  System.out.println(fruits);
	  
	  }
	  
	  Select DD1 = new Select(LC.DropDown_Superheros); boolean b1= DD1.isMultiple();
	  System.out.println("Boolean value is " +b1); DD1.selectByValue("bt");
	  DD1.selectByIndex(1); 
	  List<WebElement> selectedheros =
	  DD1.getAllSelectedOptions(); //System.out.println(selectedheros.ge); 
	  for(WebElement Ele : selectedheros) {
	  
	  System.out.println(Ele.getText());
	  
	  }
	  
	  
	  Select DD2 = new Select(LC.DropDown_Lang); 
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
	  
	  
	  Select DD3 = new Select(LC.DropDown_Country); 
	  DD3.selectByValue("India"); 
	  WebElement selectedCountry =
	  DD3.getFirstSelectedOption(); String Country = selectedCountry.getText();
	  System.out.println("*******Country Selected us "+Country);
	  
	  List<WebElement> listSelect = driver.findElements(By.xpath("//*[contains(text(),'Select') or contains(text(),'select')]")); 
	  int
	  sizeCount = listSelect.size(); System.out.println(sizeCount); 
	  for (WebElement Ele : listSelect) {
	  
	  System.out.println(Ele.getText());
	  
	  }

}

public void alertsValidation() {
	
	  LC.WorkSpace_hdr.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  
	  
	  LC.Alert_Hdr.click();
	  
	  LC.Alert_SimpleAlert.click(); 
	  WebDriverWait wait = new WebDriverWait(driver,
	  Duration.ofSeconds(10)); wait.until(ExpectedConditions.alertIsPresent());
	  Alert Al = driver.switchTo().alert(); Al.accept();
	  
	  LC.Alert_confirmAlert.click(); 
	  Al.dismiss(); 
	  LC.Alert_promptAlert.click();
	  Al.sendKeys("Selva"); 
	  Al.accept(); 
	  LC.Alert_modernAlert.click();
	  
	  String str =LC.Alert_title.getText();
	  System.out.println(str);
	  LC.Alert_close.click();
	  
}

public void iframesValidation() {
	
	  LC.WorkSpace_hdr.click();
	  LC.Frame_Hdr.click();
	  
	  driver.switchTo().frame("firstFr");
	  LC.Frame_Uname.sendKeys("Selva");
	  //driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Selva");
	  LC.Frame_pwd.sendKeys("Selva");
	  //driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Selva");
	  //WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	  driver.switchTo().frame(LC.Frame_Inner);
	  LC.Frame_email.sendKeys("Selva");
	  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Selva");
	
	
}
	
public void closeDriver() {
	   
	   driver.quit();
}
	

}
