package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage cur = new P03_homePage();

    Select select = new Select(cur.currenciesList());

    @Given("user clicks on the currencies dropdown list")
    public void currencySelect(){

        cur.currenciesList().click();

    }


    @And("user chooses euro as currency")
    public void userChoosesEuroAsCurrency() {

        select.selectByVisibleText("Euro");

    }

    @Then("the items' prices should change accordingly")
    public void theItemsPricesShouldChangeAccordingly() {



        for (int i = 0; i < cur.pricesList().size(); i++){

           String price =  cur.pricesList().get(i).getText();
           Assert.assertTrue(price.contains("€"));

        }

    }
}
