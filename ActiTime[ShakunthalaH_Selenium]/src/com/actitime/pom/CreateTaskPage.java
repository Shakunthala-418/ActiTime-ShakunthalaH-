package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTaskPage 
{
	@FindBy(xpath="//td/div/div/div[3]")
	private WebElement CreateCustomerDropDownBtn;
	
	@FindBy(xpath="//div[.='- New Customer -'] and @class='itemRow selected'")
	private WebElement NewCustomerOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement EnterCustomerNameTbx;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement EnterProjectNameTbx;
	
	@FindBy(xpath="//input[@placeholder='Enter task name']")
	private WebElement EnterTaskNameTbx;
	
	@FindBy(xpath="//div[contains(text(),'Create Tasks')]")
	private WebElement CreateTaskBtn;
	
	public CreateTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateCustomerDropDownBtn() {
		return CreateCustomerDropDownBtn;
	}

	public WebElement getNewCustomerOption() {
		return NewCustomerOption;
	}

	public WebElement getEnterCustomerNameTbx() {
		return EnterCustomerNameTbx;
	}

	public WebElement getEnterProjectNameTbx() {
		return EnterProjectNameTbx;
	}

	public WebElement getEnterTaskNameTbx() {
		return EnterTaskNameTbx;
	}

	public WebElement getCreateTaskBtn() {
		return CreateTaskBtn;
	}
	
}
