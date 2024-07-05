package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BasePage {

	WebDriver driver;

	
	  public BasePage(WebDriver driver) { 
		  this.driver=driver;
	  
	  }
	  
	public void getUrl(String url) {
		
		driver.get(url);
		
	}
	 

	public void waitForElementisVisible(WebElement element, int TimeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void waitForElementToBeClickable(WebElement element, int TimeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForPageToLoad() {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	public void enterValueInTextBox(WebElement element, String text) {

		element.clear();
		element.sendKeys(text);

	}

	public void verifyElementIsDisplayed(WebElement element) {

		if (element.isDisplayed()) {

			System.out.println("Element is displayed");
		} else
			System.out.println("Element is not displayed");

	}

	public void switchToFrame(int index, String nameorid, WebElement element) {

		if (index != 0) {

			driver.switchTo().frame(index);
		} else if (nameorid != null) {
			driver.switchTo().frame(nameorid);
		} else if (element != null) {
			driver.switchTo().frame(element);
		}
	}

}
