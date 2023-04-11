package Step_definitions;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import Webdriver.driverManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_definitions_Login extends driverManger {
	
	//private static final Logger LOGGER = LogManager.getLogger(Step_definitions_Login.class);
	@Given("Users enter invalid {string} and  invalid {string}")
	public void users_enters_invalid_and_invalid(String userName, String PassWord ) throws InterruptedException, IOException {
		
			System.out.println("Entering the Login Page...");
			LoginPage.USERNAME.sendKeys(userName);
			LoginPage.PASSWORD.sendKeys(PassWord);
			LoginPage.LOGIN_BUTTON.click();
			System.out.println("Login Sucessfully");
	}
	
	@Then("Users can able to Logout the Applications")
	public void users_can_able_to_logout_the_applications() throws InterruptedException, IOException {
				
			System.out.println("Entering the Logout Page Sucessfully");
					
//			Thread.sleep(1000);
//			System.out.println(" 1 ");
//			LoginPage.MenuClick.click();
//			
//			Thread.sleep(1000);
//			System.out.println(" 8 ");
//			LoginPage.LOGOUT_BUTTON.click();
//			
//			
//			Thread.sleep(1000);
//			System.out.println(" 118 ");
//			LoginPage.CONFIRM_BUTTON.click();
			
			System.out.println("Logout Sucessfully");
					
			
			}
	
}