package StepDefinitions;
import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Before;
//import org.junit.After;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


/**
 * Created by chitrang on 01/03/17.
 */
public class BaseTest {
    protected static final String WEB_SERVER = System.getProperty("WEB_SERVER", "http://computer-database.herokuapp.com/computers");
    protected static final String BROWSER = System.getProperty("BROWSER", "firefox");
    protected static final boolean REMOTE_DRIVER = Boolean.valueOf(System.getProperty("REMOTE_DRIVER", "false"));
    protected static final String SELENIUM_HOST = System.getProperty("SELENIUM_HOST", "localhost");
    protected static final int SELENIUM_PORT = Integer.valueOf(System.getProperty("SELENIUM_PORT", "4444"));

    public static RemoteWebDriver driver;

    @Before
    public void setupWebDriver() throws MalformedURLException {
        if (REMOTE_DRIVER) {
            setupRemoteDriver();
            driver.setFileDetector(new LocalFileDetector());
        } else {
            setupLocalDriver();
        }
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }

    private void setupLocalDriver() {
        if (BROWSER.equals("firefox")) {
            driver = new FirefoxDriver();
            driver.get(WEB_SERVER);
        } else if (BROWSER.equals("chrome")) {
            String path = "resource//chromedriver";
            if (System.getProperty("os.name").contains("Windows")) {
                path = "resource//chromedriver.exe";
            }
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();
            driver.get(WEB_SERVER);
        } else if (BROWSER.equals("internetExplorer")) {
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            driver = new InternetExplorerDriver(capabilities);
            driver.get(WEB_SERVER);
        } else {
            throw new RuntimeException("Browser type unsupported");
        }
    }

    private void setupRemoteDriver() throws MalformedURLException {
        DesiredCapabilities capabilities;
        if (BROWSER.equals("firefox")) {
            capabilities = DesiredCapabilities.firefox();
        } else if (BROWSER.equals("internetExplorer")) {
            capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        } else if (BROWSER.equals("chrome")) {
            capabilities = DesiredCapabilities.chrome();
        } else {
            throw new RuntimeException("Browser type unsupported");
        }
        driver = new RemoteWebDriver(
                new URL("http://" + SELENIUM_HOST + ":" + SELENIUM_PORT + "/wd/hub"),
                capabilities);
        driver.get(WEB_SERVER);
    }

//
//    @Before
//    public void loadWebApplication() {
//        driver.get(WEB_SERVER);
//    }

//    @After
//    public void deleteAllCookies() {
//        driver.manage().deleteAllCookies();
//    }
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {


        if(scenario.isFailed())
        {
//            String outPath = "target/failImages/" + scenario.getId().replaceAll("[; !@#$%^&()+=]", "_")+".png";
            try {
//                WebDriver augmentedDriver = new Augmenter().augment(driver);
//                File scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(scrFile, new File(outPath).getAbsoluteFile());
                WebDriver augmentedDriver = new Augmenter().augment(driver);
                File scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
                byte[] data = FileUtils.readFileToByteArray(scrFile);
                scenario.embed(data, "image/png");
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void suiteTearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
