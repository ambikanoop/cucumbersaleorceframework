package com.cucumber.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest{
	BasePage page;
	PageFactory pageFactory=new PageFactory();

@Given("user launch the application in {string}")
public void user_launch_the_application_in(String browsername) {
	lauchapplication(browsername);
}
@Given("user is on {string}")
public void user_is_on(String pageName) {
	page = pageFactory.initialize(pageName);
}
@Then("user waits for element {string}")
public void user_waits_for_element(String logicalname) {
   page.waitforElement(logicalname);
}
@Then("user enter into the text box {string} {string}")
public void user_enter_into_the_text_box(String logicalname, String Value) {
    page.EnterIntoTextBox(logicalname, Value);
}
@Then("click on button {string}")
public void click_on_button(String logicalname) {
    page.clickonbutton(logicalname);
}
@Then("click on checkbox {string}")
public void click_on_checkbox(String logicalname) {
    page.clickoncheckbox(logicalname);
}

@Then("mousehover into element  {string}")
public void mousehover_into_element(String logicalname) {
   page.clickonbutton(logicalname);
}
@Then("user click on link {string}")
public void user_click_on_link(String logicalname) {
   page.clickonlink(logicalname);
}
@Then("user verifies the message {string} {string}")
public void user_verifies_the_message(String logicalname, String expectedText) {
    page.validateText(logicalname,expectedText);
}

@Then("user enter into the text box1 {string} {string}")
public void user_enter_into_the_text_box1(String logicalname, String value) {
    page.EnterToTextbox(logicalname,value);
}

@Then("switch to iframe {string}")
public void switch_to_iframe(String logicalname) {
   page.SwitchTooiframe(logicalname);
}
@Then("Switch To Default")
public void switch_to_default() {
	defaultswitch();
}
@Then("user enter into the text box2 {string} {string}")
public void user_enter_into_the_text_box2(String logicalname, String Value) {
    page.EnterTextandClick(logicalname,Value);
}
@Then("mousehover {string}")
public void mousehover(String logicalname) {
    page.mosehover(logicalname);
}


@Then("select dropdown {string} {string}")
public void select_dropdown(String logicalname, String Value) {
	 page.selectdropdown(logicalname, Value);
}
@Then("SwitchToParentWindow")
public void switch_to_parent_window() {
    page.SwitchToParentWindow();
}


@Then("accept Alert")
public void accept_alert() {
	Alert();
}

@Then("enterintotextbox {string} {string}")
public void enterintotextbox(String logicalname, String Value) {
    page.EnterIntoTextBox(logicalname, Value);
}



@After
public void teardown(Scenario scenario) {
	
	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot, "image/png",scenario.getName());
	driver.close();
	driver=null;
}



}

