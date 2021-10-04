Feature: Verify Login Functionality

  @tag1
  Scenario Outline: Verify login with valid and invalid credentials
    Given user is on OrangeHRM Login page
    When user enters <username> and <password>
    And Clicks on Login
    Then User is navigated to Home page

    Examples: 
      | username | password   |
      | Admin    | admin123   |
      | Admin    | admin12345 |
      | Admin12  | admin123   |
      | Admin23  | admin123   |

  Scenario: Verify successful login and naviagted to home page
    Given user is on OrangeHRM Login page
    When user enters username and password
    And Clicks on Login
    Then User is navigated to Home page
    
