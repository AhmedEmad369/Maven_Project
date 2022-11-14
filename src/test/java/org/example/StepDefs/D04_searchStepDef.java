package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;
import static org.example.StepDefs.hooks.driver;

public class D04_searchStepDef {
    
    P03_homePage search = new P03_homePage();
    SoftAssert soft = new SoftAssert();
    
    @Given("user writes a search keyword")
    public void searchField(){

        search.searchField().sendKeys("book");
        
    }

    @And("user clicks the search button")
    public void userClicksTheSearchButton() {

        search.searchButton().click();
        
    }

    @Then("user should see the results of the search")
    public void userShouldSeeTheResultsOfTheSearch() {

        String currentUrl = driver.getCurrentUrl();
        soft.assertTrue(currentUrl.contains("https://demo.nopcommerce.com/search?q="));

        int itemsNumber = search.productItems().size();
        System.out.println("the number of items is: " + itemsNumber);

        for (int i = 0; i < search.productItems().size(); i++ ){

            String titleTxt = search.productTitle().get(i).getText();
            soft.assertTrue(titleTxt.contains("Apple"));

        }
        
    }

    @When("user writes a search {string}")
    public void userWritesASearch(String arg0) {

        search.searchField().sendKeys(arg0);
        
    }

    @Then("user should see the results of the sku search")
    public void userShouldSeeTheResultsOfTheSkuSearch() {

        String sku = search.skuName().getText();
        soft.assertTrue(sku.contains("AP_MBP_13"));

    }

    @And("user clicks the product displayed")
    public void userClicksTheProductDisplayed() {

        search.clickProduct().click();

    }
}
