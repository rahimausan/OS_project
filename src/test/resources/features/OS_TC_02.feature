Feature: Api task
  @OSapi
  Scenario: Api get data
    Given user sends a request for data
    When gets response
    Then verify payload