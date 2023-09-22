Feature: Marketplace verification

@s1
Scenario: schedule advertisement 
Given click on Marketplace
When go to my advertisement
And click on new advertisement
Then create advertisement

@s2
Scenario: select address per advertisement
Given click on marketplace
When go to business directory
And click on advertisement
Then Assert Address

@s3
Scenario: Custom search filters
Given click on Advertisement
When click on show more filters
And add filters 
Then click on show advertisement

@s4
Scenario: List new advertisement
Given click on my advertisement
When click add new
And fill the data with valid credentials
Then click on save 

@s5
Scenario: category browsing
Given go to advertisements
When click on categories
Then assert category

@s6
Scenario: Multiple advertisement categories
Given go to advertisements
When click on categories

@s7
Scenario: custom advertisement fields
Given go to advertisement interests
When click on add new
And fill the valid data 
Then click on add

