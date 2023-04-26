package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.GraphPage;
import utilities.LoggerLoad;


public class GraphSteps {
	
	GraphPage gp=new GraphPage();

	@Given("user is on Home Page after Tree")
	public void user_is_on_home_page_after_tree() {
		LoggerLoad.info("User is on Home page");
	}

	@When("user click on get started button of Graph")
	public void user_click_on_get_started_button_of_graph() {
		 gp.getstartedgraph();
	}

	@Then("user directed to Graph page")
	public void user_directed_to_graph_page() {
		LoggerLoad.info("User is on Graph Page");
	}

	@Given("user is on Graph page")
	public void user_is_on_graph_page() {
		LoggerLoad.info("User checking Graph operation");
	}

	@When("user clicks on Graph button")
	public void user_clicks_on_graph_button() {
		gp.Graphbtn();
	}

	@When("user clicks tryhere button of Graph")
	public void user_clicks_tryhere_button_of_graph() {
		 gp.tryhere();
	}

	@Then("user is on tryeditor and run button Graph page")
	public void user_is_on_tryeditor_and_run_button_graph_page() {
		LoggerLoad.info("User checking Text area");
	}

	@Given("user is sending python code in Tryeditor")
	public void user_is_sending_python_code_in_tryeditor() {
		gp.print();
	}

	@When("user clicks on run button of Graph")
	public void user_clicks_on_run_button_of_graph() throws Exception {
		gp.run();
	}

	@Then("user get output of Graph")
	public void user_get_output_of_graph() {
		LoggerLoad.info("User get Output");
	}

	@Then("user redirected to back after Graph")
	public void user_redirected_to_back_after_graph() {
		 gp.back();
	}

	@Given("user is on Graph page again")
	public void user_is_on_graph_page_again() {
		LoggerLoad.info("User is on Graph");
	}

	@When("user clicks on Graph representation button")
	public void user_clicks_on_graph_representation_button() {
		gp.Gpresentation();
	}

	@When("user clicks tryhere button of Graph representation")
	public void user_clicks_tryhere_button_of_graph_representation() {
		gp.tryGpresentation();
	}

	@Then("user is on tryeditor and run button Graph representation page")
	public void user_is_on_tryeditor_and_run_button_graph_representation_page() {
		LoggerLoad.info("User checking try Editor");
	}

	@Given("user is sending python code in Tryeditor of Graph representation")
	public void user_is_sending_python_code_in_tryeditor_of_graph_representation() {
		 gp.printcode();
	}

	@When("user clicks on run button of Graph representation")
	public void user_clicks_on_run_button_of_graph_representation() throws Exception {
		gp.runbtn();
	}

	@Then("user get output of Graph representation")
	public void user_get_output_of_graph_representation() {
		LoggerLoad.info("User get Output");
	}

	@Then("user redirected to Home page after Graph")
	public void user_redirected_to_home_page_after_graph() {
		gp.homepage();
	}

	@Given("User is on Home page")
	public void user_is_on_home_page() {
		LoggerLoad.info("User is on Home page");
	}

	@When("user clicks Sign out")
	public void user_clicks_sign_out() {
		gp.signout();
	}

	@Then("user successfully Sign Out from DS algo")
	public void user_successfully_sign_out_from_ds_algo() {
		LoggerLoad.info("User successfully Sign Out from DS algo");
	}

}
