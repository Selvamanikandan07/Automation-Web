package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPracticeObjRepo {



		public WebDriver driver;


		public MyPracticeObjRepo(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}


		@FindBy(xpath = "//a[@id='testing']")
		public WebElement WorkSpace_hdr;
		
		
		@FindBy(id = "APjFqb")
		public WebElement Googlesearch_TxtBx;
		
		

	}



