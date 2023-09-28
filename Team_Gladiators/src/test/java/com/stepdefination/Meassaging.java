package com.stepdefination;

import com.actions.DashboardActions;
import com.actions.MessagesActions;

import io.cucumber.java.en.Then;

public class Meassaging {
	MessagesActions messagesActions = new MessagesActions();
	DashboardActions dashboardActions = new DashboardActions();
	
	@Then("Clicks on the messages")
	public void clicks_on_the_messages() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		dashboardActions.clkMessagesOption();
	}

	@Then("User clicks on new message")
	public void user_clicks_on_new_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		messagesActions.clkNewMessageOption();
	}

	@Then("Sends the rich text message")
	public void sends_the_rich_text_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		messagesActions.sendRichMessage();
	}

	@Then("User clicks on the messages")
	public void user_clicks_on_the_messages() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		messagesActions.clkMessagesOption();
	}
	
	@Then("Navigates Inbox Sent Trash")
	public void navigates_inbox_sent_trash() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		messagesActions.inboxSentTrash();
	}
}
