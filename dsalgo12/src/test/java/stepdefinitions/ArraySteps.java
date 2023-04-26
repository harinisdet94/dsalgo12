package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ArrayPage;
import pageobjects.DatastructurePage;
import utilities.LoggerLoad;

public class ArraySteps {
	ArrayPage array=new ArrayPage();
	DatastructurePage d=new DatastructurePage();
	
	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
		
		   LoggerLoad.info("User is Home  Page");
	   
	}

	@When("The user clicks on Get Started button")
	public void the_user_clicks_on_get_started_button() {
	    array.getstartedarray();
	}

	@Then("The user should be redirected to Arrays page")
	public void the_user_should_be_redirected_to_arrays_page() {
		LoggerLoad.info("User redirects to array Page");
	}

	@Given("The user is in the Arrays in Python")
	public void the_user_is_in_the_arrays_in_python() {
		LoggerLoad.info("User is array phython Page");
	}

	@When("The user clicks on Arrays in Python page")
	public void the_user_clicks_on_arrays_in_python_page() {
	    array.arrayPython();
	}

	@When("user clicks on try here in array page")
	public void user_clicks_on_try_here_in_array_page() {
	    array.tryhere();
	}

	@Then("user enters phython code in array")
	public void user_enters_phython_code_in_array() {
	    array.printcode();
	}

	@Then("user clicks run button and goes back")
	public void user_clicks_run_button_and_goes_back() throws Exception {
	    array.runaaray();
	    LoggerLoad.info("User runs code successfully");
	    array.back();
	}

	@Given("The user clicks on the Practice page")
	public void the_user_clicks_on_the_practice_page() {
	    array.practisequestion();
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
	    array.searcharray();
	}

	@Then("The user should be redirected to Question page contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_an_try_editor_with_run_and_submit_buttons()  {
		LoggerLoad.info("User redirects to practice qns search array Page");
	
	}

	@Then("user redirected to home page")
	public void user_redirected_to_home_page() {
		array.homepage();
	    
	}

}
