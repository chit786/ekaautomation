package com.DemoFlight.pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by chitrang on 18/02/17.
 */
public class AddComputerPage extends AbstractPageObject {
    public AddComputerPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver,5);
    @Override
    protected By getUniqueElement() {
        return By.cssSelector("input.btn.primary");
    }

    By computerNameLocator = By.id("name");
    By introducedDateLocator = By.id("introduced");
    By discontDateLocator = By.id("discontinued");
    By companyNameLocator = By.id("company");
    By addAComputerLocator = By.xpath("//*[@id=\"main\"]/h1");
    By lblComputerNameLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[1]/label");
    By lblIntDateLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[2]/label");
    By lblDiscDateLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[3]/label");
    By lblCompanyNameLocator = By.xpath("//*[@id=\"main\"]/form/fieldset/div[4]/label");
    By cancelBtnLocator = By.xpath("//*[@id=\"main\"]/form/div/a");
    By createComputerBtnLocator = By.xpath("//*[@id=\"main\"]/form/div/input");
    By errorComputerName = By.xpath("//*[@id=\"main\"]/form/fieldset/div[1]");
    By errorIntDate = By.xpath("//*[@id=\"main\"]/form/fieldset/div[2]");
    By errorDistrDate = By.xpath("//*[@id=\"main\"]/form/fieldset/div[3]");
    By errorCompanyError = By.xpath("//*[@id=\"main\"]/form/fieldset/div[4]");


    public void enterComputerName(String _computerName){
        driver.findElement(computerNameLocator).sendKeys(_computerName);
    }

    public void enterIntroducedDate(String _intDate){
        driver.findElement(introducedDateLocator).sendKeys(_intDate);
    }

    public void enterDiscontinuedDate(String _discDate){
        driver.findElement(discontDateLocator).sendKeys(_discDate);
    }

    public void selectCompanyName(String _compName){
        Select dropdown = new Select(driver.findElement(companyNameLocator));
        dropdown.selectByVisibleText(_compName);

    }

    public void clickCreateInvalidScenario(){
        driver.findElement(createComputerBtnLocator).click();

    }

    public LandingPage clickCreateComputer(){
        driver.findElement(createComputerBtnLocator).click();
        return new LandingPage(driver);
    }

    public void fillComputerDetails(String _computerName,String _intDate,String _discDate,String _compName){

        this.enterComputerName(_computerName);
        this.enterIntroducedDate(_intDate);
        this.enterDiscontinuedDate(_discDate);
        this.selectCompanyName(_compName);
        driver.findElement(createComputerBtnLocator).click();

    }

    public LandingPage fillValidComputerDetails(String _computerName,String _intDate,String _discDate,String _compName){

        this.fillComputerDetails(_computerName, _intDate, _discDate, _compName);
        return new LandingPage(driver);

    }


    public LandingPage navigateToLandingPage() {
        WebElement cancelBtn = driver.findElement(cancelBtnLocator);
        cancelBtn.click();
        return new LandingPage(driver);
    }

    public Boolean isComputerInvalid() throws InterruptedException {

//        wait.until(new ExpectedCondition<Boolean>(){
//            public Boolean apply(WebDriver driver) {
//                WebElement myElement = driver.findElement(errorComputerName);
//                String cssmatched = myElement.getCssValue("background-color");
//                if(cssmatched.equals("rgba(250, 229, 227, 1)"))
//                    return true;
//                else
//                    return false;
//            }
//
//
//        });

        return driver.findElement(errorComputerName).getCssValue("background-color").equalsIgnoreCase("rgba(250, 229, 227, 1)");
    }

    public Boolean isIntDateInvalid(){

        return driver.findElement(errorIntDate).getCssValue("background-color").equalsIgnoreCase("rgba(250, 229, 227, 1)");
    }

    public Boolean isDisDateInvalid(){
        return driver.findElement(errorDistrDate).getCssValue("background-color").equalsIgnoreCase("rgba(250, 229, 227, 1)");
    }

    public Boolean isCompanyValid(){
        return !driver.findElement(errorCompanyError).getCssValue("background-color").equalsIgnoreCase("rgba(250, 229, 227, 1)");
    }

    public Boolean addNewComputerLabelExist(){
        return driver.findElement(addAComputerLocator).isDisplayed();
    }

    public Boolean checkLabelExist(String labelName){
        Boolean flag = false;

        if(labelName.equals("Add a computer")){
            flag = driver.findElement(addAComputerLocator).getText().equals(labelName);
        }else if(labelName.equals("Computer name")){
            flag = driver.findElement(lblComputerNameLocator).getText().equals(labelName);
        }else if(labelName.equals("Introduced date")){
            flag = driver.findElement(lblIntDateLocator).getText().equals(labelName);
        }else if(labelName.equals("Discontinued date")){
            flag = driver.findElement(lblDiscDateLocator).getText().equals(labelName);
        }else if(labelName.equals("Company")){
            flag = driver.findElement(lblCompanyNameLocator).getText().equals(labelName);
        }

        return flag;
    }


}
