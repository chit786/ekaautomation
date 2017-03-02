package com.DemoFlight.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by chitrang on 18/02/17.
 */
public class AddComputerPage extends AbstractPageObject {
    public AddComputerPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getUniqueElement() {
        return By.cssSelector("input.btn.primary");
    }
}
