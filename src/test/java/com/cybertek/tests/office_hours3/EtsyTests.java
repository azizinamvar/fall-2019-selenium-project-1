package com.cybertek.tests.office_hours3;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EtsyTests extends TestBase {
    /*
    search for wooden spoon on etsy
    verify title contains the searchterm
    verify that default shipt to location is Ship to
    verify Ship to countries include Australia
     */

    @Test
    public void verifyCountryList(){
        driver.get("https://etsy.com");
        WebElement input = driver.findElement(By.id("global-enhancements-search-query"));
        input.sendKeys("wooden spoon"+ Keys.ENTER);

        // VERIFY TITLE
        String expectedTitle = "Wooden spoon | Etsy";

        // wait a little until title changes to right one
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // using explicit wait to wait until title contains Wooden spoon | Etsy
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        Assert.assertEquals(driver.getTitle(), expectedTitle);

        // VERIFY SHIP TO LOCATION

        // wait until element is FOUND in html
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select shipToList = new Select(driver.findElement(By.name("ship_to")));



    }
}