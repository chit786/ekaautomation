package StepDefinitions;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import org.junit.Assert;
import com.DemoFlight.pages.*;

/**
 * Created by chitrang on 02/03/17.
 */
public class ComputerListSortingValidationSDF {
    LandingPage landingPage;
    Integer origiNalCount;
    @Given("^user navigates to the homepage$")
    public void user_navigates_to_the_homepage() throws Throwable {
        landingPage = new LandingPage(BaseTest.driver);
    }

    @When("^user sees computer list table$")
    public void user_sees_computer_list_table() throws Throwable {
        Assert.assertTrue(landingPage.isTableOfComputerExist());
    }

    @Then("^user sees the list of computers sorted alphabetically in ascending order$")
    public void user_sees_the_list_of_computers_sorted_alphabetically_in_ascending_order() throws Throwable {
        Assert.assertTrue(landingPage.isComputerListSortedAscending());
    }

    @And("^the number of computers will be noted from the header$")
    public void the_number_of_computers_will_be_noted_from_the_header() throws Throwable {
        origiNalCount = Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].trim());
    }

    @And("^User clicks filter by name button$")
    public void user_clicks_filter_by_name_button() throws Throwable {
        landingPage.filterTableBy("");
    }

    @Then("^the list should not change$")
    public void the_list_should_not_change() throws Throwable {
       Assert.assertTrue(Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].trim())==origiNalCount);
    }

    @And("^the total computer count should be same$")
    public void the_total_computer_count_should_be_same() throws Throwable {
        Assert.assertTrue(Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].trim())==origiNalCount);
    }

    @And("^user filters list by \"([^\"]*)\"$")
    public void user_filters_list_by(String filterOption) throws Throwable {
       landingPage.filterTableBy(filterOption);
    }

    @Then("^the computer list table should be gone$")
    public void the_computer_list_table_should_be_gone() throws Throwable {
        Assert.assertTrue(!landingPage.isTableOfComputerExist());
    }

    @And("^user sees label \"([^\"]*)\"$")
    public void user_sees_label(String arg1) throws Throwable {
        Assert.assertTrue(landingPage.showsNoComputer());
    }

    @Then("^user sees computer list sorted with the name \"([^\"]*)\"$")
    public void user_sees_computer_list_sorted_with_the_name(String filterOption) throws Throwable {
        Assert.assertTrue(landingPage.isComputerListSortedAscending());
    }

    @And("^the total number of computers found in the header must be noted$")
    public void the_total_number_of_computers_found_in_the_header_must_be_noted() throws Throwable {
        origiNalCount = Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].trim());
    }

    @And("^the previous button in the footer should be disabled$")
    public void the_previous_button_in_the_footer_should_be_disabled() throws Throwable {
       Assert.assertTrue(!landingPage.prevBtnEnabled());
    }

    @And("^next button in footer should be enabled$")
    public void next_button_in_footer_should_be_enabled() throws Throwable {
        Assert.assertTrue(landingPage.nextBtnEnabled());
    }

    @Then("^user click on next button$")
    public void user_click_on_next_button() throws Throwable {
        landingPage.nextBtnClick();
    }

    @And("^sees the next (\\d+) computers in the list with name containing \"([^\"]*)\"$")
    public void sees_the_next_computers_in_the_list_with_name_containing(int numOfComputers, String stringToSearch) throws Throwable {
        Assert.assertTrue(landingPage.getNumberOfComputersInTable()==numOfComputers);
        Assert.assertTrue(landingPage.doesListContainsFilterString(stringToSearch));

    }

    @Then("^the count of computers in the header should not change$")
    public void the_count_of_computers_in_the_header_should_not_change() throws Throwable {
        Assert.assertTrue(Integer.parseInt(landingPage.getTotalComputerString().split(" ")[0].trim())==origiNalCount);
    }

    @And("^the text for current page should display \"([^\"]*)\"$")
    public void the_text_for_current_page_should_display(String textTodisplay) throws Throwable {
        Assert.assertTrue(landingPage.getCurrentPageString().equals("Displaying 1 to 10 of " + String.valueOf(origiNalCount)));
    }

    @And("^previous button is enabled$")
    public void previous_button_is_enabled() throws Throwable {
        Assert.assertTrue(landingPage.prevBtnEnabled());
    }

    @And("^next button is enabled$")
    public void next_button_is_enabled() throws Throwable {
        Assert.assertTrue(landingPage.nextBtnEnabled());
    }



}
