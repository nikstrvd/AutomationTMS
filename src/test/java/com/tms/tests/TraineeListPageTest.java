package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CoursePage;
import com.tms.pages.CourseRunPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;

public class TraineeListPageTest extends BaseTest {
	
	private TraineeListPageTest() {
	}
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage();
	CoursePage cp = new CoursePage();
	CourseRunPage cr = new CourseRunPage();
	BasePage bp = new BasePage();
	
	
	@Test()
	public void AccessTraineeListTab(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cp.clickonListdotsButton();
		  cp.ClickonViewCourseRunfromListDotsButton();
		  cp.clickonListdotsButton();
		  cp.clickonViewFromListdotsButton();
		  cp.clickonTraineelistTab();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run View - TMS");
		  
	}
	
	@Test()
	public void AccessSoftBookingsTab(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cp.clickonListdotsButton();
		  cp.ClickonViewCourseRunfromListDotsButton();
		  cp.clickonListdotsButton();
		  cp.clickonViewFromListdotsButton();
		  cp.clickonSoftbookingstab();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run View - TMS");
		  
	}
	
	@Test()
	public void AccessWaitingListTab(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cp.clickonListdotsButton();
		  cp.ClickonViewCourseRunfromListDotsButton();
		  cp.clickonListdotsButton();
		  cp.clickonViewFromListdotsButton();
		  cp.clickonWaitinglisttab();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run View - TMS");
		  
	}
	
	@Test()
	public void AccessPaymentsListTab(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cp.clickonListdotsButton();
		  cp.ClickonViewCourseRunfromListDotsButton();
		  cp.clickonListdotsButton();
		  cp.clickonViewFromListdotsButton();
		  cp.clickonPaymentlisttab();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run View - TMS");
		  
	}
	
	@Test()
	public void AccessRefershersTab(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cp.clickonListdotsButton();
		  cp.ClickonViewCourseRunfromListDotsButton();
		  cp.clickonListdotsButton();
		  cp.clickonViewFromListdotsButton();
		  cp.clickonRefersherstab();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run View - TMS");
		  
	}

}
