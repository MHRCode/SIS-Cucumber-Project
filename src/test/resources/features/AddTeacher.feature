@addTeacher
Feature: Add a new Staff/Faculty Member

  Scenario: Successfully add a new teacher staff member
    Given I am logged in as an admin
    When I navigate to the "Personal Info" tab in the Staff/Faculty section
    And I click on "Add New"
    And I fill in the staff member details with the following information:
      | First Name    | Elion                     |
      | Last Name     | Limanaj                   |
      | Job Title     | Teacher                   |
      | Date of Birth | 01/01/1980                |
      | SSN           | 123-45-6789               |
      | Gender        | Male                      |
      | Password      | Password123!              |
      | Address       | 123 Main St               |
      | City          | Edison		                |
      | State         | NJ                        |
      | Zip Code      | 23897										  |
      | Cell Phone    | (555) 123-4567            |
      | Department    | Computer and Technology   |
      | Advisor       | 5th Grade                 |
      | Homeroom      | 5th Grade                 |
      | Classroom     | Computer                  |
      | Email         | ELimanaj@aol.com				  |
    And I upload a photo
    And I click "Submit"
    Then the new staff member should be listed with the correct details
