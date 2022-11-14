package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefs.hooks.driver;

public class P02_login {

    public WebElement loginBtn(){
        WebElement lgnBtn = driver.findElement(By.className("ico-login"));
        return lgnBtn;
    }

    public WebElement email(){
        WebElement emlFld = driver.findElement(By.id("Email"));
        return emlFld;
    }

    public WebElement password(){
        WebElement psswrdFld = driver.findElement(By.id("Password"));
        return psswrdFld;
    }

    public WebElement lgnButton(){
        WebElement btn = driver.findElement(By.className("login-button"));
        return btn;
    }

    public WebElement account(){
        WebElement myAccount = driver.findElement(By.className("ico-account"));
        return myAccount;
    }

    public WebElement errorText(){
        WebElement txt = driver.findElement(By.className("message-error"));
        return txt;
    }
}
