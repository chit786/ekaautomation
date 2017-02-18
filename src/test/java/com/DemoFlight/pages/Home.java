package com.DemoFlight.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by chitrang on 13/09/16.
 */
public class Home extends AbstractPage {


    public Home(WebDriver driver) {
        super(driver);
    }

   // @FindBy(name = "userName")
    WebElement signInTable = driver.findElement(By.name("userName"));

  //  @FindBy(linkText = "Register")
    WebElement registerLink = driver.findElement(By.linkText("REGISTER"));


    public void checkSigninTable(){
        Assert.assertTrue("check sign in table exist",signInTable.isDisplayed());
    }

    public Register navigatetoRegister(){
        registerLink.click();
        return new Register(driver);
    }

}
