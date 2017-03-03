package com.DemoFlight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by chitrang on 02/03/17.
 */
public class EditComputerPage extends AbstractPageObject {
    public EditComputerPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getUniqueElement() {
        return By.cssSelector("input.btn.primary");
    }


    By computerNameLocator = By.id("name");
    By introducedDateLocator = By.id("introduced");
    By discontDateLocator = By.id("discontinued");
    By companyNameLocator = By.id("company");
    By editAComputerLocator = By.xpath("//*[@id=\"main\"]/h1");
    By lblComputerNameLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[1]/label");
    By lblIntDateLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[2]/label");
    By lblDiscDateLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[3]/label");
    By lblCompanyNameLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[4]/label");
    By cancelBtnLocator = By.xpath("//*[@id=\"main\"]/form/div/a");
    By saveComputerBtnLocator = By.xpath("//*[@id=\"main\"]/form[1]/div/input");
    By deleteComputerBtnLocator = By.xpath("//*[@id=\"main\"]/form[2]/input");
    By errorComputerName = By.xpath("//*[@id=\"main\"]/form/fieldset/div[1]");
    By errorIntDate = By.xpath("//*[@id=\"main\"]/form/fieldset/div[2]");
    By errorDistrDate = By.xpath("//*[@id=\"main\"]/form/fieldset/div[3]");
    By errorCompanyError = By.xpath("//*[@id=\"main\"]/form/fieldset/div[4]");

    public Boolean isDeleteButtonExist(){
        return driver.findElement(deleteComputerBtnLocator).isDisplayed();

    }

    public LandingPage deleteThisComputer(){
         driver.findElement(deleteComputerBtnLocator).click();
         return new LandingPage(driver);
    }

    public Boolean editComputerLabelExist(String editLabelMsg){
        return driver.findElement(editAComputerLocator).getText().trim().equals(editLabelMsg);
    }

    public Boolean saveThisComputerBtnExist(){
        return driver.findElement(saveComputerBtnLocator).isDisplayed();
    }

    public Boolean cancelBtnExist(){
        return driver.findElement(cancelBtnLocator).isDisplayed();
    }

    public LandingPage clickCancelButton(){
        driver.findElement(cancelBtnLocator).click();
        return new LandingPage(driver);

    }

    public void appendComuterName(String appendedText){
        driver.findElement(computerNameLocator).sendKeys(appendedText);
    }

    public void changeIntroducedDate(String newDate){
        driver.findElement(introducedDateLocator).clear();
        driver.findElement(introducedDateLocator).sendKeys(newDate);
    }

    public void changeDiscDate(String disDate){
        driver.findElement(discontDateLocator).clear();
        driver.findElement(discontDateLocator).sendKeys(disDate);

    }

    public void selectCompanyName(String _compName){
        Select dropdown = new Select(driver.findElement(companyNameLocator));
        dropdown.selectByVisibleText(_compName);

    }

    public LandingPage saveButton(){
        driver.findElement(saveComputerBtnLocator).click();
        return new LandingPage(driver);

    }







}
