
  Feature: Etsy title verification functionality
    User story: As a user, when I am on Etsy page, I should be able to search for whatever I want and see relevant time.

    Scenario: Search functionality result title verification
      Given user is on Etsy page
      Then User sees title  as expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Scenario: Search functionality result title verification
    Given user is on Etsy page
    And User types Wooden Spoon in the search box
    Then User sees Wooden Spoon is in the title

    Scenario: Search functionality result title verification
      Given user is on Etsy page
      And User types "Wooden Spoon" in the search box
      Then User sees "Wooden spoon - Etsy" is in the title

