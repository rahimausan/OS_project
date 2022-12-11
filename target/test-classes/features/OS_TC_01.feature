@Ordnance_Survey
Feature: OS_TC_01
  Background:
    Given Navigates to the home page
  Scenario: Ordnance_Survey_Specific_Objects_Functionality
    Then scroll down to click accept button
    When hover over the mouse on the header menu
    And verify API Dashboard is visible
    And verify Download is visible
    And verify Docs is visible
    And verify Support is visible
    And verify Pricing is visible
    When user click on Docs
    And verify the list of the objects are on side menu
    When click on ‘OS Downloads API’ link
    Then verify ‘Overview’ displayed
    And verify ‘Getting started guide’ visible
    And verify ‘Technical specification’ visible
#    And close the browser

