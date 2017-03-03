package com.DemoFlight.pages;

import com.sun.org.apache.xpath.internal.operations.Bool;
import jdk.nashorn.internal.ir.BlockLexicalContext;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
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
    By nextButton = By.xpath("//*[@id=\"pagination\"]/ul/li[3]/a");
    By prevButton = By.xpath("//*[@id=\"pagination\"]/ul/li[1]/a");
    By currentPage = By.xpath("//*[@id=\"pagination\"]/ul/li[2]/a");
    By newComputerConfMessage = By.xpath("//*[@id=\"main\"]/div[1]");
    By computerRow = By.tagName("tr");
    By totalCompFooter = By.xpath("//*[@id=\"pagination\"]/ul/li[2]/a");
    By noComputerFoundLabel = By.xpath("//*[@id=\"main\"]/div[2]/em");


    public AddComputerPage navigateToAddComputerPage() {
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

        return driver.findElements(computerTable).size()>0;
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

    public Boolean prevBtnEnabled(){
        return driver.findElement(prevButton).isEnabled();
    }

    public Integer getNumberOfComputersInTable(){
        List<WebElement> noOfComputers = driver.findElements(computerRow);
        return noOfComputers.size()-1;
    }

    public Boolean doesListContainsFilterString(String filterOption){
        Boolean flag = true;
        List<WebElement> elementList= driver.findElement(By.tagName("tbody")).findElements(computerRow);
        for(WebElement we:elementList){
            WebElement compName = we.findElements(By.tagName("td")).get(0);
            if(!compName.getText().toLowerCase().contains(filterOption.toLowerCase())){
                flag = false;
            }
        }
        return flag;
    }


    public Boolean nextBtnEnabled(){
        return driver.findElement(nextButton).isEnabled();
    }

    public void nextBtnClick(){
         driver.findElement(nextButton).click();
    }

    public void prevBtnClick(){
        driver.findElement(prevButton).click();
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

    public String getTotalComputerString(){
        return driver.findElement(lblTotalComputerFound).getText().trim();
    }

    public Boolean hasPagination(){

        return driver.findElement(currentPage).isDisplayed();
    }

    public String getCurrentPageString(){
        return driver.findElement(currentPage).getText().trim();
    }

    public String getAddComputerConfirmationMessage(){
        return driver.findElement(newComputerConfMessage).getText().trim();
    }

    public void filterTableBy(String filterString){
        driver.findElement(filterOption).clear();
        driver.findElement(filterOption).sendKeys(filterString);
        driver.findElement(filterButton).click();
    }

    public String getComputerNameForAddedRecord(){
        List<WebElement> computerRecords = driver.findElements(computerRow);
        return computerRecords.get(1).findElements(By.tagName("td")).get(0).getText().trim();
    }

    public String getIntroDateForAddedRecord(){
        List<WebElement> computerRecords = driver.findElements(computerRow);
        return computerRecords.get(1).findElements(By.tagName("td")).get(1).getText().trim();
    }

    public String getDisconDateForAddedRecord(){
        List<WebElement> computerRecords = driver.findElements(computerRow);
        return computerRecords.get(1).findElements(By.tagName("td")).get(2).getText().trim();
    }

    public String getCompanyNameForAddedRecord(){
        List<WebElement> computerRecords = driver.findElements(computerRow);
        return computerRecords.get(1).findElements(By.tagName("td")).get(3).getText().trim();
    }

    public String getTotalNumberOfComputersOnFooter(){
        return driver.findElement(totalCompFooter).getText().trim();
    }

    public EditComputerPage clickRecord(Integer index){
        List<WebElement> computerRecords = driver.findElement(By.tagName("tbody")).findElements(computerRow);
        computerRecords.get(index-1).findElements(By.tagName("td")).get(0).findElement(By.tagName("a")).click();
        return new EditComputerPage(driver);
    }

    public Boolean checkDeleteConfirmationMessage(){
        return driver.findElement(newComputerConfMessage).getText().trim().equals("Done! Computer has been deleted");
    }

    public String getConfirmationMessage(){
        return driver.findElement(newComputerConfMessage).getText().trim();
    }

    public Boolean isComputerListSortedAscending(){
        ArrayList<String> obtainedList = new ArrayList();
        for(int i=0;i<2;i++){
            List<WebElement> elementList= driver.findElement(By.tagName("tbody")).findElements(computerRow);
            for(WebElement we:elementList){
                WebElement compName = we.findElements(By.tagName("td")).get(0);
                obtainedList.add(compName.getText());
            }
            driver.findElement(nextButton).click();
        }
        driver.findElement(prevButton).click();
        ArrayList<String> sortedList = new ArrayList();
        for(String s:obtainedList){
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        if(sortedList.equals(obtainedList)){
            return true;
        }else{
            return false;
        }
    }
    //checking the sorting per column wise
    public Boolean isComputerListSortedDescending(Integer colIindex){
        ArrayList<String> obtainedList = new ArrayList();
        for(int i=0;i<2;i++){
            List<WebElement> elementList= driver.findElement(By.tagName("tbody")).findElements(computerRow);
            for(WebElement we:elementList){
                WebElement compName = we.findElements(By.tagName("td")).get(colIindex);
                obtainedList.add(compName.getText());
            }
            driver.findElement(nextButton).click();
        }
        driver.findElement(prevButton).click();


        ArrayList<String> sortedList = new ArrayList();
        for(String s:obtainedList){
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        if(sortedList.equals(obtainedList)){
            return true;
        }else{
            return false;
        }
    }
    public Boolean showsNoComputer(){
        return driver.findElement(noComputerFoundLabel).isDisplayed();
    }

    public void clickTableColumn(Integer index){
        driver.findElements(By.tagName("th")).get(index).click();

    }

}
