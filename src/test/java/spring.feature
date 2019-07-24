Feature: Rest Calculator
	
	Scenario: Invoking addition
		Given Rest Api "http://localhost:9509/addition?firstoperand=10&secondoperand=10"
		When I invoking the given rest api
		Then the expected sum is 20
