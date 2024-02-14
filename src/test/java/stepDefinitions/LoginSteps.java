package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("^user in on Login page$")
	public void user_in_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user in on Login page");
	    
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters username and password");
	    
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clicks on login button");
	   
	}

	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to homepage");
	    
	}

}
