package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.StepDefs.hooks.driver;

public class D08_WishlistStepDef {

    P03_homePage wish = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    @When("user clicks on the heart shape on one of the products")
    public void addToWishlist(){

        wish.htcHeart().click();
        
    }

    @Then("the item will be added to the wishlist")
    public void theItemWillBeAddedToTheWishlist() {

        soft.assertTrue(wish.notificationBar().isDisplayed());
        String barColor = wish.notificationBar().getCssValue("background-color");
        String colorHex = Color.fromString(barColor).asHex();
        soft.assertEquals(colorHex, "#4bb07a");
        
    }

    @Then("the number of items in the wishlist will increase")
    public void theNumberOfItemsInTheWishlistWillIncrease() {

        wait.until(ExpectedConditions.invisibilityOf(wish.notificationBar()));
        String numberOfItems = wish.wishlistItems().getText();
        soft.assertNotEquals(numberOfItems, "0");

    }
}
