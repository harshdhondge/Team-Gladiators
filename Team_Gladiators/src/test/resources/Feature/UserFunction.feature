Feature: check user functionalities
	Background:
		Given visit the site "https://demo.cyclos.org/ui/login" 
    When Enter username and password and click on submit

  
  @s2
  Scenario: Update Profile
  And click on profile
  And click on edit button in my profile
  And enter the "<SheetName>" and <Rownumber>
  Then click on save
  
    Examples: 
      | SheetName          | Rownumber | 
      | UpdateDataSheet    |     0     |
  


  @s3
  Scenario: Multiple phones
   	And click on profile
   	And click on edit button in my profile
    And click add Mobile phone button
    And add mobile name and mobile number
    Then click on save button
@s4
Scenario: Manage passwords
And click on profile
When click on Passwords
And click on change
And enter old pass and new pass
Then click on submit button.


@s5
Scenario: Manage Contacts
When click on Contacts
And click on add new button
And provide details of contact
And click on add1
And click on the item
And click on remove from contacts 
Then assert an item is deleted from contacts

