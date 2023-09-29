Feature: Validate Vouchers functionality

Scenario: Buy and print voucher
Given visit the site "https://demo.cyclos.org/ui/login" 
When Enter username and password and click on submit
And Click on marketplace
And Click on My Vouchers
And Click on buy voucher
And Select Gift Voucher
And Enter no. of vouchers "1", enter amount "10", select Usage and click on next
And Click on confirmm
Then Click on print option


