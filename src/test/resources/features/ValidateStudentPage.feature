@studentPage @regression
Feature: Student Page Validation

  Scenario: Validate all sub-tabs are visible under the Students tab
    Given I am on the login page
    When I login as Admin with username "Admin", password "Neotech$123", and academic year "2020-2021"
    Then I should be on the homepage
    When I navigate to the "Students" tab
   Then I should see the following sub-tabs:
| Personal             |
| Parental             |
| Academic             |
| Override Final Grade |
| Schedule             |
| Discipline Stats     |
| Personal 2           |
| Enrollment           |
| Notes                |
| E-Portfolio          |
| Program Enrollment   |
