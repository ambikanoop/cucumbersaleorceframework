package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class OpportunityPage extends BasePage {
	static WebDriver driver;
	public OpportunityPage() {
		super(driver=BaseTest.getDriver("chrome"));
		addobject("Opportunitylink", By.xpath("//a[contains(text(),'Opportunities')]"));
		addobject("view", By.xpath("//select[@id='fcf']"));
		addobject("OppPipeline", By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		addobject("StuchOpportunitylink", By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		addobject("Intervals", By.xpath("//select[@id='quarter_q']"));
		addobject("Include", By.xpath("//select[@id='open']"));
		addobject("RunReport", By.xpath("//input[@title='Run Report']"));
		addobject("Newbutton", By.xpath("//td[@class='pbButton']/input[@name='new']"));
		addobject("AccountName", By.xpath("//input[@id='opp4']"));
		addobject("OppName", By.xpath("//input[@id='opp3']"));
		addobject("Closedate", By.xpath("//input[@id='opp9']"));
		addobject("stagedropdown", By.id("opp11"));
		addobject("probability", By.id("opp12"));
		addobject("primary", By.xpath("//input[@id='opp17']"));
		addobject("sourcedropdown", By.xpath("//select[@id='opp6']"));
		addobject("save", By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
}
}