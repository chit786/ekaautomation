package StepDefinitions;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import org.junit.Assert;
import com.DemoFlight.pages.*;

/**
 * Created by chitrang on 02/03/17.
 */
public class SortByColumnValidationSDF {
    LandingPage landingPage;
    @Given("^user navigates to dashboard$")
    public void user_navigates_to_dashboard() throws Throwable {
       landingPage = new LandingPage(BaseTest.driver);
    }

    @When("^user sees database table$")
    public void user_sees_database_table() throws Throwable {
       Assert.assertTrue(landingPage.isTableOfComputerExist());
    }

    @When("^user clicks on Computer name column$")
    public void user_clicks_on_Computer_name_column() throws Throwable {
        landingPage.clickTableColumn(0);
    }

    @When("^Computer details should arrange in descending alphabetical order$")
    public void computer_details_should_arrange_in_descending_alphabetical_order() throws Throwable {
        Assert.assertTrue(landingPage.isComputerListSortedDescending(0));
    }

    @When("^user clicks on Introduced date column$")
    public void user_clicks_on_Introduced_date_column() throws Throwable {
        landingPage.clickTableColumn(1);
    }

    @When("^Computer details should arrange in descending alphabetical order by introduced date$")
    public void computer_details_should_arrange_in_descending_alphabetical_order_by_introduced_date() throws Throwable {
        Assert.assertTrue(landingPage.isComputerListSortedDescending(1));
    }

    @When("^user clicks on Discontinued date column$")
    public void user_clicks_on_Discontinued_date_column() throws Throwable {
        landingPage.clickTableColumn(2);
    }

    @When("^Computer details should arrange in descending alphabetical order by Discontinued date$")
    public void computer_details_should_arrange_in_descending_alphabetical_order_by_Discontinued_date() throws Throwable {
        Assert.assertTrue(landingPage.isComputerListSortedDescending(2));
    }

    @When("^user clicks on company name column$")
    public void user_clicks_on_company_name_column() throws Throwable {
        landingPage.clickTableColumn(3);
    }

    @When("^Computer details should arrange in descending alphabetical order by company name$")
    public void computer_details_should_arrange_in_descending_alphabetical_order_by_company_name() throws Throwable {
        Assert.assertTrue(landingPage.isComputerListSortedDescending(3));
    }
}
