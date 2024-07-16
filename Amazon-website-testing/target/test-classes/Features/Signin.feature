Feature: Sign in Functionality 
Scenario Outline: To check login is successful with valid credentials
Given User is in Amazon sign in page
When User enters valid mobile number and password
And Clicks on Sign in  Button
Then User is navigated to Home Page
And Close the complete browser