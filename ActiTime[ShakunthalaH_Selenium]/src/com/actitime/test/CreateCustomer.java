package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CreateCustomer extends BaseClass
{
		@Test
		public void testCreateCustomer() throws IOException {
		 String CustomerName = f.getExcelValue("CreateCustomer", 1, 0);
		 String CustomerDes = f.getExcelValue("CreateCustomer", 1, 1);
		 EnterTimeTrackPage h=new EnterTimeTrackPage(driver);
		 //click on Task menu
		 h.getTasksTab().click();
		 //click on Add new button
		 TaskListPage tl=new TaskListPage(driver);
		 //click on add new button
		     tl.getAddNewBtn().click();
		     //click on new customer menu
		     tl.getNewCustomerMenu().click();
		     //Enter the customername
		     tl.getEnterCustomerNametbx().sendKeys(CustomerName);
		     //enter the customer description
		     tl.getCustomerDescriptiontbx().sendKeys(CustomerDes);
		     //click on select customer drop down
		     tl.getCopyProjectDropDown().click();
		     //select our company in the menu
		     tl.getOurCompanyMenu().click();
		     //click on create customer
		     tl.getCreateCustomerBtn().click();
		     
		}

}
