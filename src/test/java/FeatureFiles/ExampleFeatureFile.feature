Feature: Browser Launch

  Background:
    Given I launch the "CHROME " browser

  @Run
  Scenario Outline: Launching a browser and visiting a URL number '<SN>'
    Given I navigate to a URL "<URL>"
    Examples:
      | SN | URL                                                              |
      | 1  | https://www.aa.com/i18n/travel-info/baggage/carry-on-baggage.jsp |
      | 2  | https://www.yahoo.com/                                           |


