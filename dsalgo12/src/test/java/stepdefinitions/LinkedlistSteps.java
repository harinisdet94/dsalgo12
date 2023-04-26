package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LinkedListPage;
import utilities.LoggerLoad;


public class LinkedlistSteps {
	LinkedListPage LL=new LinkedListPage();
	@Given("user is on home page")
	public void user_is_on_home_page() {
		LoggerLoad.info("User is on Home page");

	}

	@When("user clicks get started button of Linked List")
	public void user_clicks_get_started_button_of_linked_list() {
		 LL.getstartedLL();
	}

	@Then("user redirected to Linked List")
	public void user_redirected_to_linked_list() {
		LoggerLoad.info("User is on Linked List page");

	}

	@Given("user is on the Linked List page")
	public void user_is_on_the_linked_list_page() {
	   
	}

	@When("user clicks Introduction link")
	public void user_clicks_introduction_link() {
		LL.introduction();  
	}

	@Then("user should be directed to Introduction of Linked List Page")
	public void user_should_be_directed_to_introduction_of_linked_list_page() {
		LoggerLoad.info("User is on Introduction Linked List Page");
	}

	@Then("user clicks Try Here button in the introduction page")
	public void user_clicks_try_here_button_in_the_introduction_page() {
		 LL.tryhere();
	}

	@Then("user redirected to the page having an tryEditor with a Run button to test")
	public void user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User is on page having tryeditor with run button");
	}

	@Given("user is using tryEditor with a Run button to test")
	public void user_is_using_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User is sending code");
	}

	@When("user Enter code")
	public void user_enter_code() {
		 LL.printstatement();
	}

	@When("user click on Run button")
	public void user_click_on_run_button() {
		 LL.run();
	}

	@Then("user should be presented with the Run output")
	public void user_should_be_presented_with_the_run_output() {
		LoggerLoad.info("User received output");
	}

	@Then("user redirected to previous page")
	public void user_redirected_to_previous_page() {
		 LL.backLL();
	}

	@When("user clicks Creating Linked List link")
	public void user_clicks_creating_linked_list_link() {
		LoggerLoad.info("User is on Linked List page");
	}

	@Then("user should be directed to Creating Linked List Page")
	public void user_should_be_directed_to_creating_linked_list_page() {
		 LL.createlinkedlist();
	}

	@Then("user clicks Try Here button in the Creating Linked List page")
	public void user_clicks_try_here_button_in_the_creating_linked_list_page() {
		LoggerLoad.info("User is on creating Linked List page");
		 LL.tryhereLL();
	}

	@Then("user redirected to tryEditor with a Run button to test")
	public void user_redirected_to_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("user navigate to tryeditor and run button");
	}

	@Given("user is using tryEditor and Run button to test")
	public void user_is_using_try_editor_and_run_button_to_test() {
		
	}

	@When("user Enter print code")
	public void user_enter_print_code() {
		LL.printstatementLL(); 
	}

	@When("user to click on Run button")
	public void user_to_click_on_run_button() throws Exception {
		 LL.runLL();
	}

	@Then("user should get Run output")
	public void user_should_get_run_output() {
		 System.out.println("user get output");
	}

	@Then("user redirected to home page after Linked List")
	public void user_redirected_to_home_page_after_linked_list() {
		LL.homeurl();
	}
}
