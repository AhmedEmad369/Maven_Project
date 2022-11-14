@smoke
  Feature: F05_Hover | user hovers and selects one of the main categories and one of it's subcategories
    Scenario: user hover and selects a category and subcategory
      Given user hovers to one of the main categories
      When user selects one of the subcategories
      Then user should be navigated to the subcategory screen