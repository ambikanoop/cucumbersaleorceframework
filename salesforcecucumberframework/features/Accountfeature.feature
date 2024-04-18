Feature: AccountPage Scenarios
@Account @test10
Scenario: Create Account
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "AccountPage"
Then user waits for element "AccountTab"
Then click on button "AccountTab"
Then click on button "NewButton"
Then user enter into the text box "AccountName" "ABCD"
Then select dropdown "TypeDropdown" "Technology Partner"
Then select dropdown "customerprioritydropdwon" "High"
Then click on button "save"
@Account @test11
Scenario: CreateNewView
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "AccountPage"
Then user waits for element "AccountTab"
Then click on button "AccountTab"
Then click on button "NewView"
Then user enter into the text box "ViewName" "A1"
Then click on button "ViewUname"
Then click on button "save1"
@Account @test12
Scenario: EditView
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "AccountPage"
Then user waits for element "AccountTab"
Then click on button "AccountTab"
Then select dropdown "ViewDropdown" "A1"
Then click on button "Edit"
Then user enter into the text box "ViewName" "Ambi2"
Then select dropdown "FieldDropdown" "Account Name"
Then select dropdown "OperatorDropdown" "contains"
Then click on button "Value"
Then select dropdown "AvailableTabs" "Last Activity"
Then click on button "Add"
Then click on button "save2"
@Account @test13
Scenario: MergeAccounts
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "AccountPage"
Then user waits for element "AccountTab"
Then click on button "AccountTab"
Then click on button "MergeAccount"
Then user enter into the text box "Search" "AA"
Then click on button "FindAccount"
Then click on button "Input"
Then click on button "Input1"
Then click on button "Next"
Then click on button "Merge"
Then accept Alert
@Account @test14
Scenario: Create account report
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "AccountPage"
Then user waits for element "AccountTab"
Then click on button "AccountTab"
Then click on button "Last30daysActivity"
Then click on button "Fromdropdown"
Then click on button "todaybutton"
Then click on button "ToDropDown"
Then enterintotextbox "ToDropDown" "4/15/2024"
Then click on button "save3"
Then user enter into the text box "ReportName" "Ab"
Then click on button "UreportName"
Then click on button "saveandRun"
