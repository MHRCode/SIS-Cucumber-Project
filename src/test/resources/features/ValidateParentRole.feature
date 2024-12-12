@validateParent @regression
Feature: Validate Parent Dashboard Display

  Scenario: Validate the parent dashboard and details display upon login
    Given I am on the login page
    When I log in with valid credentials as "stevwhite" and "Jiu87k"
    Then I should see the parent profile section with the following details:
      | Full Name  | Steve White       |
      | Address    | 98 Ave NY         |
      | Work Phone | 123-456-7890      |
      | Cell Phone |                   |
      | Email      | twhite@aol.com    |
    And I should see the student section with the following details:
      | Student Name  | Obama Smith |
      | Student ID    | 992         |
      | Grade Level   | 5           |
      | Date of Birth | 9/20/2008   |
    And I should see the following navigation tabs:
      | Tab          |
      | Main Page    |
      | Attendance   |
      | Grades       |
      | Homework     |
      | Results      |
      | Schedule     |
      | Discipline   |
