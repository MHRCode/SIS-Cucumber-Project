@regression @login
Feature: Admin Login Validation

  Background: 
    Given I open a browser and navigate to the login page

  Scenario: Validate successful login and navigation to Main Page
    When I enter valid credentials and click the login button
    Then I should be logged in and landed on the Main Page
    And the Announcement section should be visible
    And the company logo should be visible
    And the URL should include "MainPage.aspx"

  Scenario: Validate login failure with invalid credentials
    When I enter invalid credentials and click the login button
    Then I should see an error message
