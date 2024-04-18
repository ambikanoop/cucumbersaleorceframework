package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class UsermenuPage extends BasePage {
	static WebDriver driver;
	public UsermenuPage() {
		super(driver=BaseTest.getDriver("chrome"));
		
		addobject("Expected Text", By.xpath("//a[@title='Switch to Lightning Experience']"));
		
		addobject("My Profile",By.xpath("//a[@title='My Profile']"));
		addobject("Edit",By.xpath("//img[@alt='Edit Profile']"));
		addobject("iframe",By.xpath("//iframe[@id='contactInfoContentId']"));
		addobject("About",By.xpath("//a[contains(text(),'About')]"));
		addobject("Save",By.xpath("//input[@value='Save All']"));
		addobject("Lastname",By.xpath("//input[@id='lastName']"));
		addobject("Post",By.xpath("//a[@id='publisherAttachTextPost']"));
		addobject("frame",By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addobject("text",By.xpath("/html/body"));
		addobject("share",By.xpath("//input[@id='publishersharebutton']"));
		addobject("File",By.xpath("//a[@id='publisherAttachContentPost']//span[@class='publisherattachtext ']"));
		addobject("upload",By.xpath("//a[@id='chatterUploadFileAction']"));
		addobject("chooseFile",By.xpath("//input[@id='chatterFile']"));
		addobject("Photo",By.xpath("//a[@id='uploadLink']"));
		addobject("frame1",By.xpath("//iframe[@id='uploadPhotoContentId']"));
		addobject("SelectPhoto",By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		addobject("save2",By.xpath("//div[@class='uploadButtonPanel']/input[@id='j_id0:uploadFileForm:uploadBtn']"));
		addobject("save3",By.xpath("//div[@class='uploadButtonPanel']/input[@id='j_id0:j_id7:save']"));
		addobject("Mysetting",By.xpath("//a[@title='My Settings']"));
		addobject("DisplyAndLayout",By.id("DisplayAndLayout_font"));
		addobject("CustomizeTabs_font",By.xpath("//span[@id='CustomizeTabs_font']"));
		addobject("customApp",By.id("p4"));
		addobject("Report",By.xpath("//option[@value='report']"));
		addobject("Add",By.xpath("//img[@alt='Add']"));
		addobject("save4",By.xpath("//table/tbody/tr/td[2]/input[@title='Save']"));
		addobject("Developer Console",By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		addobject("PersonalInfo_font",By.id("PersonalInfo_font"));
		addobject("LoginHistory_font",By.id("LoginHistory_font"));
		addobject("Download",By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		addobject("EmailSetup_font",By.id("EmailSetup_font"));
		addobject("EmailSettings_font",By.xpath("//span[@id='EmailSettings_font']"));
		addobject("Name",By.id("sender_name"));
		addobject("Email",By.id("sender_email"));
		addobject("radio",By.id("auto_bcc1"));
		addobject("Primary",By.xpath("//input[@class='btn primary']"));
		addobject("calender",By.xpath("//span[@id='CalendarAndReminders_font']"));
		addobject("Activity",By.xpath("//span[@id='Reminders_font']"));
		addobject("Testremainder",By.xpath("//input[@id='testbtn']"));
		
}
}