Feature: As a user, should be able to verify the deals page

#@Regression
#@Sanity
Scenario: Test

	#Given As a user should be able to launch the application
	When user entering the username and password
	#Then Logout from the application page

	
Scenario Outline:new login

	#Given As a user should be able to launch the application
	When user entering the "<username>" and "<password>"
	#Then Logout from the application page
	
	Examples:
	|username|password|
	|kannan21109444@gmail.com|Aswath555.|
	
	