Feature: Test facebook smoke scenario

	Scenario: Login with valid credentials
	Given Open chrome and start application
	When I enter valid username and password 
	Then user should be able to login successfully

	Scenario: Login with valid credentials
	Given Open chrome1 and start application
	When I enter valid "Hari" and "Karepe" 
	Then user should be able to login1 successfully