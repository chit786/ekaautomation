package com.DemoFlight.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by chitrang on 13/09/16.
 */
public class MasterPage {

    WebDriver driver = null;
    public MasterPage(WebDriver driver){

        this.driver = driver;

    }

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
    WebElement topNavigation_signOn;

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
    WebElement topNavigation_register;

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a")
    WebElement topNavigation_support;

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")
    WebElement topNavigation_contact;

    //method to navigate across pages from top navigation

    public void navigateToPage(String pageTo){

        if(pageTo.equalsIgnoreCase("signon")){
            topNavigation_signOn.click();
        }else if(pageTo.equalsIgnoreCase("register")){
            topNavigation_register.click();
        }else if(pageTo.equalsIgnoreCase("support")){
            topNavigation_support.click();
        }else if(pageTo.equalsIgnoreCase("contact")){
            topNavigation_contact.click();
        }else{
            Assert.fail();
            driver.close();
            driver.quit();
        }

    }



}
