package StepDefinitions;
import com.sun.xml.internal.rngom.parse.host.Base;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import org.junit.Assert;
import com.DemoFlight.pages.*;

/**
 * Created by chitrang on 02/03/17.
 */
public class AddNewCompPositiveValidationSDF {
    LandingPage landingPage;
    AddComputerPage addComputerPage;
    Integer origTotalComputers;
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        landingPage = new LandingPage(BaseTest.driver);
    }

    @When("^User clicks on Add new computer button$")
    public void user_clicks_on_Add_new_computer_button() throws Throwable {
        addComputerPage = landingPage.navigateToAddComputerPage();
    }

    @Then("^Add a computer page should be displayed$")
    public void add_a_computer_page_should_be_displayed() throws Throwable {
        Assert.assertTrue(addComputerPage.addNewComputerLabelExist());
    }

    @And("^user clicks on Cancel button$")
    public void user_clicks_on_Cancel_button() throws Throwable {
        landingPage = addComputerPage.navigateToLandingPage();
    }

    @Then("^Homepage should be displayed$")
    public void homepage_should_be_displayed() throws Throwable {

        Assert.assertTrue(landingPage.isAddComputerbtnDisplayed());
    }

    @And("^\"([^\"]*)\" label should be displayed$")
    public void label_should_be_displayed(String labelName) throws Throwable {
        Assert.assertTrue(addComputerPage.checkLabelExist(labelName));
    }

    @And("^note the total number of computers$")
    public void note_the_total_number_of_computers() throws Throwable {
        origTotalComputers = Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].toString());
    }

    @And("^user enters \"([^\"]*)\" as Computer name$")
    public void user_enters_as_Computer_name(String compName) throws Throwable {
        addComputerPage.enterComputerName(compName);
    }

    @And("^enters \"([^\"]*)\" as Introduced date$")
    public void enters_as_Introduced_date(String _intDate) throws Throwable {
       addComputerPage.enterIntroducedDate(_intDate);
    }

    @And("^enters \"([^\"]*)\" as Discontinued date$")
    public void enters_as_Discontinued_date(String discDate) throws Throwable {
        addComputerPage.enterDiscontinuedDate(discDate);
    }

    @And("^selects \"([^\"]*)\" as company$")
    public void selects_as_company(String compName) throws Throwable {

        addComputerPage.selectCompanyName(compName);
    }

    @And("^clicks on Create this computer button$")
    public void clicks_on_Create_this_computer_button() throws Throwable {
        landingPage = addComputerPage.clickCreateComputer();
    }

    @Then("^user should be redirected to homepage$")
    public void user_should_be_redirected_to_homepage() throws Throwable {
        Assert.assertTrue(landingPage.isTableOfComputerExist());
    }

    @And("^gets a confirmation message \"([^\"]*)\"$")
    public void gets_a_confirmation_message(String confirmMessage) throws Throwable {
        Assert.assertTrue(landingPage.getAddComputerConfirmationMessage().equals(confirmMessage));
    }

    @And("^the total number of computers should be increased by (\\d+)$")
    public void the_total_number_of_computers_should_be_increased_by(int arg1) throws Throwable {
        Assert.assertEquals(origTotalComputers+1,Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].toString()));
    }

    @And("^user filters the list by \"([^\"]*)\"$")
    public void user_filters_the_list_by(String filter) throws Throwable {
        landingPage.filterTableBy(filter);
    }

    @And("^gets a compuer record with \"([^\"]*)\" as computer name$")
    public void gets_a_compuer_record_with_as_computer_name(String expComputerName) throws Throwable {
        Assert.assertTrue(landingPage.getComputerNameForAddedRecord().equals(expComputerName));
    }

    @And("^\"([^\"]*)\" as Introduced date$")
    public void as_Introduced_date(String expIntroDate) throws Throwable {
        Assert.assertTrue(landingPage.getIntroDateForAddedRecord().equals(expIntroDate));
    }

    @And("^\"([^\"]*)\" as Discontinued date$")
    public void as_Discontinued_date(String expDisconDate) throws Throwable {
        Assert.assertTrue(landingPage.getDisconDateForAddedRecord().equals(expDisconDate));
    }

    @And("^\"([^\"]*)\" as company name$")
    public void as_company_name(String expCompanyName) throws Throwable {
        Assert.assertTrue(landingPage.getCompanyNameForAddedRecord().equals(expCompanyName));
    }
}
