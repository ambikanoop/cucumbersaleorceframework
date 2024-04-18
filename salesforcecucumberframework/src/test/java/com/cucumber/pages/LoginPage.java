package com.cucumber.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LoginPage extends BasePage{
	static WebDriver driver;
	public LoginPage() {
		super(driver=BaseTest.getDriver("chrome"));
		addobject("username", By.id("username"));
		addobject("password", By.xpath("//input[@id='password']"));
		addobject("Login",By.id("Login"));
		addobject("Remember me",By.id("rememberUn"));
		addobject("usermenu",By.xpath("//span[contains(text(),'Ambika')]"));
		addobject("Logout",By.xpath("//a[contains(text(),'Logout')]"));
		addobject("ForgotYourPassword",By.xpath("//a[@id='forgot_password_link']"));
		addobject("Error",By.xpath("//div[@id='error']"));
		addobject("Error1",By.xpath("//h1[@id='header']"));
	}

}
