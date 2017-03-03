package StepDefinitions;
import cucumber.api.java.en.*;
import org.junit.Assert;
import com.DemoFlight.pages.*;
/**
 * Created by chitrang on 01/03/17.
 */
public class HomePageUIValidationSDF {

    LandingPage landingPage;
    @Given("^\"([^\"]*)\" is launched and user navigates to homepage$")
    public void is_launched_and_user_navigates_to_homepage(String _browser) throws Throwable {
        landingPage = new LandingPage(BaseTest.driver);

    }

    @When("^title of the page is \"([^\"]*)\"$")
    public void title_of_the_page_is(String _title) throws Throwable {
        Assert.assertTrue(landingPage.titleMatchedTo(_title));

    }

    @Then("^header of the page should display the \"([^\"]*)\" link having \"([^\"]*)\" background color$")
    public void header_of_the_page_should_display_the_link_having_background_color(String _psa, String _color) throws Throwable {
        Assert.assertTrue(landingPage.doesLinkExistOnLandingPage(_psa,_color));

    }

    @And("^label for total computers found should be displayed$")
    public void label_for_total_computers_found_should_be_displayed() throws Throwable {
        Assert.assertTrue(landingPage.hasTotalComputerCountLabel());
    }

    @And("^computer database list table should be displayed$")
    public void computer_database_list_table_should_be_displayed() throws Throwable {
        Assert.assertTrue(landingPage.isTableOfComputerExist());
    }

    @And("^input field to filter the computers by name should be displayed$")
    public void input_field_to_filter_the_computers_by_name_should_be_displayed() throws Throwable {
        Assert.assertTrue(landingPage.hasInputFieldToFilterComputers());
    }

    @And("^\"([^\"]*)\" button of \"([^\"]*)\" color should be displayed$")
    public void button_of_color_should_be_displayed(String _btntext, String _color) throws Throwable {
        if(_color.equals("blue")){
            Assert.assertTrue(landingPage.hasBlueSearchButtonWithText(_btntext));
        }else if(_color.equals("green")){
            Assert.assertTrue(landingPage.hasGreenAddNewCompuButtonWithText(_btntext));
        }

    }

    @And("^\"([^\"]*)\" and \"([^\"]*)\" buttons in the footer is visible$")
    public void and_buttons_in_the_footer_is_visible(String arg1, String arg2) throws Throwable {
        Assert.assertTrue(landingPage.hasNextButton());
        Assert.assertTrue(landingPage.hasPrevButton());
    }

    @And("^pagination should be present in the footer$")
    public void pagination_should_be_present_in_the_footer() throws Throwable {
        Assert.assertTrue(landingPage.hasPagination());
    }
}
