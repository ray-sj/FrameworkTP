Feature: User registration

@Wip
Scenario: intial user registration page
	Given the user have no account setup
	When they click on the registration button
	Then the user registration page is displayed