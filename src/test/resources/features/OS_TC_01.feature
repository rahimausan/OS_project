@Ordnance_Survey
Feature: OS_TC_01
  Background:
    Given Launch the Browser and Navigate to home page
  Scenario: Ordnance_Survey_Specific_Objects_Functionality
    Then Scroll down to click accept button
    And User verifies that data hub page is loaded
    And User verifies the dashboard page
    And verify download page is loaded
    Then User verifies support page is loaded successfully
    And verify pricing page is loaded
    When click on 'Docs’ page
    And Verify the lists of objects on side menu by expanding the links
