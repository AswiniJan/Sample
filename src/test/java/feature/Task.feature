
@tag
Feature: Create Loan for a client
  
  @first_One
  Scenario: Validate the valid username and password
    When Enter the username "qatest@habile.in"
    And Enter the password "Qatest123$"
    And Click the signin button
    Then Validate the Home Page
