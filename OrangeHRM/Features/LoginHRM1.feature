Feature: Login into orange hrm site

  Background: Do for login to web site
    Given user opens the browser
    And enters the site url
    Then user is on login page
	@smoke
  Scenario: Verify unsuccessful login
    When user enters invalid username and password
    Then error message is displayed
	@smoke
  Scenario: Verify successful login
    When user enters valid username and password
    And Verify title of the page
    And Verfiy dashboard header
    And click on Apply leave
    And verify apply leave header
    And verify No Leave Types with Leave Balance text in page
    And naviagte to time->attendence->my records
		@smoke
    Scenario: Verify log out functionality
    When user is on hrm login page
    And User cliks on Welcome dropdown and clicks Logout
    Then user is naviagted to login page
    @date
    Scenario: Verify date picker functionality
    And user provides valid credentials
    And user navigated to time->Reports->project report
    Then project report page should be displayed