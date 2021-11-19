package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CourseSoftBookingsPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StudentEnrollmentPage;

public class CourseSoftBookingsPageTest extends BaseTest {

	private CourseSoftBookingsPageTest() { }
	
	LoginPage lp = new LoginPage(); 
	  DashboardPage dp = new DashboardPage(); 
	  CourseSoftBookingsPage cp = new CourseSoftBookingsPage();
	  StudentEnrollmentPage se = new StudentEnrollmentPage();
	  BasePage bp = new BasePage();
	
	
	  @Test 
	  public void AddnewCourseSoftBookingsRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu")); 
		  cp.Addnewrecord();
		  cp.SelectCourseRun();
		  cp.selectcourserunfromdropdown();
		  //cp.EnterdetailInDeadlinedate(data.get("Deadline Date"));
		  cp.EnterdetailInName(data.get("Name2"));
		  cp.EnterdetailInContactnumber(data.get("Contact Number"));
		  bp.scroll();
		  cp.EnterdetailInEmail(data.get("Email1"));
		  cp.EnterdetailInNric(data.get("Nric"));
		  cp.Status1();
		  cp.Selectstatus();
		  cp.EnterdetailInNotes(data.get("Notes"));
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Soft Booking Course - TMS");
  
	  }	
	  
	  @Test
	  public void ClickonEnrolStudentfromListdots(Map<String, String> data)
	  {
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu")); 
		  cp.clickonListdotsButton();
		  cp.clickonEnrolstudentfromListdotsButton();
		  se.selectSponsered();
		  se.selectSponseredfromdropdown();
		  //se.EnterdetailIncompanysme(data.get("Company SME"));
		  se.selectnationality();
		  se.selectnationalitydropdown();
		  se.EnterdetailInAge(data.get("Age"));
		  bp.scroll();
		  se.EnterdetailInName(data.get("Name3"));
		  se.EnterdetailInNric(data.get("Nric"));
		  se.EnterdetailInemail(data.get("Email"));
		  se.EnterdetailInmobileno(data.get("Mobile No"));
		  se.EnterdetailIndob(data.get("Date Of Birth"));
		  se.selecteducation();
		  se.selecteducationdropdown();
		  se.selectdesignation();
		  se.selectdesignationdropdown();
		  se.selectsalary();
		  se.selectsalarydropdown();
		  bp.scroll();
		  //se.EnterdetailIncompanyname(data.get("Company Name"));
		  //se.EnterdetailIncompanyuen(data.get("Company uen"));		  
		  //se.EnterdetailIncompanycontactperson(data.get("Company Contact Person"));
		  //se.EnterdetailIncompanycontactpersonemail(data.get("Company Contact Person Email"));
		  //se.EnterdetailIncompanycontactpersonnumber(data.get("Company Contact Person Number"));
		  se.EnterdetailInbillingmail(data.get("Billing Email"));
		  se.EnterdetailInbillingzip(data.get("Billing Zip"));
		  se.EnterdetailInbillingaddress(data.get("Billing Address"));
		  se.selectbillingcounty();
		  se.selectbillingcountydropdown();
		  se.EnterdetailInRemark(data.get("Remarks"));
		  bp.scroll();
		  se.EnterdetailInPaymentamount(data.get("Payment Amount"));
		  se.selecttpgatewaypaymentstatus();
		  se.selectpaymentstatus();
		  se.selectpaymentstatusdropdown();
		  se.ClickonMealrestrictiondropdown();
		  se.ClickonMealrestictiontypedropdown();
		  se.EnterdetailInMealrestrictiontype(data.get("Meal Restrictions Type"));
		  se.ClickonCheckbox();
		  se.ClickonCheckbox1();
		  bp.scroll();
		  se.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
		  
	  }
	  
	  @Test
	  public void EditCourseSoftBookingsRecordTest(Map<String, String> data) 
	  { 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.Editrecord();
		  cp.SelectCourseRun();
		  cp.selectcourserunfromdropdown();
		  cp.EnterdetailInDeadlinedate(data.get("Deadline Date"));
		  cp.EnterdetailInName1(data.get("Name2"));
		  cp.EnterdetailInContactnumber1(data.get("Contact Number"));
		  bp.scroll();
		  cp.EnterdetailInEmail1(data.get("Email1"));
		  cp.EnterdetailInNric1(data.get("Nric"));
		  cp.Status();
		  cp.Selectstatus();
		  cp.EnterdetailInNotes(data.get("Notes"));
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Add Student Enrolment - TMS");
  
	  }	
	  
	  @Test
	  public void ViewNotesofCourseSoftBookingsTest(Map<String, String> data) 
	  { 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.clickonViewnotesfromListdotsButton();
		  cp.clickonCloseButtonfromNotespopup();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Soft Booking Course - TMS");
  
	  }	
}
