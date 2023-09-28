Feature: To validate the payments feature in application
Background:
Given User should be on "https://demo.cyclos.org/ui/login"
When Enter Username and Password and click on submit

Scenario: User to user payments
And Click on Pay to user
And Enter "abc", "abcd" and "10" and click on next
And Click on confirm button
Then Asssert the message of successfully processed payment

Scenario: To check the Scheduled Payments in application
#Given User should be on "https://demo.cyclos.org/ui/login"
#When Enter team_gladiators and gladiators123 and click on submit
And click on banking and click on scheduled payments
And Select Status as scheduled
And Click on first transacation from the result which appear
Then assert the message of Scheduled payment details

Scenario: Validating recurring payments functionality of application
#Given User should be on "https://demo.cyclos.org/ui/login"
#When Enter team_gladiators and gladiators123 and click on submit
And Click on Pay to user button
And Enter to user "mister x" then enter description "recurring payment"
And Enter amount "10"
And Select Scheduling as recurring paymets and click future date
And Enter First occurrence date "09/28/2023"
And Select mannually cancelled
And Enter process every "1" and select appropriate month,week or day
And click on next 
And click on confirmBTN
Then Assert the message

Scenario: Validating payment requests functionality of application
#Given User should be on "https://demo.cyclos.org/ui/login"
#When Enter team_gladiators and gladiators123 and click on submit
And click on banking tab and click on payment requests option
And click on send a new request
And Enter receiver Akash and description New_payment_Request
And Enter amount "10" and expiration date "09/28/2023"
And Select scheduling as monthly installments
And Enter no of installments "2" and check the first installment is immediate box
And Click on confirm
Then Click confirm on popup
