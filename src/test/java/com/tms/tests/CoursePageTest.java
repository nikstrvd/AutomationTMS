package com.tms.tests;

import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tms.pages.BasePage;
import com.tms.pages.CoursePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;

public class CoursePageTest extends BaseTest {

	private CoursePageTest() {
	}
	
	BasePage bp = new BasePage();
	CoursePage cp = new CoursePage();
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage(); 

	
	  @Test public void AddnewCourseRecordTest(Map<String, String> data) {
	  
	  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).
	  clickLogin(); 
	  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
	  cp.Addnewrecord(); 
	  cp.EnterdetailInName(data.get("name1"));
	  cp.Selectcoursemodule(); cp.Coursetype(); 
	  cp.Selectcoursetype();
	  cp.EnterdetailInReferenceNumber(data.get("reference"));
	  cp.Skillcode(data.get("skill")); 
	  cp.SelectModeofTraining();
	  cp.SelectTrainers(); 
	  cp.SelectItems(); cp.SelectItems1(); 
	  cp.SelectItems2();
	  bp.scroll2(); 
	  cp.updaterecord(); 
	  String ActualTitle = lp.getTitle();
	  Assert.assertEquals(ActualTitle, "Courses List - TMS"); 
	  }
	 
	
	@Test
	public void AddCourse(Map<String, String> data) {
		
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.EnterdetailInName(data.get("name1"));
		  cp.Selectcoursemodule();
		  cp.Coursetype();
		  cp.Selectcoursetype();
		  cp.EnterdetailInReferenceNumber(data.get("reference"));
		  cp.Skillcode(data.get("skill"));
		  cp.SelectModeofTraining();
		  cp.SelectTrainers();
		  cp.SelectItems();
		  cp.SelectItems1();
		  cp.SelectItems2();
		  bp.scroll2();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	}
	
	@Test
	public void ClickonAddCourseRunButtonFromListDrop(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.ClickonAddCourseRunfromListDotsButton();
		  cp.SelectMainTrainer();
		  cp.SelectTrainers();
		  cp.Assistenttrainer();		  
		  cp.SelectAssitent();
		  cp.SelectModeofTraining1();
		  cp.Courseprimatyvenue();
		  cp.Selectvenue();
		  cp.Coursevacancycode();
		  cp.Selectcoursevacancycode();
		  cp.AddSession();
		  cp.Minintakesize(data.get("Minintakesize"));
		  cp.Maxintakesize(data.get("Maxintakesize"));
		  cp.Threshold(data.get("Threshold"));
		  cp.updaterecord();
	}

	@Test()
	public void EditCourseRecordTest(Map<String, String> data) {
		 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.Editrecord();
		  cp.EnterdetailInName(data.get("name1"));
		  cp.EnterdetailInReferenceNumber(data.get("reference"));
		  cp.Skillcode(data.get("skill"));
		  cp.SelectModeofTraining();
		  cp.SelectTrainers();
		  cp.SelectItems();
		  cp.SelectItems1();
		  cp.SelectItems2();
		  bp.scroll2();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	}
	
	@Test
	public void ViewCourseRunTest(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.ClickonViewCourseRunfromListDotsButton();
		  cp.Addnewrecord();
		  cp.SelectMainTrainer();
		  cp.SelectTrainers();
		  cp.Assistenttrainer();		  
		  cp.SelectAssitent();
		  cp.SelectModeofTraining1();
		  cp.Courseprimatyvenue();
		  cp.Selectvenue();
		  cp.Coursevacancycode();
		  cp.Selectcoursevacancycode();
		  cp.AddSession();
		  cp.Minintakesize(data.get("Minintakesize"));
		  cp.Maxintakesize(data.get("Maxintakesize"));
		  cp.Threshold(data.get("Threshold"));
		  cp.updaterecord();
		
	}
	


	
}
