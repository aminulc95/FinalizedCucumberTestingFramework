package Runners;

import Utils.Base;
import Utils.Library;
import cucumber.api.java.en.Given;
import cucumber.api.java.After;

public class ExampleBuildupTeardown extends Base {

    @Given("^I launch the \"([^\"]*)\" browser$")
    public void iLaunchTheBrowser(String BrowserType) throws Throwable {
        myLib = new Library(driver);
        BrowserType = BrowserType.trim();
        if (BrowserType.equalsIgnoreCase("chrome")) {
            driver = myLib.startChromeBrowser();
        }
        if (BrowserType.equalsIgnoreCase("chrome headless")) {
            driver = myLib.startHeadlessChromeBrowser();
        }
        if (BrowserType.equalsIgnoreCase("firefox")) {
            driver = myLib.startFirefoxBrowser();
        }
        if (BrowserType.equalsIgnoreCase("ie")) {
            driver = myLib.startIEBrowser();
        }
    }

    @After
    public void close_the_browser() {
        myLib.customWait(5);
        if (driver != null) {
            driver.quit();
        }
    }

}
