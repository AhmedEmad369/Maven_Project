package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.awt.*;

import static org.example.StepDefs.hooks.driver;

public class D02_loginStepDef {

    P02_login log = new P02_login();
    
    @Given("user go to login page")
    public void goToLogin(){

        
        log.loginBtn().click();
        
    }




    @And("user press on login button")
    public void userPressOnLoginButton() {
        log.lgnButton().click();
        
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {

        SoftAssert soft = new SoftAssert();

        String brntUrl = driver.getCurrentUrl();
        soft.assertEquals(brntUrl, "https://demo.nopcommerce.com/");

        Boolean accnt = log.account().isDisplayed();
        soft.assertTrue(accnt);


        soft.assertAll();
        
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

        SoftAssert soft = new SoftAssert();

        String txtDisplayed = log.errorText().getText();
        soft.assertTrue(txtDisplayed.contains("Login was unsuccessful."));

        String txtColor = log.errorText().getCssValue("color");
        String colorHex = Color.fromString(txtColor).asHex();
        soft.assertEquals(colorHex, "#e4434b");

        soft.assertAll();

    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {

        log.email().sendKeys(arg0);
        log.password().sendKeys(arg1);

    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        log.email().sendKeys(arg0);
        log.password().sendKeys(arg1);
    }

    @When("user enter {string} and {string}")
    public void userEnterAnd(String arg0, String arg1) {

        log.email().sendKeys(arg0);
        log.password().sendKeys(arg1);
    }
}
