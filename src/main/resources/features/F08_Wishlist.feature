@smoke
Feature: F08_Wishlist | user can select an item and add it to the wishlist
  Scenario: user adds item to the wishlist
    When user clicks on the heart shape on one of the products
    Then the item will be added to the wishlist



    Scenario: the number of items in wishlist increases
      When user clicks on the heart shape on one of the products
      Then the number of items in the wishlist will increase