Feature: Wikipedia Search Functionality and verifications


  Scenario: Wikipedia Search Functionality and verifications
    Given User is on wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs in the wiki title
@smoke
  Scenario: Wikipedia Search Functionality and verifications
    Given User is on wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" in the wiki title

    Scenario Outline:
      Given User is on wikipedia home page
      When User types "<searchValue>" in the wiki search box
      And User clicks wiki search button
      Then User sees "<expectedTitle>" in the wiki title
      Examples:
        | searchValue     | expectedTitle   |
        | Steve Jobs      | Steve Jobs      |
        | Bon Jovi        | Bon Jovi        |
        | Elon Musk       | Elon Musk       |
        | Albert Einstein | Albert Einstein |
        | Chuck Norris    | Chuck Norris    |