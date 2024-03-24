@smoke
  Feature: F06_Sliders | user selects one of the sliders
    Scenario: user selects the galaxy phone

      When user clicks on the galaxy slider
      Then user should be navigated to the accurate url


      Scenario: user selects the iphone

        When user clicks on the iphone slider
        Then user should be navigated to the iphone url