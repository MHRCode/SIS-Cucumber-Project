@enrollStudent
Feature: Enroll a student and verify enrollment

  Scenario: Enroll a student and verify enrollment status
    Given I am logged in as an admin with username "Admin" and password "Neotech$123"
    When I search for the student I created
    And I enroll the student by filling out the required information
    Then I should verify that the student's status is "Enrolled" in the student search results
    And I should verify that the student's enrollment status is "Enrolled" in the enrollment sub-tab
