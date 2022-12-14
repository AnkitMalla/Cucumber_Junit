


Feature:
  User Story:
  As a user, I should be able to login with correct credentials to different accounts and dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background:
    Given user is on the library login page


  Scenario: Login as a Librarian
    //Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

  Scenario: Login as a student
    //Given user is on the library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard

  Scenario: Login as a admin
    //Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard