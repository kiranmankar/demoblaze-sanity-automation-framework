Feature: Signup Functionality

Scenario Outline: Verify Signup

Given User is on DemoBlaze homepage
When User clicks signup link
And User enters signup username "<username>"
And User enters signup password "<password>"
And User clicks signup button
Then Signup request should be submitted

Examples:
| username | password |
| test12345 | pass123 |