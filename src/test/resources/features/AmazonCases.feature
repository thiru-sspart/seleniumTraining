Feature: Amazon Scenarios testibg

#  Background: Launch driver
#     Given I launch the driver

  @Test1 @Test
  Scenario: Search button validation
    Given I launch the url
    Then i validate th logo is diplayed
    When I enter the "Samsung" in serach box
    And I click on search Button
    Then I quit the browser