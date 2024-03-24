package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.StepDefs.hooks.driver;

public class D07_followUsStepDef {

    P03_homePage follow = new P03_homePage();
    SoftAssert soft = new SoftAssert();
    
    @When("user opens facebook link")
    public void facebookLink(){

        follow.fbLink().click();
        
    }


    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, arg0);

        driver.close();

    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {

        follow.twtrLink().click();
        
    }



    @When("user opens rss link")
    public void userOpensRssLink() {

        follow.rssLink().click();
        
    }

    @Then("rss link is opened")
    public void userOpensRSSLink(){

        String url = driver.getCurrentUrl();
        soft.assertEquals(url, "https://demo.nopcommerce.com/news/rss/1");
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {

        follow.ytLink().click();
    }


}
