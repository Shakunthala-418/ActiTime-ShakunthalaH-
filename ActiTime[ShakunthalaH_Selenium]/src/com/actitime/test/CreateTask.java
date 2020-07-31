package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.CreateTaskPage;
import com.actitime.pom.EnterTimeTrackPage;

public class CreateTask extends BaseClass
{
	@Test
	public void testCreateTask() throws IOException
	{
		 String CustomerName = f.getExcelValue("CreateTask", 1, 0);
		 String ProjectName = f.getExcelValue("CreateTask", 1, 1);
		 String TaskName = f.getExcelValue("CreateTask", 1, 2);
		 EnterTimeTrackPage h=new EnterTimeTrackPage(driver);
		 h.getNewTaskBtn().click();
		 CreateTaskPage t=new CreateTaskPage(driver);
		 t.getCreateCustomerDropDownBtn().click();
		 t.getNewCustomerOption().click();
		 t.getEnterCustomerNameTbx().sendKeys(CustomerName);
		 t.getEnterProjectNameTbx().sendKeys(ProjectName);
		 t.getEnterTaskNameTbx().sendKeys(TaskName);
		 t.getCreateTaskBtn().click();
		 
	}
}
