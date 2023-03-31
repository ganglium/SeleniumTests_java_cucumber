Feature: Search

  @Test
  Scenario: Login to google calenadar
    Given I navigate to application "https://google.com"
    And I enter credentials
      | username   | password     |
      | login      | password     |
    Then I should see if user logged in
    Then I search for text: "Selenium testing"




