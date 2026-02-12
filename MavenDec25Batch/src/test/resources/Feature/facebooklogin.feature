Feature: verifying the facebook page

Scenario: verifying the facebook login page with invalid credentials 

	Given User is on login page
	When User enters the username,password and click login button
	Then User get success message
	
	@Arun
	Scenario: verifying the facebook login page with valid credentials 

	Given User is on login page
	When User enters the username,password and click login button
	Then User get success message
