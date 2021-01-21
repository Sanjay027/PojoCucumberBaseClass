Feature: verify the BlazeDemo details

Scenario: verifying BlazeDemo with valid credentials

Given user is on the BlazeDemo pages
When  user should enter username and passwords
And   user should click the login buttons
And   user should enter the valid datas
Then  user should verify the success msg
