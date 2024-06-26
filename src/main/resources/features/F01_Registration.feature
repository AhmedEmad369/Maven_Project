@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
  Given user go to register page
  When user select gender type
  And user enter first name "Ahmed" and last name "Emad"
    And user enter date of birth
  And user enter email "ae20@test.com" field
  And user fills Password fields "P@ssw0rd" "P@ssw0rd"
  And user clicks on register button
  Then success message is displayed