Feature: Login Scenarios
@Login
Scenario: Login with valid username and valid password
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"

@Login @test1
Scenario: Login with valid username and clear password field
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" ""
Then click on button "Login"
Then user verifies the message "Error" "Please enter your password."
@Login @test3
Scenario: click onto remembermecheckbox
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on checkbox "Remember me"
Then click on button "Login"
Then mousehover into element  "usermenu"
Then click on button "Logout"
@Login @test4
Scenario: clickon Forgotpasswordlink
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user click on link "ForgotYourPassword"
Then user verifies the message "Error1" "Forgot Your Password"

@Login @test4b
Scenario: Login with Invalid username and Invalid password
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "123"
Then user enter into the text box "password" "22131"
Then click on button "Login"