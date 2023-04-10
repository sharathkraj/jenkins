package utilities;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import PageObject.LoginPage;
import Webdriver.driverManger;




public class commonUtils {
	
	
	public  void loadProperties() {

		
		Properties properties = new Properties();
		try {
			
//			properties.load(getClass().getResourceAsStream("/config.properties"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initWebElements() {
		System.out.println("Elements Initializes");
		PageFactory.initElements(driverManger.getDriver(),LoginPage.class);
		
	}
}
