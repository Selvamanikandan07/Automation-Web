package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	
	public  WebDriver driver;
	//public String AppUrl = "";
	

	public WebDriverManager() {
		
		this.driver=driverInitialisation();
		
	}

   
   public WebDriver driverInitialisation() {
	   
		String Path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",Path+"/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",Prjpath+"/src/test/resources/Drivers/chromedriver.exe ");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		return driver;

	
   }
   
   public void loadUrl(String Weburl) {
	   
	   driver.get(Weburl);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
       driver.manage().window().maximize();
	   
	   
   }
   


}
