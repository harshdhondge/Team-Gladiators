Feature: Login Feature

@Valid
Scenario Outline: Login with a valid credential
   Given User should be on login page
   When User enter username <username> and password <password>
   And User click submit button 
   Then User should be on homepage

    Examples: 
      | username 				| password      |
      | team_gladiators | gladiators123 |

  @InValid
  Scenario Outline: Login with an invalid credential
   Given User should be on login page
   When User enter username <username> and password <password>
   And User click submit button 
   Then User should not be on homepage

    Examples: 
      | username 				| password       |
      | team_gladiators | gladiators1234 |