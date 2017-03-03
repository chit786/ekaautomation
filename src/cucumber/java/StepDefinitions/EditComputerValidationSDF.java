package StepDefinitions;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import org.junit.Assert;
import com.DemoFlight.pages.*;

/**
 * Created by chitrang on 02/03/17.
 */
public class EditComputerValidationSDF {
    LandingPage landingPage;
    EditComputerPage editComputerPage;
    String _firstCompName ;
    String _firstIntroDate;
    String _firstDisconDate;
    String _firstCompany;
    String appendText;
    String newIntroDate;
    String newDisconDate;
    String newCompanyName;
    @Given("^user is on homepage of computer database page$")
    public void user_is_on_Homepage() throws Throwable {
        landingPage = new LandingPage(BaseTest.driver);
    }
    @Then("^user note first computer details in the list$")
    public void user_note_first_computer_details_in_the_list() throws Throwable {
        _firstCompName = landingPage.getComputerNameForAddedRecord();
        _firstIntroDate = landingPage.getIntroDateForAddedRecord();
        _firstDisconDate = landingPage.getDisconDateForAddedRecord();
        _firstCompany = landingPage.getCompanyNameForAddedRecord();
    }

    @And("^clicks on the name of first computer in the list$")
    public void clicks_on_the_name_of_first_computer_in_the_list() throws Throwable {
        editComputerPage = landingPage.clickRecord(1);
    }

    @And("^Computer Edit page should be opened$")
    public void computer_Edit_page_should_be_opened() throws Throwable {
        Assert.assertTrue(editComputerPage.isDeleteButtonExist());
    }

    @And("^header of the page should display \"([^\"]*)\"$")
    public void header_of_the_page_should_display(String editLabel) throws Throwable {
        Assert.assertTrue(editComputerPage.editComputerLabelExist(editLabel));

    }

    @And("^Edit page should display Save this computer and Cancel buttons$")
    public void edit_page_should_display_Save_this_computer_and_Cancel_buttons() throws Throwable {
        Assert.assertTrue(editComputerPage.saveThisComputerBtnExist());
        Assert.assertTrue(editComputerPage.cancelBtnExist());
    }

    @And("^Delete this computer button should exist$")
    public void delete_this_computer_button_should_exist() throws Throwable {
        Assert.assertTrue(editComputerPage.isDeleteButtonExist());
    }

    @And("^user clicks Cancel button$")
    public void user_clicks_Cancel_button() throws Throwable {
        landingPage = editComputerPage.clickCancelButton();
    }

    @Then("^user sees homepage$")
    public void user_sees_homepage() throws Throwable {
        Assert.assertTrue(landingPage.isTableOfComputerExist());
    }

    @And("^append \"([^\"]*)\" at the end of the name of the computer$")
    public void append_at_the_end_of_the_name_of_the_computer(String appendText) throws Throwable {
        this.appendText = appendText;
        editComputerPage.appendComuterName(appendText);
    }

    @And("^change introduced date to \"([^\"]*)\"$")
    public void change_introduced_date_to(String newIntroducedDate) throws Throwable {
        this.newIntroDate = newIntroducedDate;
        editComputerPage.changeIntroducedDate(newIntroducedDate);
    }

    @And("^change discontinued date to \"([^\"]*)\"$")
    public void change_discontinued_date_to(String newDiscontinuedDate) throws Throwable {
        this.newDisconDate = newDiscontinuedDate;
        editComputerPage.changeDiscDate(newDiscontinuedDate);
    }

    @And("^change company to \"([^\"]*)\"$")
    public void change_company_to(String newCompanyName) throws Throwable {
        this.newCompanyName = newCompanyName;
        editComputerPage.selectCompanyName(newCompanyName);
    }

    @And("^click Save this computer button$")
    public void click_Save_this_computer_button() throws Throwable {

        landingPage = editComputerPage.saveButton();
    }

    @Then("^user navigates to homepage$")
    public void user_navigates_homepage() throws Throwable {
        Assert.assertTrue(landingPage.isTableOfComputerExist());
    }

    @And("^user sees edit confirmation message$")
    public void user_sees_edit_confirmation_message() throws Throwable {
        Assert.assertEquals(landingPage.getConfirmationMessage(),"Done! Computer " + _firstCompName + appendText + " has been updated");
    }

    @And("^user filters the list by new name$")
    public void user_filters_the_list_by_new_name() throws Throwable {
        landingPage.filterTableBy(_firstCompName + appendText);
    }

    @Then("^user sees updated record for the computer$")
    public void user_sees_updated_record_for_the_computer() throws Throwable {
       Assert.assertEquals(landingPage.getComputerNameForAddedRecord(),_firstCompName + appendText);
       Assert.assertEquals(landingPage.getIntroDateForAddedRecord(),"01 Jan 0001");
        Assert.assertEquals(landingPage.getDisconDateForAddedRecord(),"01 Jan 0001");
        Assert.assertEquals(landingPage.getCompanyNameForAddedRecord(),newCompanyName);
    }
}
