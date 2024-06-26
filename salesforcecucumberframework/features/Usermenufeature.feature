Feature: Usermenu Scenarios
@Home @test5
Scenario: Select user menu for <username> drop down
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Then mousehover into element  "usermenu"
@Home @test6
Scenario: Select "My Profile" option from user menu for <username> drop down
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Then mousehover into element  "usermenu"
Given user is on "UsermenuPage"
Then click on button "My Profile"
Then click on button "Edit"
Then switch to iframe "iframe"
Then click on button "About"
Then user enter into the text box1 "Lastname" "Abcd"
Then click on button "Save"
Then Switch To Default 
Then user waits for element "Post"
Then click on button "Post"
Then switch to iframe "frame"
Then user enter into the text box "text" "hello"
Then Switch To Default 
Then click on button "share"
Then Switch To Default 
Then user waits for element "File"
Then click on button "File"
Then click on button "upload"
Then user enter into the text box "chooseFile" "C:\Users\CKAMB\OneDrive\Desktop\.txt"
Then Switch To Default
Then user waits for element "Photo"
Then mousehover "Photo"
Then switch to iframe "frame1"
Then user enter into the text box "SelectPhoto" "C:\\Users\\CKAMB\\OneDrive\\Desktop\\image5.jpg"
Then click on button "save2"
#Then click on button "save3"
Then Switch To Default
@Home @test7
Scenario: Select "My settings" option from user menu for <username> drop down
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Then mousehover into element  "usermenu"
Given user is on "UsermenuPage"
Then click on button "Mysetting"
Then user waits for element "DisplyAndLayout"
Then click on button "DisplyAndLayout"
#Then select dropdown "customApp" "Salesforce Chatter"
#Then user waits for element "Report"
#Then mousehover into element "Report"
#Then click on button "Add"
#Then click on button "save4"
Then click on button "PersonalInfo_font"
Then click on button "LoginHistory_font"
Then click on button "Download"
Then click on button "EmailSetup_font"
Then click on button "EmailSettings_font"
Then user enter into the text box1 "Name" "Ambika"
Then user enter into the text box1 "Email" "ck.ambika@gmail.com"
Then click on button "radio"
Then click on button "Primary"
Then click on button "calender"
Then user waits for element "Activity"
Then click on button "Activity"
Then click on button "Testremainder"
@Home @test8
Scenario: Select "Developers Console" option from user menu for <username> drop down
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Then user waits for element "usermenu"
Then mousehover into element  "usermenu"
Given user is on "UsermenuPage"
Then click on button "Developer Console"
Then SwitchToParentWindow 
@Home @test9
Scenario: Select "Logout" option from user menu for <username> drop down
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Then mousehover into element  "usermenu"
Then click on button "Logout"


