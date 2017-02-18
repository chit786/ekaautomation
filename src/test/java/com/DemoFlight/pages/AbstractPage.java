package com.DemoFlight.pages;

import com.DemoFlight.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by chitrang on 15/09/16.
 */
public class AbstractPage {

    protected WebDriver driver;
    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

    public Home navigateToHome(String url,String browser){
        driver.get(url);
        return new Home(driver);

    }

    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
