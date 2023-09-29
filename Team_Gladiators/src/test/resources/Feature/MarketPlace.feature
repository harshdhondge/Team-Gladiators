Feature: Marketplace verification
Background:
Given visit the site "https://demo.cyclos.org/ui/login" 
When Enter username and password and click on submit 
Given click on Marketplace
@s1
Scenario: schedule advertisement 
When go to my advertisement
And click on new advertisement
Then create advertisement

@s2
Scenario: select address per advertisement
When go to business dir
And click on advertisemen
Then Assert Address


@s3
Scenario: Custom search filters
When click on Advertisement
And click on show more filters
And add filters 


@s4
Scenario: category browsing
Given go to advertisements
When search for food 
And click on food


@s5
Scenario: orderBy advertisement categories
Given go to business directory
When click on orderBy
Then click on it

@s6
Scenario: custom advertisement fields
Given go to advertisement interests
When click on add new
And fill the valid data 
Then click on add

