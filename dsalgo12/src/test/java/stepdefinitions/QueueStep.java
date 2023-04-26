package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.QueuePage;
import utilities.LoggerLoad;


public class QueueStep {
	
	QueuePage queue=new QueuePage();
	@Given("User is on Home page after Stack")
	public void user_is_on_home_page_after_stack() {
		LoggerLoad.info("User is on Home page after Stack");
	}

	@When("user click on get started button of Queue")
	public void user_click_on_get_started_button_of_queue() throws Exception {
		queue.getstartedqueue();
	}

	@Then("user directed to Queue page")
	public void user_directed_to_queue_page() {
		LoggerLoad.info("User is on Queue page");
	}

	@Given("user is on operation in Queue page")
	public void user_is_on_operation_in_queue_page() {
		LoggerLoad.info("user is on operation in Queue page");
	}

	@When("user clicks on Queue operations button")
	public void user_clicks_on_queue_operations_button() {
		queue.queueoperation();
	}

	@When("user clicks tryhere button of Queue")
	public void user_clicks_tryhere_button_of_queue() {
		queue.tryhere();
	}

	@Then("user is on tryeditor and run page")
	public void user_is_on_tryeditor_and_run_page() {
		LoggerLoad.info("User is on tryeditor page");
	}

	@Given("user is sending python code in text area")
	public void user_is_sending_python_code_in_text_area() {
		queue.queueprint();
	}

	@When("user clicks on run button after code")
	public void user_clicks_on_run_button_after_code() throws InterruptedException {
		queue.run();
	}

	@Then("user get output of code")
	public void user_get_output_of_code() {
		LoggerLoad.info("User is got the output of the code");
	}

	@Then("user redirected to home page after Queue")
	public void user_redirected_to_home_page_after_queue() {
		queue.queuehomeurl();
	}


}
