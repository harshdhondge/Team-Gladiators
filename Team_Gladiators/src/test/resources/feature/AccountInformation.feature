Feature: Account Information

Background: Common login
Given visit the site "https://demo.cyclos.org/ui/login" 
When Enter username and password and click on submit   

@AccountSummary																											 
Scenario: Verify Successful Account Summary Display
Then Validates user lands on his own Account


@CurrentBalance #Explicit Wait is working      											  
Scenario: Verify Display of Account Balance
Then User is on the Home Page
And Validates the Account Balance 


#@PaymentHistory #No use of explicit wait															 
#Scenario: Display of Payments History
#Then User Navigates to Banking option
#And Clicks on Banking option
#Then Validates they are accurate and match the trasanction history

#@Print #Explicit can't be used                                        
#Scenario: Printing of Payments History
#Then Clicks on the Banking option
#And Clicks on the Print option
#
#@SearchPayment #Explicit Wait is Working   													 
#Scenario: Searching Payments Using the Filters
#Then Clicking on the Banking option
#And Clikcks on the show filter option
#Then Searches using users date description option
#And Validates search reasults are accurate
#
#@ViewPerticularPayment #Explicit is working													 
#Scenario: Viewing the Perticular Transaction from History
#Then User clicks on the Banking option
#And User clicks on any perticular Transaction
#Then Validates the Transaction
#
#@PrintPaymentDetails #Explicit can't be used													 
#Scenario: Printing the Perticular Payment Details
#Then User clicks to the Banking option
#And Clicks on any perticular Trasanction
#Then Clicks onto that perticular Print option
