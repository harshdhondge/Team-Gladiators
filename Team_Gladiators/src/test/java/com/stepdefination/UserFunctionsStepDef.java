package com.stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.actions.LoginPageActions;
import com.actions.ManageContactsActions;
import com.actions.ManagePasswordActions;
import com.actions.MultiplePhonesActions;
import com.actions.UpdateProfileActions;
import com.utils.ExcelReader;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserFunctionsStepDef {
	UpdateProfileActions updateprofileActions = new UpdateProfileActions();
	LoginPageActions loginpageactions = new LoginPageActions();
	MultiplePhonesActions multiplePhoneactions = new MultiplePhonesActions();
	ManagePasswordActions managepassactions = new ManagePasswordActions();
	ManageContactsActions managecontactsactions = new ManageContactsActions();

	// Scenario 2

	@Given("login to dashboard {string}")
	public void login_to_dashboard(String url) {
		HelperClass.openPage(url);
	}

	@When("Enter team_gladiators and gladiators123 and click on submit")
	public void enter_team_gladiators_and_gladiators123_and_click_on_submit() throws Exception {
		loginpageactions.submit("team_gladiators", "gladiators123");
	}

	@When("click on profile")
	public void click_on_profile() {
		updateprofileActions.clickProfile();
	}

	@When("click on edit button in my profile")
	public void click_on_edit_button_in_my_profile() {
		updateprofileActions.clickOnEditBtn();
	}

//	@When("click in email input and update the email")
//	public void click_in_email_input_and_update_the_email() {
////		updateprofileActions.updatePro();
//		
//	}

	@When("enter the {string} and {int}")
	public void enter_the_and(String email, Integer rownumber) throws Exception, IOException {
		ExcelReader excelReader = new ExcelReader();
		List<Map<String,String>> LoginData= excelReader.getData("src/main/java/com/testData/updateEmail.xls",email);
	    String email1= LoginData.get(rownumber).get("email");
	    updateprofileActions.updateEmail(email1);
	}

	@Then("click on save")
	public void click_on_save() {
		updateprofileActions.clickOnSave();
	}

//	//Scenario 3 : Multiple phones
	@Given("login to your dashboard {string}")
	public void login_to_your_dashboard(String url) {
		HelperClass.openPage(url);
	}

	@When("click add Mobile phone button")
	public void click_add_mobile_phone_button() {
		multiplePhoneactions.removeThisPhone();
		multiplePhoneactions.clickOnAddMobileBtn();

	}

	@When("add mobile name and mobile number")
	public void add_mobile_name_and_mobile_number() {
		multiplePhoneactions.addMobileNameNum();
	}

	@Then("click on save button")
	public void click_on_save_button() {
		updateprofileActions.clickOnSave();
	}

	// for Scenario 4: Manage Password

	@When("click on Passwords")
	public void click_on_passwords() throws InterruptedException {

		managepassactions.clickPasswordBtn();

	}

	@When("click on change")
	public void click_on_change() {
		managepassactions.clickOnChangeBtn();
	}

	@When("enter old pass and new pass")
	public void enter_old_pass_and_new_pass() {
		managepassactions.changePass();
	}

	@Then("click on submit button.")
	public void click_on_submit_button() {
		managepassactions.clickOnSubmit();
	}

	// Scenario 5 manage contacts

	@When("click on Contacts")
	public void click_on_contacts() {
		managecontactsactions.clickOnContacts();
	}

	@When("click on add new button")
	public void click_on_add_new_button() {
		managecontactsactions.clickOnAddNewBtn();
	}

	@When("provide details of contact")
	public void provide_details_of_contact() {
		managecontactsactions.EnterInputText();
	}

	@Then("click on add")
	public void click_on_add() {
		managecontactsactions.clickOnsubmit();
	}
	
	@When("click on the item")
	public void click_on_the_item() {
	    managecontactsactions.clickOnItem();
	}

	@When("click on remove from contacts")
	public void click_on_remove_from_contacts() {
	    managecontactsactions.clickOnRemoveItem();
	}

	@Then("assert an item is deleted from contacts")
	public void assert_an_item_is_deleted_from_contacts() {
	    Assert.assertEquals(managecontactsactions.getAddToContactText(),"Add to contacts");
	}
}
