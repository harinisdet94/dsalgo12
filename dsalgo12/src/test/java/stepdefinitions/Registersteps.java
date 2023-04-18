package stepdefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Registerpage;
import utilities.LoggerLoad;



public class Registersteps {
	
	Registerpage regpage=new Registerpage();
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		regpage.url();
		regpage.register();
		 LoggerLoad.info("User opened DS Algo URL and is trying to Registrer");
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() throws Exception {
		regpage.emptyfeilds();
		regpage.takescreenshot("Emptyfields.png");
	}

	@Then("It should display an error")
	public void it_should_display_an_error() {
		LoggerLoad.info("Please fill out this field");
		regpage.register();
	}

	@When("The user enters invalid username")
	public void the_user_enters_invalid_username() throws Exception {
		
		regpage.invalidusernameonly();
		regpage.registerclick();
		
		regpage.takescreenshot("InvalidUsername.png");
	   
	}

	@Then("It should display an error message Invalid username")
	public void it_should_display_an_error_message_invalid_username() {
		 LoggerLoad.info("User is trying with Invalid username");
		 regpage.register();
	}

	@When("The user enters valid username and invalid password")
	public void the_user_enters_valid_username_and_invalid_password() throws Exception {
		
		regpage.invalidpassword();

		regpage.registerclick();
		
		regpage.takescreenshot("Invalidpassword.png");
	}

	@Then("It should display an error message Invalid password")
	public void it_should_display_an_error_message_invalid_password() {
		 LoggerLoad.info("User is trying with Invalid password");
		 regpage.register();
	    
	}

	@When("The user enters a valid username and password but different password_confirmation and the user clicks Register button")
	public void the_user_enters_a_valid_username_and_password_but_different_password_confirmation_and_the_user_clicks_register_button() throws Exception {
	
		regpage.mismatchdata();
		
		regpage.registerclick();
	
	
		regpage.takescreenshot("Invalidconfirmation.png");
	}

	@Then("It should display an error mismatch password")
	public void it_should_display_an_error_mismatch_password() {
		 LoggerLoad.info("User is trying with Invalid confirm pwd");
		 regpage.register();
	}

	@When("The user enters a valid username and password and password confirmation and the user clicks Register button")
	public void the_user_enters_a_valid_username_and_password_and_password_confirmation_and_the_user_clicks_register_button() throws Exception {
		regpage.validdata();
		regpage.registerclick();
		regpage.takescreenshot("reg_success.png");
	
	}

	@Then("The user should be redirected to Homepage with New Account Created")
	public void the_user_should_be_redirected_to_homepage_with_new_account_created() {
		LoggerLoad.info("User successfully created New Account");
	}

	@Then("User signs out from the account")
	public void user_signs_out_from_the_account() {
	    regpage.signout();
	    DriverFactory.closedriver();
	}

	@Given("The user opens Register Page for Invalid username")
	public void the_user_opens_register_page_for_invalid_username() {
		 LoggerLoad.info("User opens with Invalid username");
	}

	@Given("The user opens Register Page for Invalid password")
	public void the_user_opens_register_page_for_invalid_password() {
		 LoggerLoad.info("User opens with Invalid password");
	}

	@Given("The user opens Register Page for mismatch data")
	public void the_user_opens_register_page_for_mismatch_data() {
		 LoggerLoad.info("User opens with Invalid confirm pwd");
	}

	@Given("The user opens Register Page for valid username and password")
	public void the_user_opens_register_page_for_valid_username_and_password() {
		 LoggerLoad.info("User opens valid credentials");
	}
}
