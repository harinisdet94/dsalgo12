package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.TreePage;
import utilities.LoggerLoad;

public class TreeSteps {
	TreePage tree=new TreePage();
	@Given("The user is on home page after 	Queue")
	public void the_user_is_on_home_page_after_queue() {
		LoggerLoad.info("User is on home page after Queue operation");
	}

	@When("The user clicks on Get Started button of Tree")
	public void the_user_clicks_on_get_started_button_of_tree() {
		tree.getstartedtree();
	}

	@Then("The user should be redirected to Tree page")
	public void the_user_should_be_redirected_to_tree_page() {
		LoggerLoad.info("User is on Tree Page");
	}

	@Given("The user is on Tree page")
	public void the_user_is_on_tree_page() {
		LoggerLoad.info("User is on Tree page");
	}

	@When("The user clicks on Overvies of Trees")
	public void the_user_clicks_on_overvies_of_trees() {
		tree.overviewtree();
	}

	@When("user clicks on try here page Tree")
	public void user_clicks_on_try_here_page_tree() {
		tree.tryhere();
	}

	@Then("The user redirected to a Tree page having an tryEditor with a Run button")
	public void the_user_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button() {
		LoggerLoad.info("User can enter code");
	}

	@Given("The user sending code")
	public void the_user_sending_code() {
		tree.printoverview();
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() throws Exception {
		tree.run();
	}

	@Then("The user should get Output")
	public void the_user_should_get_output() {
		LoggerLoad.info("User get Output");
	}

	@Then("user navigate to back")
	public void user_navigate_to_back() {
		tree.previouspage();
	}

	@Given("The user is on Tree page again")
	public void the_user_is_on_tree_page_again() {
		System.out.println("User is on Tree Page");
	}

	@When("The user clicks on Terminologies")
	public void the_user_clicks_on_terminologies() {
		tree.terminologies();
	}

	@When("user clicks to try here page Terminologies")
	public void user_clicks_to_try_here_page_terminologies() {
		tree.trybutton();
	}

	@Then("The user redirected to a Tree page having an tryEditor")
	public void the_user_redirected_to_a_tree_page_having_an_try_editor() {
		LoggerLoad.info("User Redirected to Try Editor");
	}

	@Given("The user sending code in textarea")
	public void the_user_sending_code_in_textarea() {
		tree.printterminologies();
	}

	@When("The user clicks on run button after code")
	public void the_user_clicks_on_run_button_after_code() throws Exception {
		tree.runbutton();
	}

	@Then("The user get Output for Terminologies")
	public void the_user_get_output_for_terminologies() {
		LoggerLoad.info("User get Output for Terminologies");
	}

	@Then("user navigate back page")
	public void user_navigate_back_page() {
		tree.previouspagetree();
	}

	@Given("The user is Tree page one more time")
	public void the_user_is_tree_page_one_more_time() {
		LoggerLoad.info("User is on Tree Page");
	}

	@When("The user clicks on Types of Tree")
	public void the_user_clicks_on_types_of_tree() {
		tree.typesoftree();
	}

	@When("user clicks to try button")
	public void user_clicks_to_try_button() {
		tree.tryb();
	}

	@Then("The user redirected to a Types of Tree page having an tryEditor")
	public void the_user_redirected_to_a_types_of_tree_page_having_an_try_editor() {
		LoggerLoad.info("User is on Try Editor Page");
	}

	@Given("The user sending python code")
	public void the_user_sending_python_code() {
		tree.printtypestree();
	}

	@When("The user clicks on run after code")
	public void the_user_clicks_on_run_after_code() throws Exception {
		tree.runb();
	}

	@Then("The user get Output for Typer of Trees")
	public void the_user_get_output_for_typer_of_trees() {
		LoggerLoad.info("User get Output");
	}

	@Then("user navigate home page after Tree")
	public void user_navigate_home_page_after_tree() {
		tree.homepage();
	}

}
