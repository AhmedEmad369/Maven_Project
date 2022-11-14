package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static org.example.StepDefs.hooks.driver;

public class D05_hoverCategoriesStepDef {
    
    P03_homePage hover = new P03_homePage();
    
    SoftAssert soft = new SoftAssert();

    Actions hovr = new Actions(driver);

    Random rand = new Random();

    int catCount = hover.subCategories().size();
    int count = rand.nextInt(catCount);
    
    @Given("user hovers to one of the main categories")
    public void hoverAction(){

        hovr.moveToElement(hover.compCategory()).perform();
        
        
    }

    @When("user selects one of the subcategories")
    public void userSelectsOneOfTheSubcategories() {


        String catName = hover.subCategories().get(count).getText();
        System.out.println(catName);
        hover.subCategories().get(count).click();
        
    }

    @Then("user should be navigated to the subcategory screen")
    public void userShouldBeNavigatedToTheSubcategoryScreen() {

        String titleTxt = hover.pageTitle().getText();
        String subText = hover.subCategories().get(count).getText();
        System.out.println(subText);
        soft.assertTrue(titleTxt.toLowerCase().trim().contains(subText));

        soft.assertAll();
    }
}
