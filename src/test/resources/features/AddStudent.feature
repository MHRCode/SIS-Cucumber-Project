@addStudent
Feature: Add New Student

  Scenario: Admin successfully adds a student
    Given I am logged in as Admin
    When I navigate to the "Students" tab and click on "Add New Student"
    And I enter the student details excluding Local ID, Grade Section, and Username
    And I submit the student details
    And A success message displayed 
    And I upload a profile picture for the student
    And I click the "Submit Changes" button to save the uploaded picture
    Then A success message "Successfully Updated" should be displayed
    And The system should display the Username and Password for the student

