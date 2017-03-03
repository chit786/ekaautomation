package StepDefinitions;

import cucumber.api.java.en.*;

import org.junit.Assert;
import com.DemoFlight.pages.*;

/**
 * Created by chitrang on 02/03/17.
 */
public class DeleteComputerValidationSDF {
    LandingPage landingPage;
    EditComputerPage editComputerPage;
    Integer origTotalComputers;
    Integer origTotalComputersFooter;
    @Given("^user is on Homepage$")
    public void user_is_on_Homepage() throws Throwable {
        landingPage = new LandingPage(BaseTest.driver);
    }

    @And("^note the total number of computers in the database$")
    public void note_the_total_number_of_computers_in_the_database() throws Throwable {
        origTotalComputers = Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].toString());
    }

    @And("^note the total number of computers in pagination footer$")
    public void note_the_total_number_of_computers_in_pagination_footer() throws Throwable {
        if(landingPage.isTableOfComputerExist()){
            origTotalComputersFooter = Integer.parseInt(landingPage.getTotalNumberOfComputersOnFooter().split(" ")[5].toString());
        }else{
            origTotalComputersFooter = 0;
        }
    }

    @When("^user clicks first computer name from the list$")
    public void user_clicks_first_computer_name_from_the_list() throws Throwable {
        editComputerPage = landingPage.clickRecord(1);
    }

    @Then("^Edit Computer page should be opened$")
    public void edit_Computer_page_should_be_opened() throws Throwable {
        Assert.assertTrue(editComputerPage.isDeleteButtonExist());
    }

    @And("^user sees delete this computer button$")
    public void user_sees_delete_this_computer_button() throws Throwable {
        Assert.assertTrue(editComputerPage.isDeleteButtonExist());
    }

    @And("^user clicks delete this computer button$")
    public void user_clicks_delete_this_computer_button() throws Throwable {
        editComputerPage.deleteThisComputer();
    }

    @And("^user navigates to HomePage$")
    public void user_navigates_to_HomePage() throws Throwable {
        Assert.assertTrue(landingPage.isTableOfComputerExist());
    }

    @And("^user sees the Delete confirmation message on the homepage$")
    public void user_sees_the_Delete_confirmation_message_on_the_homepage() throws Throwable {
        Assert.assertTrue(landingPage.checkDeleteConfirmationMessage());
    }

    @And("^the total number of computers should be decreased by (\\d+) in Header$")
    public void the_total_number_of_computers_should_be_decreased_by_in_Header(int arg1) throws Throwable {
        Assert.assertEquals(origTotalComputers-1,Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].toString()));

    }

    @And("^the total number of computers should be decreased by (\\d+) in Pagination footer$")
    public void the_total_number_of_computers_should_be_decreased_by_in_Pagination_footer(int arg1) throws Throwable {
        Assert.assertEquals(origTotalComputersFooter-1,Integer.parseInt(landingPage.getTotalNumberOfComputersOnFooter().split(" ")[5].toString()));
    }



}
