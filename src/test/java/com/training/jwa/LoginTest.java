package com.training.jwa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	@Given("user is an login page")
	public void user_is_an_login_page() {
	    System.out.println("step - user is an login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("step - user enters username and password");

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("step - user clicks on submit button");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("step - user is navigated to the home page");

	}
	
}
