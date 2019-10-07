#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login to Drink and Delight Application  
 


  Scenario: Display main menu page when I enter correct Username and Password
    Given I am on Drink and Delight Login Page
    When I enter username as "ppai56"
    And I enter password as "1234"
    And I click on "submit" button
    Then The credentials should be successfully validated 
    And Main Menu page is opened
   

 Scenario Outline:  Display error message when I don't Enter Username and Password 
    Given I am on Drink and Delight Login page
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on "submit" button
    Then <error> message is displayed 
     Examples: 
      | username | password | error  |
      |  | 1234 | username is not entered |
      | ppai56 |  | password is not entered |
			| ppai56 | 12344 | incorrect password  |
			| ppai45 | 1234 | invalid username  |
			
			

