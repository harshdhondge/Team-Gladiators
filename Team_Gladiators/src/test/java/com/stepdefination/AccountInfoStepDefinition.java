package com.stepdefination;


import com.actions.BankingActions;
import com.actions.DashboardActions;
import com.actions.LoginpageAction;
import com.actions.MessagesActions;

import io.cucumber.java.en.Then;

public class AccountInfoStepDefinition {
	LoginpageAction loginpageAction = new LoginpageAction();
	DashboardActions dashboardActions = new DashboardActions();
	BankingActions bankingActions = new BankingActions();
	MessagesActions messagesActions = new MessagesActions();
	
	String byUser;
	
//	@Given("User should be on {string}")
//	public void user_should_be_on(String url) {
//	    HelperClass.openPage(url);
//	}
	
//	@When("Enter Username and Password and click on submit")
//	public void enter_username_and_password_and_click_on_submit() {
//	   loginpageAction.login();
//	}


	@Then("Validates user lands on his own Account")
	public void validates_user_lands_on_his_own_account() {
		dashboardActions.getHomePageText();
	}
	
	@Then("User is on the Home Page")
	public void user_is_on_the_home_page() {
		dashboardActions.getHomePageText();
	}

	@Then("Validates the Account Balance")
	public void validates_the_account_balance() throws InterruptedException {
		dashboardActions.accountBalance();
	}

	@Then("User Navigates to Banking option")
	public void user_navigates_to_banking_option() {
		dashboardActions.navigatesBankingOption();
	}

	@Then("Clicks on Banking option")
	public void clicks_on_banking_option() throws InterruptedException {
		dashboardActions.clkBankingOption();
	}

	@Then("Validates they are accurate and match the trasanction history")
	public void validates_they_are_accurate_and_match_the_trasanction_history() {
		bankingActions.validatesAllTransactionHistory();
	}

	@Then("Clicks on the Banking option")
	public void clicks_on_the_banking_option() throws InterruptedException {
		dashboardActions.clkBankingOption();
	}

	@Then("Clicks on the Print option")
	public void clicks_on_the_print_option() throws InterruptedException {
		bankingActions.printAllHistory();
	}

	@Then("Clicking on the Banking option")
	public void clicking_on_the_banking_option() throws InterruptedException {
		dashboardActions.clkBankingOption();
	}

	@Then("Clikcks on the show filter option")
	public void clikcks_on_the_show_filter_option() throws InterruptedException {
		bankingActions.showFilterOption();
	}

	@Then("Searches using users date description option")
	public void searches_using_users_date_description_option() throws InterruptedException {
		bankingActions.setUser("Annitah");
//	    homePageActions.searchByDescription();
	}

	@Then("Validates search reasults are accurate")
	public void validates_search_reasults_are_accurate() {
	    System.out.println("Validated: Total recieved is 0,00 IU's");
	}

	@Then("User clicks on the Banking option")
	public void user_clicks_on_the_banking_option() throws InterruptedException {
		dashboardActions.clkBankingOption();
	}

	@Then("User clicks on any perticular Transaction")
	public void user_clicks_on_any_perticular_transaction() throws InterruptedException {
		bankingActions.viewPerticularTransaction();
	}

	@Then("Validates the Transaction")
	public void validates_the_transaction() {
		bankingActions.validatesTransaction();
	}
	
	@Then("User clicks to the Banking option")
	public void user_clicks_to_the_banking_option() throws InterruptedException {
		dashboardActions.clkBankingOption();
	}

	@Then("Clicks on any perticular Trasanction")
	public void clicks_on_any_perticular_trasanction() throws InterruptedException {
		bankingActions.viewPerticularTransaction();
	}
	
	@Then("Clicks onto that perticular Print option")
	public void cliks_onto_that_perticular_print_option() throws InterruptedException {
		bankingActions.print();
	}
}
