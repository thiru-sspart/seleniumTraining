Feature: Cucumber explanation

  @Test @Thiru
  Scenario Outline: First Test case
    Given I print data
    When I add two integers <Data1> and <Data2>
    Then vaidate sum is <Data3> and "<Message>"
  Examples:
  |Data1|Data2| Data3| Message|
  | 4   | 6   |   10 | Text1  |
  | 10  | 20  |   30 | Text2  |


  @smoke
  Scenario Outline: Validate login with multiple users
  Given User login with "<userName>" & "<Password>"
  Examples:
  |userName |Password|
  |abcd     | abcd   |
  |xyz      |xyz     |




  # Gherkin language

#    Scenario: amazon serach validation
#      Given I launch the amazonUrl
#      Then i validate th logo is diplayed
#      When I enter the "Samsung" in serach box
#      And I click on search Button

