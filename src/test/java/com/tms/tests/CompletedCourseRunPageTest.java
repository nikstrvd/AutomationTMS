package com.tms.tests;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CoursePage;
import com.tms.pages.CourseRunPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;

public class CompletedCourseRunPageTest extends BaseTest {
	

	private CompletedCourseRunPageTest() {
	}
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage();
	CoursePage cp = new CoursePage();
	CourseRunPage cr = new CourseRunPage();
	BasePage bp = new BasePage();

	@Test
	public void ClickonAddNewCourseRunbuttonfromAllCourseRuns1(Map<String, String> data) {
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		cr.Addnewrecord();
		cr.clickonSelectCourseButton();
		cr.clickonSelectCourse();
		cr.clickonAddButton();
		  cr.SelectTrainers();
		  cr.SelectAssistantTrainers();	
		  cr.SelectModeofTraining();
		  cr.Courseprimatyvenue();
		  cr.Selectvenue();
		  cr.Coursevacancycode();
		  cr.Selectcoursevacancycode();
		  cr.AddSession();
		  cr.Minintakesize(data.get("Minintakesize"));
		  cr.Maxintakesize(data.get("Maxintakesize"));
		  cr.Threshold(data.get("Threshold"));
		  cr.updaterecord();		
		
	}
	
	@Test
	public void ViewCourseRunTest2(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.clickonViewFromListdotsButton();
		
	}
	
	@Test()
	public void ClickonStudentListfromAllCourseRunRecordTest2(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.clickonStudentListFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run Student List - TMS");
		  
	}
	
	@Test()
	public void ClickonAssessmentAndAttendancefromAllCourseRunRecordTest2(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.clickonAttendenceListFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Attendance Assessment List - Course Run - TMS");
		  
	}
	
	@Test()
	public void EditCourseRunRecordTest2(Map<String, String> data) {
		
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.clickonEditrecordFromListdotsButton();
		  cp.SelectMainTrainer();
		  cp.SelectTrainers();
		  cp.Assistenttrainer();		  
		  cp.SelectAssitent();
		  cr.SelectMod();
		  cp.Courseprimatyvenue();
		  cp.Selectvenue();
		  cp.Coursevacancycode();
		  cp.Selectcoursevacancycode();
		  cp.AddSession();
		  cp.Minintakesize(data.get("Minintakesize"));
		  cp.Maxintakesize(data.get("Maxintakesize"));
		  cp.Threshold(data.get("Threshold"));
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "All Course Runs - TMS");
	}
	
	@Test
	public void ClickonAddCourseRunbuttonfromCoursRunstab(Map<String, String> data) {
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		cr.clickonSelectCourseButton();
		cr.clickonSelectCourse();
		cr.clickonAddButton();
		  cr.SelectTrainers();
		  cr.SelectAssistantTrainers();	
		  cr.SelectModeofTraining();
		  cr.Courseprimatyvenue();
		  cr.Selectvenue();
		  cr.Coursevacancycode();
		  cr.Selectcoursevacancycode();
		  cr.AddSession();
		  cr.Minintakesize(data.get("Minintakesize"));
		  cr.Maxintakesize(data.get("Maxintakesize"));
		  cr.Threshold(data.get("Threshold"));
		  cr.updaterecord();		
		
	}
}
