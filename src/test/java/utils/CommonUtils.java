package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


import io.cucumber.core.options.Constants;

public class CommonUtils {
	
	public static void loadproperties() {
		FileReader reader = null;
		try {
			reader = new FileReader("config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties properties = new Properties();
		
		
		try {
			properties.load(reader);
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
