package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.dom.model.RGBA;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.hooks.driver;


public class D01_registerStepDef {

    P01_register reg = new P01_register();

    @Given("user go to register page")
    public void goToregister(){

        reg.register().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {

        reg.gender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {

        reg.frstname().sendKeys(arg0);
        reg.lstname().sendKeys(arg1);
        
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {

        Select select1 = new Select(reg.dayList());
        Select select2 = new Select(reg.monthList());
        Select select3 = new Select(reg.yearList());

        select1.selectByValue("10");
        select2.selectByValue("9");
        select3.selectByValue("1994");
        
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        reg.email().sendKeys(arg0);
        
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        reg.password().sendKeys(arg0);
        reg.confirmPassword().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() throws InterruptedException {

        reg.rgstrBtn().click();
        
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

        SoftAssert soft = new SoftAssert();


        soft.assertTrue(reg.message().isDisplayed());

        String colors = reg.textColor().getCssValue("color");

        String colorHex = Color.fromString(colors).asHex();
        soft.assertEquals(colorHex, "#4cb17c");

        soft.assertAll();

    }


}
