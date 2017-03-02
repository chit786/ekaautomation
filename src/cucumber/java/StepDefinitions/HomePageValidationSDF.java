package StepDefinitions;

import com.DemoFlight.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.Scenario;

/**
 * Created by chitrang on 18/02/17.
 */
//public class HomePageValidationSDF extends BaseTest {
public class HomePageValidationSDF {
    //BaseTest base = new BaseTest();

    LandingPage landingPage;

    @Given("^Open \"([^\"]*)\" and navigate to homepage$")
    public void open_and_navigate_to_homepage(String _browser) throws Throwable {
       // base.setupWebDriver();
        landingPage = new LandingPage(BaseTest.driver);

    }

    @And("^user sees a table of computers$")
    public void user_sees_a_table_of_computers() throws Throwable {

        Assert.assertTrue(landingPage.isTableOfComputerExist());

    }

    @And("^a filter computer by name option$")
    public void a_filter_computer_by_name_option() throws Throwable {
        Assert.assertTrue(landingPage.isFilterOptionExist());
        //throw new PendingException();
    }

    @And("^add a new computer button$")
    public void add_a_new_computer_button() throws Throwable {
        Assert.assertTrue(landingPage.isAddComputerbtnDisplayed());
        //throw new PendingException();
    }

    @And("^next and previous list options$")
    public void next_and_previous_list_options() throws Throwable {
        Assert.assertTrue(landingPage.hasNextButton());
        Assert.assertTrue(landingPage.hasPrevButton());
       // base.suiteTearDown();
        //throw new PendingException();
    }

    @Given("^User is on Homepage$")
    public void user_is_on_Homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // base.setupWebDriver();
        landingPage = new LandingPage(BaseTest.driver);
        //throw new PendingException();
    }

    @When("^page is visible to user$")
    public void page_is_visible_to_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(landingPage.isTableOfComputerExist());
        //throw new PendingException();
    }

    @Then("^title of the page should be \"([^\"]*)\"$")
    public void title_of_the_page_should_be(String _pageTitle) throws Throwable {
        Assert.assertEquals(_pageTitle,landingPage.getTitle());
        //throw new PendingException();
    }

    @And("^\"([^\"]*)\" link should be present on top$")
    public void link_should_be_present_on_top(String _psaLink) throws Throwable {
        Assert.assertTrue(landingPage.doesLinkExistOnLandingPage(_psaLink,"black"));

        //throw new PendingException();
    }

    @And("^color of the header should be \"([^\"]*)\"$")
    public void color_of_the_header_should_be(String _headerColor) throws Throwable {
        landingPage.checkHeaderColor(_headerColor);
        //throw new PendingException();
       // base.suiteTearDown();

    }

}
