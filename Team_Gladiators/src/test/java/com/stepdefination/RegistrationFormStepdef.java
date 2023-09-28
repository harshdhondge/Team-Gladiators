package com.stepdefination;

import org.testng.Assert;

import com.actions.RegistrationFormActions;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationFormStepdef {
	RegistrationFormActions registrationformactions = new RegistrationFormActions();


	@Given("visit this site {string}")
	public void visit_this_site(String url) {
		HelperClass.openPage(url);
	}

	@When("provide valid data in each field")
	public void provide_valid_data_in_each_field() {
		registrationformactions.register();
	}

	@Then("Assert the Finish registration")
	public void assert_the_finish_registration() {
		Assert.assertEquals(registrationformactions.finishRegistrationText(), "Finish registration");

	}

}
