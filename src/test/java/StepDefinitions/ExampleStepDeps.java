package StepDefinitions;

import Utils.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class ExampleStepDeps extends Base {

    @Given("^I navigate to a URL \"([^\"]*)\"$")
    public void iNavigateToAURL(String URL){
        driver.get(URL);
    }

}
