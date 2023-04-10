package Step_definitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Webdriver.driverManger;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.commonUtils;



public class Common_Step_Definitions extends driverManger  {
	
	private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definitions.class);
	
	public static AppiumDriver driver;
	
	
	@Before
	public void beforeScenario() {
		
		try {
			LOGGER.info("before Scenarios");
			commonUtils CommonUtils = new commonUtils();
			CommonUtils.loadProperties();
			
			if(driver == null) {
				LOGGER.info("Launch driver");
				driverManger.launchdriver();	
				CommonUtils.initWebElements();
			}
			 
		}catch (Exception e) {
	       
			e.printStackTrace();
		}
	}
	
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			byte[] screenshotTaken= ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(screenshotTaken, "image/png", "error_Screenshots");
		}
	}
	
}
