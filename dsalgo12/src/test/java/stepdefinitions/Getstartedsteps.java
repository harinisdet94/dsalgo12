package stepdefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.GetStartedpage;

public class Getstartedsteps {

	private GetStartedpage gp=new GetStartedpage(DriverFactory.getdriver());
	
	@Given("user enters into dsalgo page")
	public void user_enters_into_dsalgo_page() 
	{
	    DriverFactory.getdriver().get("https://dsportalapp.herokuapp.com/");
	}

	@Then("user clicks Get started")
	public void user_clicks_get_started() {
		gp.getstartclick();
	   
	}


}
