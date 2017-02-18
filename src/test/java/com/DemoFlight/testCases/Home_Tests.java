package com.DemoFlight.testCases;

import com.DemoFlight.pages.MasterPage;
import com.DemoFlight.utilities.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by chitrang on 13/09/16.
 */
public class Home_Tests {

    WebDriver driver;

    @Before
    public void lauchBrowser(){
        driver = BrowserFactory.startBrowser("firefox","http://newtours.demoaut.com/mercurywelcome.php");
    }

    @Test
    public void navigateToPages(){
        //this statement initializes the elements on page masterpage and returns the page
        MasterPage masterPage = PageFactory.initElements(driver, MasterPage.class);
        masterPage.navigateToPage("signon");
        masterPage.navigateToPage("register");
        masterPage.navigateToPage("contact");
        masterPage.navigateToPage("support");

    }


    @After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }


}
