Feature: Register form

 @s1
  Scenario: Registration form
  Given visit this site "https://license.cyclos.org/app/guest/register"
  When provide valid data in each field
  Then Assert the Finish registration

 