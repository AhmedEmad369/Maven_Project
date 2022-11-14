@smoke
  Feature: F03_Currencies | user could change the currencies and the changes takes place in the system
    Scenario: user changes the currencies and the changes are done successfully
      When user clicks on the currencies dropdown list
      And user chooses euro as currency
      Then the items' prices should change accordingly
