package com.stepdefination;

import org.testng.Assert;

import com.actions.DashboardActions;
import com.actions.LoginpageActions;
import com.actions.PaymentRequestActions;
import com.actions.PaymentToUserActions;
import com.actions.RecurringPaymentsActions;
import com.actions.ScheduledPaymentsActions;
import com.locators.PaymentToUserLocators;
import com.locators.ScheduledPaymentsLocators;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentsDefination {
	
	LoginpageActions loginpageActions = new LoginpageActions();
	DashboardActions dashboardActions = new DashboardActions();
	PaymentToUserActions paymentToUserActions = new PaymentToUserActions();
	PaymentToUserLocators paymentToUserLocators = new PaymentToUserLocators();
	ScheduledPaymentsActions scheduledPaymentsActions = new ScheduledPaymentsActions();
	
	@Given("User should be on {string}")
	public void user_should_be_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		HelperClass.openPage(string);
		
	}

//	@When("^Enter (.*) and (.*) and click on submit$")
//	public void enter_and_and_click_on_submit(String string, String string2)  {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
////		loginpageActions.submit(string, string2);
//		loginpageActions.login();
//	}
//	@When("Enter team_gladiators and gladiators123 and click on submit")
//	public void enter_team_gladiators_and_gladiators123_and_click_on_submit() throws Exception {
//		loginpageActions.login();		
//		}
	@When("Enter Username and Password and click on submit")
	public void enter_username_and_password_and_click_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		loginpageActions.login();	
	}

	@When("Click on Pay to user")
	public void click_on_pay_to_user() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		dashboardActions.clickPayUser();
	}

	@When("Enter {string}, {string} and {string} and click on next")
	public void enter_and_and_click_on_next(String string, String string2, String string3) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentToUserActions.makePayment(string, string2, string3);
		
	}

	@When("Click on confirm button")
	public void click_on_confirm_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentToUserActions.clickConfirm();
	}

//	@Then("Assert the message of successfully processed payment")
//	public void assert_the_message_of_successfully_processed_payment() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
////		System.out.println(paymentToUserLocators.popup);
//		Assert.assertTrue(paymentToUserActions.getMSG().contains("You have exceeded the maximum of payments per day for the demo network"));
////		paymentToUserActions.getMSG();
//	}

@Then("Asssert the message of successfully processed payment")
public void asssert_the_message_of_successfully_processed_payment() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//    Assert.assertEquals(paymentToUserActions.getMSG(),"You have exceeded the maximum of payments per day for the demo network");
	paymentToUserActions.clickPopup();
}

//	ScheduledPaymentsActions scheduledPaymentsActions = new ScheduledPaymentsActions();
	

////@Given("User should be on {string}")
////public void user_should_be_on(String string) {
////    // Write code here that turns the phrase above into concrete actions
//////    throw new io.cucumber.java.PendingException();
////	HelperClass.openPage(string);
////}
////
////@When("^Enter (.*) and (.*) and click on submit$")
////public void enter_team_gladiators_and_gladiators123_and_click_on_submit(String string, String string2) {
////    // Write code here that turns the phrase above into concrete actions
//////    throw new io.cucumber.java.PendingException();
////	loginpageActions.submit(string, string2);
////}
//
@When("click on banking and click on scheduled payments")
public void click_on_banking_and_click_on_scheduled_payments() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	scheduledPaymentsActions.clickBanking();
	scheduledPaymentsActions.clickScheduledPayments();
}
@When("Select Status as scheduled")
public void select_status_as_scheduled() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	scheduledPaymentsActions.selectStatus();
	
}
@When("Click on first transacation from the result which appear")
public void click_on_first_transacation_from_the_result_which_appear() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	scheduledPaymentsActions.selectFirstResult();
}

//@Then("asssert the message of Scheduled payment details")
//public void asssert_the_message_of_scheduled_payment_details() {
//   
////	scheduledPaymentsActions.getTextOfFirstResult();
//	Assert.assertEquals(scheduledPaymentsActions.getTextOfFirstResult()," Recurring payment details ");
//}

@Then("assert the message of Scheduled payment details")
public void assert_the_message_of_scheduled_payment_details() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	Assert.assertEquals(scheduledPaymentsActions.getTextOfFirstResult(),"Recurring payment details");
}
////
////
////	
	RecurringPaymentsActions recurringPaymentsActions = new RecurringPaymentsActions();
////	
////	@Given("User should be on {string}")
////	public void user_should_be_on(String string) {
////	    // Write code here that turns the phrase above into concrete actions
//////	    throw new io.cucumber.java.PendingException();
////		HelperClass.openPage(string);
////	}
////
////	@When("^Enter (.*) and (.*) and click on submit$")
////	public void enter_team_gladiators_and_gladiators123_and_click_on_submit(String string, String string2) {
////	    // Write code here that turns the phrase above into concrete actions
//////	    throw new io.cucumber.java.PendingException();
////		loginpageActions.submit(string, string2);
////	}
	@When("Click on Pay to user button")
	public void click_on_pay_to_user_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		dashboardActions.clickPayUser();
	}
	@When("Enter to user {string} then enter description {string}")
	public void enter_to_user_then_enter_description(String string, String string2) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentToUserActions.setToUser(string2);
		paymentToUserActions.writeDescription(string2);
	}
	@When("Enter amount {string}")
	public void enter_amount(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	    paymentToUserActions.setAmount(string);
	}
	@When("Select Scheduling as recurring paymets and click future date")
	public void select_scheduling_as_recurring_paymets_and_click_future_date() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		recurringPaymentsActions.clickSchedulingDropdown();
		recurringPaymentsActions.clickFutureDate();
	}
	@When("Enter First occurrence date {string}")
	public void enter_first_occurrence_date(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		recurringPaymentsActions.selectFirstOccuranceDate(string);
	}
	@When("Select mannually cancelled")
	public void select_mannually_cancelled() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		recurringPaymentsActions.manuallyCancelled();
	}

	@When("Enter process every {string} and select appropriate month,week or day")
	public void enter_process_every_and_select_appropriate_month_week_or_day(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		recurringPaymentsActions.processEveryNumberEnter(string);
		recurringPaymentsActions.processEveryDropdown();
	}

	@When("click on next")
	public void click_on_next() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		recurringPaymentsActions.clickNextBTN();
	}

	@When("click on confirmBTN")
	public void click_on_confirmBTN() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		recurringPaymentsActions.clickConfirmBTN();
	}
	@Then("Assert the message")
	public void assert_the_message() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		recurringPaymentsActions.clickCrossPopup();
	}
	
	PaymentRequestActions paymentRequestActions = new PaymentRequestActions();
//	
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
////	    throw new io.cucumber.java.PendingException()
//		loginpageActions.submit(string, string2);
//	}
//
	@When("click on banking tab and click on payment requests option")
	public void click_on_banking_tab_and_click_on_payment_requests_option() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		scheduledPaymentsActions.clickBanking();
		paymentRequestActions.clickPaymentRequest();
	}

	@When("click on send a new request")
	public void click_on_send_a_new_request() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentRequestActions.clickSendNewRequest();
	}

	@When("^Enter receiver (.*) and description (.*)$")
	public void enter_receiver_and_description(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentRequestActions.sendReceiverAndDescription(string, string2);
	}

	@When("Enter amount {string} and expiration date {string}")
	public void enter_amount_and_expiration_date(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentRequestActions.enterAmountandExpirationDate(string, string2);
	}

	@When("Select scheduling as monthly installments")
	public void select_scheduling_as_monthly_installments() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentRequestActions.selectScheduling();
	}

	@When("Enter no of installments {string} and check the first installment is immediate box")
	public void enter_no_of_installments_and_check_the_first_installment_is_immediate_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentRequestActions.enterNoOfInstallmentandCheckBox(string);
	}

	@When("Click on confirm")
	public void click_on_confirm() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		paymentRequestActions.clickConfirm();
	}

	@Then("Click confirm on popup")
	public void click_confirm_on_popup() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		Assert.assertTrue(paymentRequestActions.popupConfirmButton().contains("Are you sure to send this payment request?"));
//		paymentRequestActions.popupConfirmButton();
//		paymentRequestActions.popupConfirmButton();
//		System.out.println(paymentRequestActions.text);
//		Assert.assertEquals(paymentRequestActions.popupConfirmButton(), "Confirm");
		paymentRequestActions.popupConfirmButton();
	}



	
}
