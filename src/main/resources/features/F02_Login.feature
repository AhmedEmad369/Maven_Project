@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
  Given user go to login page
  When user login with valid "ae19@test.com" and "P@ssw0rd"
  And user press on login button
  Then user login to the system successfully



  Scenario: user could login with invalid email and password
  Given user go to login page
  When user login with invalid "wrong@example.com" and "P@ssw0rd"
  And user press on login button
  Then user could not login to the system

  Scenario Outline: user login to the system
    Given user go to login page
    When user enter "<username>" and "<password>"
    Then user press on login button

    Examples:
      | username | password |
      | ae18@test.com | P@ssw0rd |
      | ae19@test.com | P@ssw0rd |
      | ae20@test.com | P@ssw0rd |