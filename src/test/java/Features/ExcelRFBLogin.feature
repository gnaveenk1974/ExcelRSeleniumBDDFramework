Feature: Facebook Login
Scenario: Validate with valid credentials
Given user in on the login page
When user enters username "testvalid" and password "correctpassword"
Then user clicks on the login button
And user shoud be logged in successfully

Scenario: Validate with invalid logni credentials
Given user in on the login page
When user enters username "invalidusername" and password "wrongpassword"
 
Then user clicks on the login button
And user shoud not be logged in successfully

