Feature: Entering deals feature

#@smokeTest @sanityTest
#Scenario: Without examples
#
#	#Given As a user should be able to launch the application
#	When user entering the username and password
#	Then user enters the deals 
#	And Entering all the details in deals Page
#	#Then Logout from the application page
	

@sanityTest	
Scenario: With examples
    
	Given user entering the username and password
	Then user enters the deals 
	Given the list string lecture details are
      | title | amount | probability |commision|
      | file | 30 | Associate | new|
	#Then Logout from the application page


