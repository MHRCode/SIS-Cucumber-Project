@verifyStudent @regression
Feature: Login with Student Account and Verify Details

  Scenario: Verify student login and details
    Given User navigates to SIS login page
    When User logs in with username "ObamaSmith7" and password "J97kyel#rr"
    Then User should be logged in successfully
    And Verify Student ID matches "992"
    And Verify Student Name matches "Obama Smith"
    And Verify Grade Section is "5th Grade"
    And Verify Username matches "ObamaSmith7"   
