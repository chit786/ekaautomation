package com.DemoFlight.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by chitrang on 13/09/16.
 */
public class Register extends  AbstractPage{

    public Register(WebDriver driver) {
        super(driver);
    }

  // @FindBy(name = "firstName")
    WebElement fstName = driver.findElement(By.name("firstName"));

   // @FindBy(linkText = "Support")
    WebElement supportLink = driver.findElement(By.linkText("SUPPORT"));

    public void isPageFound(){
        Assert.assertTrue("check if registration page is opened",fstName.isDisplayed());
    }

    public Support navigateToSupport(){
        supportLink.click();
        return new Support(driver);
    }

}
