package com.stepdefination;

import org.testng.Assert;

import com.actions.LoginpageActions;
import com.locators.LoginpageLocators;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefination {
	
	LoginpageActions loginpageActions = new LoginpageActions();
	LoginpageLocators loginpageLocators = new LoginpageLocators();
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		HelperClass.openPage("https://demo.cyclos.org/ui/login");
	}

	@When("^User enter username (.*) and password (.*)$")
	public void user_enter_username_username_and_password_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		loginpageActions.setUsername(username);
		loginpageActions.setPassword(password);
	}

	@When("User click submit button")
	public void user_click_submit_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		loginpageActions.clickSubmit();
		Thread.sleep(3000);
	}

	@Then("User should be on homepage")
	public void user_should_be_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demo.cyclos.org/ui/dashboard");
	}

	@Then("User should not be on homepage")
	public void user_should_not_be_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertNotEquals(HelperClass.getDriver().getCurrentUrl(), "https://demo.cyclos.org/ui/dashboard");
	}

}
