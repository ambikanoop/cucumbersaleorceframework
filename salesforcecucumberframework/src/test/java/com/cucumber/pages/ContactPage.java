package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class ContactPage extends BasePage {
	static WebDriver driver;
	public ContactPage() {
		super(driver=BaseTest.getDriver("chrome"));
		addobject("ContactTab", By.xpath("//a[contains(text(),'Contacts')]"));
		addobject("Newbutton", By.xpath("//td[@class='pbButton']/input[@value=' New ']"));
		addobject("Lastname", By.xpath("//input[@id='name_lastcon2']"));
		addobject("Companyname", By.xpath("//input[@id='con4']"));
		addobject("save", By.xpath("//td[@class='pbButtonb']/input[@value=' Save ']"));
		addobject("NewView", By.xpath("//a[contains(text(),'Create New View')]"));
		addobject("viewname", By.xpath("//td[@class='dataCol']//input[@id='fname']"));
		addobject("Uviewname", By.xpath("//td[@class='dataCol']//input[@id='devname']"));
		addobject("save1", By.xpath("//td[@class='pbButtonb']//input[@data-uidsfdc='3']"));
		addobject("Recentview", By.xpath("//td[@class='pbHelp']//select[@id='hotlist_mode']"));
		addobject("view", By.xpath("//select[@id='fcf']"));
		addobject("Contactname", By.xpath("//a[contains(text(),'Aksha')]"));
		addobject("Newview", By.xpath("//a[contains(text(),'Create New View')]"));
		addobject("uname", By.xpath("//input[@id='devname']"));
		addobject("save2", By.xpath("//td[@class='pbButtonb']//input[@data-uidsfdc= '3']"));
		addobject("name", By.xpath("//input[@id='fname']"));
		addobject("cancel", By.xpath("//*[@id='editPage']/div[1]/table/tbody/tr/td[2]/input[2]"));
}
}