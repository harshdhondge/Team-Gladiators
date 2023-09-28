Feature: check user functionalities

@s1
Scenario: Registration form
Given visit this site "https://license.cyclos.org/app/home"
When click on register button
And provide valid data in each field
And Scroll Down
Then Assert the Finish registration

@s2
Scenario: Update Profile
Given login to dashboard "https://demo.cyclos.org/ui/login"
When click on profile
And click on edit button in my profile
And add address and mobile phone
Then click on save

@s3
Scenario: Multiple Address
Given login to your dashboard
When click on profile
And click add adress button
Then Assert the address

@s4
Scenario: Multiple phones
Given login to your dashboard
When click on profile
And click add Mobile phone button
And add mobile number
Then click on save button

@s5
Scenario: Multiple passwords
Given login to your dashboard
When click on Passwords
And click on change
And enter old pass and new pass
Then click on submit button

@s6
Scenario: Notification prefernce
Given login to your dashboard
When click on Notification
Then mark the unread check box

@s7
Scenario: Manage Contacts
Given login to your dashboard
When click on Contacts
And click on add new button
And provide details of contact
Then click on add 

