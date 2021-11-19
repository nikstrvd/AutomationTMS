package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CourseSoftBookingsPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StudentEnrollmentPage;
import com.tms.pages.WaitingListPage;

public class WaitingListPageTest extends BaseTest {

	private WaitingListPageTest() { }
	
	LoginPage lp = new LoginPage(); 
	  DashboardPage dp = new DashboardPage(); 
	  CourseSoftBookingsPage cp = new CourseSoftBookingsPage();
	  BasePage bp = new BasePage();
	  WaitingListPage wp = new WaitingListPage();
	  StudentEnrollmentPage se = new StudentEnrollmentPage();
	
	
	  @Test 
	  public void AddnewWaitingListRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu")); 
		  wp.Addnewrecord();
		  wp.SelectCourseRun();
		  wp.selectcourserunfromdropdown();
		  //cp.EnterdetailInDeadlinedate(data.get("Deadline Date"));
		  wp.EnterdetailInName(data.get("Name2"));
		  wp.EnterdetailInContactnumber(data.get("Contact Number"));
		  bp.scroll();
		  wp.EnterdetailInEmail(data.get("Email1"));
		  wp.EnterdetailInNric(data.get("Nric"));
		  wp.Status1();
		  wp.Selectstatus();
		  wp.EnterdetailInNotes(data.get("Notes"));
		  wp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Waiting List Course - TMS");
  
	  }	
	  
	  @Test
	  public void ClickonEnrolStudentfromListdotsinWaitingListtab(Map<String, String> data)
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
	  public void EditWaitingListRecordTest(Map<String, String> data) 
	  { 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  wp.clickonListdotsButton();
		  wp.Editrecord();
		  wp.SelectCourseRun();
		  wp.selectcourserunfromdropdown();
		  //cp.EnterdetailInDeadlinedate(data.get("Deadline Date"));
		  wp.EnterdetailInName(data.get("Name2"));
		  wp.EnterdetailInContactnumber(data.get("Contact Number"));
		  bp.scroll();
		  wp.EnterdetailInEmail(data.get("Email1"));
		  wp.EnterdetailInNric(data.get("Nric"));
		  wp.Status1();
		  wp.Selectstatus();
		  wp.EnterdetailInNotes(data.get("Notes"));
		  wp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Waiting List Course - TMS");
  
	  }	
}
