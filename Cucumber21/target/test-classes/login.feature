Feature: test login functionality

Scenario: check the login is successfull with valid credentials

Given user is on facebook login page
When  user enters the valid username and password
Then  user should click on login button
And    user should click logout button

