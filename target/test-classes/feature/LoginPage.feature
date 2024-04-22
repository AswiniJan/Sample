Feature: LoginPage Validation

  Background: 
    Given Login to the Application

	@first_Onee
  Scenario: Validate the valid username and password
    When Enter the username "Aiite"
    And Enter the password "Aiite234567"
    And Click the loginbutton
    Then Validate the Home Page

	
  Scenario: Validate the invalid username and password
    When Enter the username "Aiite23424"
    And Enter the password "Aiite234567e24343434"
    And Click the loginbutton
    Then Validate the Home Page

  
  Scenario: Validate the invalid username and correct password
    When Enter the invalid username "Aiite23424"
    And Enter the correct password "Aiite234567e24343434"
    And Click the loginbutton
    Then Validate the Home Page
