package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDefs.hooks.driver;

public class P01_register {

//constructor
/*
    public P01_register(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerBtn;

*/
    ///second way without findby and constructor

    public WebElement register(){
        WebElement regr = driver.findElement(By.className("ico-register"));
        return regr;

    }

    public WebElement gender(){
        WebElement gndr = driver.findElement(By.id("gender-male"));
        return gndr;
    }

    public WebElement frstname(){
        WebElement first = driver.findElement(By.id("FirstName"));
        return first;
    }

    public WebElement lstname(){
        WebElement last = driver.findElement(By.id("LastName"));
        return last;
    }

    public WebElement dayList(){
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }

    public WebElement monthList(){
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }

    public WebElement yearList(){
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }

    public WebElement email(){
        WebElement emails = driver.findElement(By.id("Email"));
        return emails;
    }

    public WebElement password(){
        WebElement psswrd = driver.findElement(By.id("Password"));
        return psswrd;
    }

    public WebElement confirmPassword(){
        WebElement cnfrmoswrd = driver.findElement(By.id("ConfirmPassword"));
        return cnfrmoswrd;
    }

    public WebElement rgstrBtn(){
        WebElement button = driver.findElement(By.id("register-button"));
        return button;
    }

    public WebElement message(){
        WebElement confirmMsg = driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return confirmMsg;
    }

    public WebElement textColor(){
        WebElement txt = driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return txt;
    }

}
