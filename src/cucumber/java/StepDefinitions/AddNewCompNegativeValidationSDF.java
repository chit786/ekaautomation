package StepDefinitions;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import org.junit.Assert;
import com.DemoFlight.pages.*;
/**
 * Created by chitrang on 02/03/17.
 */
public class AddNewCompNegativeValidationSDF {
    LandingPage landingPage;
    AddComputerPage addComputerPage;
    @Given("^User navigates to Hompage$")
    public void user_navigates_to_Hompage() throws Throwable {
        landingPage = new LandingPage(BaseTest.driver);
    }

    @When("^User clicks Add a new computer button$")
    public void user_clicks_Add_a_new_computer_button() throws Throwable {

        addComputerPage = landingPage.navigateToAddComputerPage();
    }

    @Then("^user sees add new computer screen$")
    public void user_sees_add_new_computer_screen() throws Throwable {

        Assert.assertTrue(addComputerPage.checkLabelExist("Add a computer"));
    }

    @And("^User sets \"([^\"]*)\" computer name, \"([^\"]*)\" introduced date, \"([^\"]*)\" Discontinued date, \"([^\"]*)\" Company name$")
    public void user_sets_computer_name_introduced_date_Discontinued_date_Company_name(String _computerName, String _intDate, String _DisDate, String _companyName) throws Throwable {
        addComputerPage.fillComputerDetails(_computerName,_intDate,_DisDate,_companyName);
    }

    @And("^clicks on \"([^\"]*)\" button$")
    public void clicks_on_button(String arg1) throws Throwable {

        addComputerPage.clickCreateInvalidScenario();

    }

    @Then("^Computer name field should be highlighted in red$")
    public void computer_name_field_should_be_highlighted_in_red() throws Throwable {
        Assert.assertTrue(addComputerPage.isComputerInvalid());
    }

    @Then("^Introduced date field highlighted in red$")
    public void introduced_date_field_highlighted_in_red() throws Throwable {
        Assert.assertTrue(addComputerPage.isIntDateInvalid());
    }

    @Then("^Discontinued date field highlighted in red$")
    public void discontinued_date_field_highlighted_in_red() throws Throwable {
        Assert.assertTrue(addComputerPage.isDisDateInvalid());
    }
}
