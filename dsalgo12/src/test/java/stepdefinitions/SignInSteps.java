package stepdefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SignInPage;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class SignInSteps {
	
	private SignInPage sp=new SignInPage(DriverFactory.getdriver());
	
	String home_url=ConfigReader.getHomePage();
	
	@Given("User is in homepage")
	public void user_is_in_homepage() {
		
		//DriverFactory.getdriver().get(home_url);
		LoggerLoad.info("User is on home page");
	}

	@Then("user clicks signin and redirects to signin page")
	public void user_clicks_signin_and_redirects_to_signin_page() {
	   sp.signin_link();
	}

	@When("user enters username as {string} password as {string}")
	public void user_enters_username_as_password_as(String string, String string2) {
	    sp.enter_username(string);
	    sp.enter_pwd(string2);
	    
	}

	@When("user clicks login button and redirects to home page")
	public void user_clicks_login_button_and_redirects_to_home_page() throws Exception {
	   sp.login_click();
	   Thread.sleep(1000);
	  // sp.signout();
	}

}
