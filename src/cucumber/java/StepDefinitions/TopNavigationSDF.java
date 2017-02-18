package StepDefinitions;

import com.DemoFlight.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by chitrang on 15/09/16.
 */
public class TopNavigationSDF {

    WebDriver driver = new FirefoxDriver();


    String url = "http://newtours.demoaut.com/";
    String browser = "firefox";
    Home homepage;
    Register registerPage ;
    Support supportPage ;
    Contact contactPage ;
    AbstractPage absPage ;

    @Given("^Open Firefox and navigate to homepage$")
    public void open_Firefox_and_navigate_to_homepage() throws Throwable {
        absPage = new AbstractPage(driver);
        homepage = absPage.navigateToHome(url,browser);

    }

    @And("^user sees sign in table$")
    public void user_sees_sign_in_table() throws Throwable {
        homepage.checkSigninTable();
    }

    @When("^user clicks on Register$")
    public void user_clicks_on_Register() throws Throwable {
        registerPage=homepage.navigatetoRegister();
    }

    @Then("^user sees registration page$")
    public void user_sees_registration_page() throws Throwable {
        registerPage.isPageFound();
    }

    @When("^user clicks on Support$")
    public void user_clicks_on_Support() throws Throwable {
        supportPage=registerPage.navigateToSupport();
    }

    @Then("^user sees support page$")
    public void user_sees_support_page() throws Throwable {
        supportPage.isPageFound();
    }

    @When("^user clicks on Contact$")
    public void user_clicks_on_Contact() throws Throwable {
        contactPage=supportPage.navigateToContact();
    }

    @Then("^user sees contact page$")
    public void user_sees_contact_page() throws Throwable {
        contactPage.isPageFound();
        absPage.closeBrowser();
    }


}
