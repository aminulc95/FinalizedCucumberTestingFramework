This setup is for UI testing.
-------------------------------------------------------------------------------------------------------------------------------

‘MyRunner.java’ holds the @RunWith and @CucumberOptions tags and associated config
@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {"html:reports/cucumber-html-report",
               "json:reports/cucumber.json",
               "pretty"},
       tags = {"@runit,@run","~@ignore"},
       features = {"src/test/resources"},
       glue = {"StepDefinitions", "Runners"}
)

tags [Which tags maven should look for to run when tests are triggered via mvn side panel]
features [feature files are stored in this filepath]
glue [folder name where stepdefs/Background steps are located are located]
-------------------------------------------------------------------------------------------------------------------------------

ExampleBuildupTeardown.java
Holds Buildup and Teardown functions
In iLaunchTheBrowser BrowserType is passed to method from the feature file
In close_the_browser using the @After annotation this will run after each scenario
-------------------------------------------------------------------------------------------------------------------------------

In ExampleFeatureFile.feature 
Background must be given to pass browsertype to ‘ExampleBuildupTeardown.java’
@run but be given to those scenarios that need to run as part of maven build
Tests must be triggered from mvn panel under lifecycle/test





