package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StudentEnrollmentPage;
import com.tms.pages.StudentPage;

public class StudentPageTest extends BaseTest {
	
	private StudentPageTest() { }
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage(); 
	StudentPage sp = new StudentPage();
	BasePage bp = new BasePage();
	StudentEnrollmentPage se = new StudentEnrollmentPage();
	
	@Test
	public void EditStudentRecord(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  sp.ClickonEditstudnetbutton();
		  sp.EnterdetailInName(data.get("Student Name"));
		  sp.EnterdetailInNRIC(data.get("Student NRIC"));
		  sp.EnterdetailInEmail(data.get("Student Email"));
		  sp.EnterdetailInPhonenumber(data.get("Student Mobile"));
		  sp.EnterdetailInDOB(data.get("Studnet Date Of Birth"));
		  sp.ClickonNationality();
		  sp.ClickonCompanySME();
		  sp.EnterdetailInCompanyName(data.get("Company Name"));
		  sp.EnterdetailInCompanyUEN(data.get("Company uen"));
		  sp.EnterdetailInCompanycontactperson(data.get("Company Contact Person"));
		  sp.EnterdetailInCompanycontactemail(data.get("Company Contact Person Email"));
		  sp.EnterdetailInCompanycontactphone(data.get("Company Contact Person Number"));
		  bp.scroll3();
		  sp.EnterdetailInAddress(data.get("Student Address"));
		  sp.ClickonMealrestrication();
		  sp.Clickonmealrestricationstype();
		  sp.EnterdetailInMeal(data.get("Please specify meal restriction"));
		  sp.Clickonsubmit();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	}
	
	@Test
	public void ClickonViewcourseRunInStudentGrid(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  sp.Clickonviewcourseruns();
		  sp.Clickonview();
		  sp.Clickoneditenrolment();
		  se.selectSponsered();
		  se.selectSponseredfromdropdown1();
		  //se.EnterdetailIncompanysme(data.get("Company SME"));
		  se.selectnationality();
		  se.selectnationalitydropdown();
		  se.EnterdetailInAge(data.get("Age"));
		  se.EnterdetailInemail(data.get("Email"));
		  se.EnterdetailInmobileno(data.get("Mobile No"));
		  se.EnterdetailIndob(data.get("Date Of Birth"));
		  se.selecteducation();
		  se.selecteducationdropdown();
		  bp.scroll3();
		  se.selectdesignation();
		  se.selectdesignationdropdown();
		  se.selectsalary();
		  se.selectsalarydropdown();
		  se.EnterdetailIncompanyname(data.get("Company Name"));
		  sp.EnterdetailInCompanyUEN(data.get("Company uen"));
		  se.EnterdetailIncompanycontactperson(data.get("Company Contact Person"));
		  se.EnterdetailIncompanycontactpersonemail(data.get("Company Contact Person Email"));
		  se.EnterdetailIncompanycontactpersonnumber(data.get("Company Contact Person Number"));
		  bp.scroll3();
		  se.EnterdetailInbillingmail(data.get("Billing Email"));
		  se.EnterdetailInbillingzip(data.get("Billing Zip"));
		  se.EnterdetailInbillingaddress(data.get("Billing Address"));
		  se.selectbillingcounty();
		  se.selectbillingcountydropdown();
		  se.EnterdetailInRemark(data.get("Remarks"));
		  se.EnterdetailInPaymentamount(data.get("Payment Amount"));
		  se.selectpaymentstatus();
		  se.selectpaymentstatusdropdown();
		  bp.scroll3();
		  se.ClickonMealrestrictiondropdown();
		  se.ClickonMealrestictiontypedropdown();
		  se.EnterdetailInMealrestrictiontype(data.get("Meal Restrictions Type"));
		  se.ClickonCheckbox3();
		  se.ClickonCheckbox4();
		  se.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");	
	}
	
	@Test
	public void AccessActivityLogs(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  sp.Clickonviewactivity();
		  bp.scroll2();
		  sp.Clickonclosebutton();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");	
		 	  
	}

}
