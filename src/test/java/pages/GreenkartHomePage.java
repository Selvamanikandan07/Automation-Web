package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.greenKartObj;
import stepDefinitions.greenKartStepdef;
import utils.WebDriverManager;

public class GreenkartHomePage {
	
	private WebDriver driver;
	private greenKartObj GkObj;
	WebDriverManager WM;
	
	public GreenkartHomePage(WebDriver driver) {
		
		this.driver=driver;
		GkObj = new greenKartObj(driver);
					
	}
	
	

		
		

	
	
	
	public void searchVegetable(String Vege) {
		

		try {
			
			GkObj.search_Txtbx.clear();
			GkObj.search_Txtbx.sendKeys(Vege);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
public void entervegQty(String Vege,String Qty) {
	
	WebElement searchedVeg = driver.findElement(By.xpath("//h4[contains(text(),'"+Vege+"')]"));
	if(searchedVeg.isDisplayed())
	{
		try {
			System.out.println("The selected veg is displayed");
			WebElement QtyTxtbx = driver.findElement(By.xpath("//h4[contains(text(),'"+Vege+"')]//following-sibling::div/input"));
			System.out.println(QtyTxtbx);
			QtyTxtbx.click();
			QtyTxtbx.clear();
			QtyTxtbx.sendKeys(Qty);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

public void clickCartBtn(String Veg) {
	

	try {
		WebElement AddtoCartBtn = driver.findElement(By.xpath("//h4[contains(text(),'"+Veg+"')]//following-sibling::div/button"));
		AddtoCartBtn.click();
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
