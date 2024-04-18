Feature: ContactTab Scenarios
@Contact @test25
Scenario: Create new contact
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then click on button "Newbutton"
Then user enter into the text box "Lastname" "AC"
Then user enter into the text box "Companyname" "ambika"
Then click on button "save"
@Contact @test26
Scenario: Create new view
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then click on button "NewView"
Then user enter into the text box "viewname" "cc"
Then enterintotextbox "Uviewname" "cc"
Then click on button "save1"
@Contact @test27
Scenario: Check recently created contact in the Contact Page
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then select dropdown "Recentview" "Recently Created"
@Contact @test28
Scenario: Check Mycontacts view in the Contact Page
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then select dropdown "view" "My Contacts"
@Contact @test29
Scenario: View a contact in the contact Page
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then click on button "Contactname"
@Contact @test30
Scenario: CheckErrormessage
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then click on button "Newview"
Then user enter into the text box "uname" "EFGH"
Then click on button "save2"
@Contact @test31
Scenario: Check the Cancel button works fine in Create New View
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then click on button "Newview"
Then user enter into the text box "name" "ABCD"
Then user enter into the text box "uname" "EFGH"
Then click on button "cancel"
@Contact @test32
Scenario: Check the Save and New button works in New Contact page
Given user launch the application in "chrome"
Given user is on "LoginPage"
Then user waits for element "username"
Then user enter into the text box "username" "ambika@com.sand"
Then user enter into the text box "password" "Anoopkp@15"
Then click on button "Login"
Given user is on "ContactPage"
Then click on button "ContactTab"
Then click on button "Newbutton"
Then user enter into the text box "Lastname" "Indian"
Then user enter into the text box "Companyname" "Global Media"
Then click on button "save"