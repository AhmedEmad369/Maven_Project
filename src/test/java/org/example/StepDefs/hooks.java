package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hooks {

    public static WebDriver driver = null;

    @Before
    public void openBrowser(){

        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //set implicit wait

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void closeBrowser() throws InterruptedException {
        //Thread.sleep(3000);
        driver.quit();

    }


}
