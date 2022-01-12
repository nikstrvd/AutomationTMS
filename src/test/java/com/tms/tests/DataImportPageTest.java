package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CoursePage;
import com.tms.pages.CourseRunPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.DataImportPage;
import com.tms.pages.LoginPage;

public class DataImportPageTest extends BaseTest {
	
	private DataImportPageTest() { }
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage();
	CoursePage cp = new CoursePage();
	CourseRunPage cr = new CourseRunPage();
	BasePage bp = new BasePage();
	DataImportPage di = new DataImportPage();
	
	@Test()
	public void AccessDataImportCourseRuns(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  bp.scrool1();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  di.clickoncoursedd();
		  di.clickonselectcoursefromdataimport();
		  di.clickonimportdata();
		 
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Data Import - Course Runs - TMS");
		  
	}
	
	
	@Test()
	public void AccessDataImportStudentEnrollment(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  bp.scrool1();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  di.clickonimportdata();
		 
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Data Import - Student Enrolment - TMS");
		  
	}
	
	@Test()
	public void AccessDataImportSyncCourseRunTPG(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  bp.scrool1();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  di.CourserunId(data.get("Course Run Id"));
		  bp.scroll2();
		  di.clickongerfromtpg();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Sync Course Run - TMS");
		  
	}
	
	@Test()
	public void AccessDataImportSyncStudentEnrolmentTPG(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  bp.scrool1();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  di.EnrolmentId(data.get("enrolment_id"));
		  bp.scroll2();
		  di.clickongerfromtpg();		 
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Sync Student Enrolment - TPG");
		  
	}

}
