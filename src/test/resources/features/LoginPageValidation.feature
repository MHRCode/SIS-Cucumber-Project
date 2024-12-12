@regression @loginPage
Feature: Validate fields on the Login page

  Scenario: Verify fields on the Login page
    Given I open a browser
    And I navigate to correct url "https://sis.neotechacademy.com/"
    Then I should see the Login page
    And the following fields should be visible:
      | Username        |
      | Password        |
      | Academic Year   |
      | Forgot Password |
      | Login Button    |

  Scenario: Verify Login Page with Incorrect URL
    Given I open a browser
    When I navigate to the URL "https://invalid.neotechacademy.com/"
    Then I should see an error page or message
