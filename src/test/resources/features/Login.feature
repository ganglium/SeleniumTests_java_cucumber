Feature: Login
@Test
  Scenario Outline: Login to google
    Given I navigate to application "https://google.com"
     And I enter credentials
         | username     | password |
         | <user>       |<password>|
    Then I should see if user logged in

    Examples:
      | user      | password     |
      | user1     | password1    |
      | user2     | password2    |
      | user3     | password3    |



