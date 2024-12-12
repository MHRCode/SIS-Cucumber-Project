@addParents
Feature: Add Primary and Secondary Parents for a Student

  Scenario: Successfully add primary and secondary parents
    Given I log in as an admin
    When I navigate to the Students tab
    And I select a student
    And I add a primary parent with details "Steve white", "twhite@aol.com", "123-456-7890", "Father"
    And I add a secondary parent with details "Jane white", "swhite@aol.com", "987-654-3210", "Mother"
    Then I should see both parents saved with generated credentials