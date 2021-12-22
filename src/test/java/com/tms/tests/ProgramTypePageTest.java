package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.ProgramTypePage;

public class ProgramTypePageTest extends BaseTest {
	
	private ProgramTypePageTest() { }
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage(); 
	BasePage bp = new BasePage();
	ProgramTypePage pt = new ProgramTypePage();
	
	@Test
	public void AddProgramType(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		pt.ClickonAddprogram();
		pt.EnterdetailInName(data.get("name"));
		pt.ClickonStatus();
		pt.ClickonSubmit();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");	
		 	  
	}

	@Test
	public void EditProgramType(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		pt.ClickonEdit();
		pt.EnterdetailInName(data.get("name"));
		pt.ClickonStatus();
		pt.ClickonUpdate();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");	
		 	  
	}
}
