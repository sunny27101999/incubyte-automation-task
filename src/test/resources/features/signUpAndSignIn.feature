Feature: User Registration

  Scenario Outline: Successful user registration and Sign In
    Given I open the Magento website
    When I navigate to the Create Account page
    Then I am able to see Create New Customer Account Header
    And I enter firstName "<firstName>" and lastName "<lastName>"
    And I enter email "<email>" and password "<password>"
    And I submit the registration form
    Then I should see a message confirming my registration
    Then I navigate to the My Account page
    Then I should see Welcome with firstName "<firstName>" and lastName "<lastName>"
    When I sign out for application
    Then I should see home Page header
    When I navigate to the Sign In page
    Then I am able to see Customer Login Header
    And I enter email "<email>" and password "<password>" in Customer Login Page
    And I submit the Sign In From
    Then I should see home Page header
    Then I should see Welcome with firstName "<firstName>" and lastName "<lastName>"


    Examples:
      | firstName | lastName | email                  | password   |
      | Sunny     | Kumar    | test2564895test@gamil.com | User@1235@ |