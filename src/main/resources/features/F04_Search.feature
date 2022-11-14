@smoke
  Feature: F04_Search | user can search for items using keywords or sku
    Scenario: user search for item with keyword
      When user writes a search keyword
      And user clicks the search button
      Then user should see the results of the search

    Scenario: user search for item with sku
      When user writes a search "AP_MBP_13"
      And user clicks the search button
      And user clicks the product displayed
      Then user should see the results of the sku search



