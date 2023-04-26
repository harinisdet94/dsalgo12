package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.StackPage;
import utilities.LoggerLoad;


public class StackSteps {
	StackPage stack=new StackPage();
	
	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		LoggerLoad.info("user is on Home Page after Linked List");
	}

	@When("user click on get started button of stack")
	public void user_click_on_get_started_button_of_stack() {
		stack.getstartedstack();
	}

	@Then("user directed to Stack page")
	public void user_directed_to_stack_page() {
		LoggerLoad.info("User os on Stack Page");
	}

	@Given("user is on operation in Stack page")
	public void user_is_on_operation_in_stack_page() {
		LoggerLoad.info("user checking functionality");
	}

	@When("useer clicks on operation in stacks button")
	public void useer_clicks_on_operation_in_stacks_button() {
		 stack.operationstack();
	}

	@When("user clicks tryhere button")
	public void user_clicks_tryhere_button() {
		 stack.tryhere();
	}

	@Then("user is on tryeditor and run button page")
	public void user_is_on_tryeditor_and_run_button_page() {
		LoggerLoad.info("User is on tryeditor page");
	}

	@Given("user is sending python code")
	public void user_is_sending_python_code() {
		stack.stackprint();
	}

	@When("user clicks on run button")
	public void user_clicks_on_run_button() throws Exception {
		stack.run();
	}

	@Then("user get output")
	public void user_get_output() {
		LoggerLoad.info("User get Output");
	}

	@Then("user redirected to home page after Stack")
	public void user_redirected_to_home_page_after_stack() {
		stack.stackhomeurl();
	}
}
