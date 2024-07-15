package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.common.reflection.qual.GetClass;

import io.cucumber.core.options.Constants;

public class CommonUtils {
	
	public  void loadproperties() {
		
		Properties properties = new Properties();
		
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		utils.Constants.APP_URL = properties.getProperty("APP_URL");
		utils.Constants.BROWSER= properties.getProperty("BROWSER");
		utils.Constants.USERNAME=properties.getProperty("USERNAME");
		utils.Constants.PASSWORD=properties.getProperty("PASSWORD");
		utils.Constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
		utils.Constants.IE_DRIVER_LOCATION=properties.getProperty("IE_DRIVER_LOCATION");

		


		
		
	}
	
	

}
