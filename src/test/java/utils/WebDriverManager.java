package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManager {
	
	public  WebDriver driver;
	//public String AppUrl = "";
	

	public WebDriverManager() {
		
		this.driver=driverInitialisation();
		
	}

   
   public WebDriver driverInitialisation() {
	   
	   String Path = System.getProperty("user.dir");
	   
	   try {
		switch (utils.Constants.BROWSER) {
		case "chrome":
			System.setProperty(utils.Constants.CHROME_DRIVER,Path+utils.Constants.CHROME_DRIVER_LOCATION);
			driver = new ChromeDriver();
			break;
		case "IE":
			System.setProperty(utils.Constants.IE_DRIVER,Path+utils.Constants.IE_DRIVER_LOCATION);
			driver = new InternetExplorerDriver();
			break;
		default:
			System.setProperty(utils.Constants.CHROME_DRIVER,Path+utils.Constants.IE_DRIVER_LOCATION);
			driver = new ChromeDriver();
			break;
		}
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	   return driver;
	
   }
   
   public void loadUrl(String Weburl) {
	   
	   driver.get(Weburl);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
       driver.manage().window().maximize();
	   
	   
   }
   


}
