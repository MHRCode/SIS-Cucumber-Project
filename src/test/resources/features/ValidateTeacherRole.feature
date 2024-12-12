@teacherRole @regression
Feature: Validate Teacher Information

  Scenario: Verify teacher dashboard Information
    Given I navigate to "https://sis.neotechacademy.com/"
    When I log in with teacher credentials "ElionLimanaj4" and "Password123!"
    Then I should see the welcome message "Welcome Limanaj" on the right side
    And I should see the "Personal Information" section
    And I click "show" under "Personal Information"
    And I should see the information:
      | Field         | Value                         |
      | Local ID      |                          1277 |
      | Classroom     | Computer                      |
      | Date of Birth | 1/1/1980                      |
      | Gender        | Male                          |
      | Job Title     | Teacher											  |
    And I should be able to see and click the "Students" tab
