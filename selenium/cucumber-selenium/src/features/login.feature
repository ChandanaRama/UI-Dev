Feature: LoginFeature
This feature deals with longin functionality of the application
Scenario: Login with correct email and password
Given I navigate to the loginpage
And I enter the email and password 
And I click login button
Then I should see the userpage
