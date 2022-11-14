package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;
import static org.example.StepDefs.hooks.driver;

public class D06_homeSlidersStepDef {
    
    P03_homePage slider = new P03_homePage();

    SoftAssert soft = new SoftAssert();
    
    @Given("user clicks on the nokia slider")
    public void choosingSlider(){
        
        slider.nokia().click();
        
    }

    @Then("user should be navigated to the accurate url")
    public void userShouldBeNavigatedToTheAccurateUrl() {

        String url = driver.getCurrentUrl();

        soft.assertEquals(url, "https://demo.nopcommerce.com/nokia-lumia-1020");

        soft.assertAll();
        
    }

    @When("user clicks on the iphone slider")
    public void userClicksOnTheIphoneSlider() {

        slider.iphone().click();
        
    }

    @Then("user should be navigated to the iphone url")
    public void userShouldBeNavigatedToTheIphoneUrl() {

        String url = driver.getCurrentUrl();

        soft.assertEquals(url, "https://demo.nopcommerce.com/iphone-6");

        soft.assertAll();

    }
}
