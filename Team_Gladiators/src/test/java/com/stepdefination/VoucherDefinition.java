package com.stepdefination;

import com.actions.LoginpageAction;
import com.actions.VoucherActions;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VoucherDefinition {
	LoginpageAction loginpageActions = new LoginpageAction();

	VoucherActions voucherActions = new VoucherActions();

	

//	@Given("User should be on {string}")
//	public void user_should_be_on(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();

//		HelperClass.openPage(string);

//	}

//

//	@When("^Enter (.*) and (.*) and click on submit$")

//	public void enter_team_gladiators_and_gladiators123_and_click_on_submit(String string, String string2) {

//	    // Write code here that turns the phrase above into concrete actions

////	    throw new io.cucumber.java.PendingException();

//		loginpageActions.submit(string, string2);

//	}

 

	@Given("User should be on website {string}")

	public void user_should_be_on_website(String string) {

	    // Write code here that turns the phrase above into concrete actions

//	    throw new io.cucumber.java.PendingException();

		HelperClass.openPage(string);

	}

 

//	@When("^Now enter (.*) and (.*) and click on submit$")

//	public void now_enter_team_gladiators_and_gladiators123_and_click_on_submit(String string, String string2) {

//	    // Write code here that turns the phrase above into concrete actions

////	    throw new io.cucumber.java.PendingException();

//		loginpageActions.submit(string, string2);

//	}

	@When("Now enter Username and Password and click on submit")

	public void now_enter_username_and_password_and_click_on_submit() {

	    // Write code here that turns the phrase above into concrete actions

//	    throw new io.cucumber.java.PendingException();

	    loginpageActions.login();

	}

	

	@When("Click on marketplace")

	public void click_on_marketplace() {

	    // Write code here that turns the phrase above into concrete actions

//	    throw new io.cucumber.java.PendingException();

		voucherActions.clickMarketPlace();

	}

 

	@When("Click on My Vouchers")

	public void click_on_my_vouchers() {

	    // Write code here that turns the phrase above into concrete actions

//	    throw new io.cucumber.java.PendingException();

		voucherActions.clickMyVoucher();

	}

 

	@When("Click on buy voucher")

	public void click_on_buy_voucher() {

	    // Write code here that turns the phrase above into concrete actions

//	    throw new io.cucumber.java.PendingException();

		voucherActions.clickBuyVouchers();

	}

 

	@When("Select Gift Voucher")

	public void select_gift_voucher() {

	    // Write code here that turns the phrase above into concrete actions

//	    throw new io.cucumber.java.PendingException();

		voucherActions.clickGiftVoucher();

	}

 

	@When("Enter no. of vouchers {string}, enter amount {string}, select Usage and click on next")
	public void enter_no_of_vouchers_enter_amount_select_usage_and_click_on_next(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		voucherActions.giftVoucher(string, string2);
	}

 

	@When("Click on confirmm")
	public void click_on_confirmm() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		voucherActions.clickConfirm();
	}

	@Then("Click on print option")
	public void click_on_print_option() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		voucherActions.clickPrint();
	}
}
