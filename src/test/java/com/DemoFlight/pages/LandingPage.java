package com.DemoFlight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
/**
 * Created by chitrang on 18/02/17.
 */
public class LandingPage extends AbstractPageObject {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.id("searchsubmit");
    }

    By menuBarLocator = By.xpath("/html/body/header/h1/a");
    By lblTotalComputerFound = By.xpath("//*[@id=\"main\"]/h1");
    By addComputerLocator = By.id("add");
    By computerTable = By.cssSelector("table.computers.zebra-striped");
    By filterOption = By.cssSelector("input#searchbox");
    By filterButton = By.id("searchsubmit");
    By nextButton = By.className("next");
    By prevButton = By.className("prev");
    By currentPage = By.className("current");

    public AddComputerPage clickAddComputerTab() {
        WebElement addComputerBtn = driver.findElement(addComputerLocator);
        addComputerBtn.click();
        return new AddComputerPage(driver);
    }

    public Boolean titleMatchedTo(String titleName){
        return driver.getTitle().equals(titleName);
    }

    public Boolean isAddComputerbtnDisplayed() {
        List<WebElement> questionsTab = driver.findElements(addComputerLocator);
        return questionsTab.size() > 0;
    }

    public Boolean isTableOfComputerExist(){

        return driver.findElement(computerTable).isDisplayed();
    }

    public Boolean isFilterOptionExist(){
        List<WebElement> filterOpt = driver.findElements(filterOption);
        return filterOpt.size() > 0;
    }

    public Boolean hasNextButton(){
        return driver.findElement(nextButton).isDisplayed();

    }

    public Boolean hasInputFieldToFilterComputers(){
        return driver.findElement(filterOption).isDisplayed();
    }

    public Boolean hasBlueSearchButtonWithText(String btnText){

        WebElement filterBtn = driver.findElement(filterButton);
        if(filterBtn.getAttribute("value").trim().equals(btnText) && filterBtn.getCssValue("background-color").equalsIgnoreCase("rgba(0, 100, 205, 1)")){
            return true;
        }else{
            return false;
        }
    }

    public Boolean hasGreenAddNewCompuButtonWithText(String btnText){

        WebElement addCompBtn = driver.findElement(addComputerLocator);
        if(addCompBtn.getText().trim().equals(btnText) && addCompBtn.getCssValue("background-color").equalsIgnoreCase("rgba(87, 169, 87, 1)")){
            return true;
        }else{
            return false;
        }
    }

    public Boolean hasPrevButton(){
        return driver.findElement(prevButton).isDisplayed();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public Boolean doesLinkExistOnLandingPage(String expLinkText, String _color){
        WebElement psaLink = driver.findElement(menuBarLocator);
        System.out.println(psaLink.getText().trim());
        if(psaLink.getText().trim().equals(expLinkText) && psaLink.getCssValue("color").equalsIgnoreCase("rgba(191, 191, 191, 1)")){
            return true;
        }else{
            return false;
        }

    }

    public Boolean checkHeaderColor(String _color){

        return driver.findElement(menuBarLocator).getCssValue("background-color").equalsIgnoreCase("#bfbfbf");
    }

    public Boolean hasTotalComputerCountLabel(){
        return driver.findElement(lblTotalComputerFound).isDisplayed();

    }

    public Boolean hasPagination(){

        return driver.findElement(currentPage).isDisplayed();
    }


}
