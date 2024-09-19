Feature: Login page automation of rahulshettyAcademy
Scenario Outline: Check login is successful with valid credentials
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on login button
Then User is navigate to home page
And Close the browser


Examples:
| username | password |
| n.s.reddy9493@gmail.com | Reddy@123 |
