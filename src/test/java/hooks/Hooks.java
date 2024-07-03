package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;

import Driver.DriverInstance;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance{
	
	@BeforeStep
	public void beforeSteps(Scenario scenario) {
		byte[] Screenshots =driver.getScreenshotAs(OutputType.BYTES);
		//scenario.
		
		
		
	}

}
