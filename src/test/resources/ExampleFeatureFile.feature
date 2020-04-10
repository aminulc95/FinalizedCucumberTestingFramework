Feature: Browser Launch

  Background:
    Given I launch the "CHROME " browser

  @run
  Scenario Outline: Launching a browser and visiting a URL then closing the browser
    Given I navigate to a URL "<URL>"
    Examples:
      | URL                                                              |
      | https://www.aa.com/i18n/travel-info/baggage/carry-on-baggage.jsp |



