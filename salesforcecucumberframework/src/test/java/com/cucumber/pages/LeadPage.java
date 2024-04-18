package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LeadPage extends BasePage{
	static WebDriver driver;
	public LeadPage() {
		super(driver=BaseTest.getDriver("chrome"));
		addobject("LeadTab", By.xpath("//a[@title='Leads Tab']"));
		addobject("View", By.xpath("//select[@id='fcf']"));
		addobject("Go", By.xpath("//input[@title='Go!']"));
		addobject("Newbutton", By.xpath("//input[@title='New']"));
		addobject("Lastname", By.xpath("//input[@id='name_lastlea2']"));
		addobject("Companyname", By.xpath("//input[@id='lea3']"));
		addobject("save3", By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
}
}