package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class AccountPage extends BasePage {
	static WebDriver driver;
	public AccountPage() {
		super(driver=BaseTest.getDriver("chrome"));
		addobject("AccountTab", By.id("Account_Tab"));
		addobject("NewButton", By.xpath("//input[@title='New']"));
		addobject("AccountName", By.xpath("//input[@id='acc2']"));
		addobject("TypeDropdown",By.xpath("//select[@id='acc6']"));
		addobject("customerprioritydropdwon",By.xpath("//select[@id='00Naj000001201m']"));
		addobject("save", By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
		addobject("NewView",By.xpath("//a[contains(text(),'Create New View')]"));
		addobject("ViewName",By.xpath("//input[@id='fname']"));
		addobject("ViewUname",By.xpath("//input[@id='devname']"));
		addobject("save1",By.xpath("//input[@data-uidsfdc='4']"));
		addobject("ViewDropdown", By.xpath("//select[@id='fcf']"));
		addobject("Edit", By.xpath("//*[@id='filter_element']/div/span/span[2]/a[1]"));
		addobject("FieldDropdown", By.xpath("//select[@id='fcol1']"));
		addobject("Value", By.xpath("//input[@title='Value 1']"));
		addobject("OperatorDropdown", By.xpath("//select[@id='fop1']"));
		addobject("AvailableTabs", By.xpath("//select[@id='colselector_select_0']"));
		addobject("Add",By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']"));
		addobject("save2", By.xpath("//input[@data-uidsfdc='5']"));
		addobject("MergeAccount", By.xpath("//a[contains(text(),'Merge Accounts')]"));
		addobject("Search", By.xpath("//input[@id='srch']"));
		addobject("FindAccount", By.xpath("//input[@value='Find Accounts']"));
		addobject("Input", By.xpath("//td[text()='AAA']//preceding-sibling::th//input"));
		addobject("Input1", By.xpath("//td[text()='AAA1']//preceding-sibling::th//input"));
		addobject("Merge", By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
		addobject("Next", By.xpath("//div[@class='pbTopButtons']//input[@title='Next']"));
		addobject("Last30daysActivity", By.xpath("//a[contains(text(),'Accounts with last activity')]"));
		addobject("Fromdropdown", By.xpath("//img[@id='ext-gen152']"));
		addobject("todaybutton", By.xpath("//table//tbody//tr//*[@id='ext-gen276']"));
		addobject("ToDropDown", By.xpath("//input[@id='ext-comp-1045']"));
		addobject("save3", By.xpath("//*[@id='ext-gen49']"));
		addobject("ReportName", By.xpath("//*[@id='saveReportDlg_reportNameField']"));
		addobject("UreportName", By.xpath("//*[@id='saveReportDlg_DeveloperName']"));
		addobject("saveandRun", By.xpath("//table[@id='dlgSaveAndRun']/tbody/tr[2]/td[2]"));
}

}