package com.cucumber.base;



import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
  WebDriver driver;
	HashMap<String, By> ObjectRepo=new HashMap<String, By>();
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	public void EnterIntoTextBox(String logicalname,String Value){
	WebElement element=	getElement(logicalname);
		element.sendKeys(Value);
	}
	public void addobject(String logicalname, By by) {
		ObjectRepo.put(logicalname, by);
	}
	
	
public WebElement getElement(String logicalname) {
	
	
	By by=ObjectRepo.get(logicalname);
	WebElement element=driver.findElement(by);
	return element;
}
public void clickonbutton(String logicalname) {
	WebElement element=getElement(logicalname);
	element.click();
}

public void waitforElement(String logicalName) {
	WebElement element = getElement(logicalName);
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOf(element));
	
}
public void clickoncheckbox(String logicalname) {
	WebElement element=getElement(logicalname);
	element.click();
	
}
public void mosehover(String logicalname) {
	WebElement element=getElement(logicalname);
	Actions action=new Actions(driver);
	action.moveToElement(element).build().perform();
	action.click(element).build().perform();
	
}

public void clickonlink(String logicalname) {
	WebElement element=getElement(logicalname);
	
	element.click();
	
}
public void validateText(String logicalname, String expectedText) {
	WebElement element=getElement(logicalname);
	waitforElement(logicalname);
	String ActualText=element.getText();
	Assert.assertEquals(ActualText, expectedText);
	
}

public void SwitchTooiframe(String logicalname) {
	
	WebElement element=getElement(logicalname);
	waitforElement(logicalname);
	driver.switchTo().frame(element);
	
	
}
public void EnterToTextbox(String logicalname, String Value) {
	WebElement element=	getElement(logicalname);
	element.clear();
	element.sendKeys(Value);
	
}
public void EnterTextandClick(String logicalname, String Value) {
	WebElement element=	getElement(logicalname);
	element.click();
	element.sendKeys(Value);
	
}
public void selectdropdown(String logicalname, String Value) {
	WebElement element=getElement(logicalname);
	Select dropdown=new Select(element);
	dropdown.selectByVisibleText(Value);
	
}
public void SwitchToParentWindow() {
	String parentwindow=driver.getWindowHandle();
	
	 Set<String>handles=driver.getWindowHandles();
	 for(String windowhandle:handles) {
		if(!parentwindow.equals(windowhandle)) {
			driver.switchTo().window(windowhandle);
			driver.close();
		driver.switchTo().window(parentwindow);
	
}

	
	 }		
}}