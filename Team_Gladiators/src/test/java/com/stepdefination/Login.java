package com.stepdefination;

import com.actions.LoginpageAction;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login {
	LoginpageAction loginpageAction = new LoginpageAction();
	
	@Given("visit the site {string}")
	public void visit_the_site(String url) throws InterruptedException {
	   HelperClass.openPage(url);
	   
	}

	@When("Enter username and password and click on submit")
	public void enter_username_and_password_and_click_on_submit() {
	   loginpageAction.login();
	   
	}

}
