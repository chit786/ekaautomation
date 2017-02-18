package com.DemoFlight.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by chitrang on 13/09/16.
 */
public class Support extends AbstractPage{


    public Support(WebDriver driver) {
        super(driver);
    }

   //@FindBy(linkText = "Contact")
    WebElement contactLink = driver.findElement(By.linkText("CONTACT"));

   //@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")
   WebElement bckToHme = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));

    public void isPageFound(){
        Assert.assertTrue("check if on Support Page",bckToHme.isDisplayed());

    }

    public Contact navigateToContact(){
        contactLink.click();
        return new Contact(driver);
    }
}
