Feature: Checking up the Mesaaging feature

Background: Common Login
Given visit the site "https://demo.cyclos.org/ui/login" 
When Enter username and password and click on submit 

@SendingMessageToUser
Scenario: Sending rich text message to user
Then Clicks on the messages
And User clicks on new message
Then Sends the rich text message

@MessageHistory
Scenario: Message history (inbox, sent, trash)
Then User clicks on the messages
And Navigates Inbox Sent Trash

