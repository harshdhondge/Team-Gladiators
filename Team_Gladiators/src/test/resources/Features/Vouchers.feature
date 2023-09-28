Feature: Validate Vouchers functionality

Scenario: Buy and print voucher
Given User should be on website "https://demo.cyclos.org/ui/login"
When Now enter Username and Password and click on submit
And Click on marketplace
And Click on My Vouchers
And Click on buy voucher
And Select Gift Voucher
And Enter no. of vouchers "1", enter amount "10", select Usage and click on next
And Click on confirmm
Then Click on print option


