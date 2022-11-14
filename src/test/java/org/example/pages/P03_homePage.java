package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.StepDefs.hooks.driver;

public class P03_homePage {

    public WebElement currenciesList(){

        WebElement crncyList = driver.findElement(By.id("customerCurrency"));
        return crncyList;

    }

    public List<WebElement> pricesList(){

        List<WebElement> prcList = driver.findElements(By.className("price"));
        return prcList;

    }

    public WebElement searchField(){

        WebElement srch = driver.findElement(By.id("small-searchterms"));
        return srch;

    }

    public WebElement searchButton(){

        WebElement srchBtn = driver.findElement(By.className("search-box-button"));
        return srchBtn;
    }

    public List<WebElement> productItems(){
        List<WebElement> items = driver.findElements(By.className("product-item"));
        return items;
    }

    public List<WebElement> productTitle(){

        List<WebElement> titles = driver.findElements(By.className("product-title"));
        return titles;

    }

    public WebElement clickProduct(){

        WebElement product = driver.findElement(By.linkText("Apple MacBook Pro 13-inch"));
        return product;

    }

    public WebElement skuName(){
        WebElement name = driver.findElement(By.id("sku-4"));
        return name;
    }

    public WebElement compCategory(){
        WebElement dropdown = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        return dropdown;
    }

    public List<WebElement> subCategories(){
      String selector = "ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]+div[class=\"sublist-toggle\"]+ul[class=\"sublist first-level\"] a[href]";
      List<WebElement> subs = driver.findElements(By.cssSelector(selector));
      return subs;

    }

    public WebElement pageTitle(){
        WebElement title = driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
        return title;
    }

    public WebElement nokia(){

        WebElement nokiaSlider = driver.findElement(By.cssSelector("a[rel=\"0\"]"));
        return nokiaSlider;

    }

    public WebElement iphone(){

        WebElement appleSlider = driver.findElement(By.cssSelector("a[rel=\"1\"]"));
        return appleSlider;

    }

    public WebElement fbLink(){

        WebElement fb = driver.findElement(By.className("facebook"));
        return fb;

    }

    public WebElement twtrLink(){

        WebElement twtr = driver.findElement(By.className("twitter"));
        return twtr;

    }

    public WebElement rssLink(){

        WebElement rss = driver.findElement(By.className("rss"));
        return rss;

    }

    public WebElement ytLink(){

        WebElement yt = driver.findElement(By.className("youtube"));
        return yt;

    }

    public WebElement htcHeart(){

        WebElement link = driver.findElement(By.cssSelector("div[data-productid=\"18\"] button[title=\"Add to wishlist\"]"));
        return link;

    }

    public WebElement notificationBar(){

        WebElement bar = driver.findElement(By.className("success"));
        return bar;

    }

    public WebElement wishlistItems(){

        WebElement items = driver.findElement(By.className("wishlist-qty"));
        return items;

    }



}
