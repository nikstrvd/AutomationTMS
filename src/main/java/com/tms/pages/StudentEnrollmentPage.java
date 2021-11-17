package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class StudentEnrollmentPage extends BasePage {
	
	private final By SelectSession = By.xpath("//span[@title='Select Course']");
	private final By selectsessionfromdropdown = By.xpath("(//li[@class='select2-results__option'])[5]");
	private final By Editrecord = By.xpath("(//a[.='Edit'])[1]");
	
	
	private final By Sponsered = By.id("sponsored_by_company");
	private final By Sponsereddropdown = By.xpath("//option[text()=\"No (I'm signing up as an individual)\"]");
	private final By companysme = By.id("company_sme");
	private final By nationality = By.id("nationality");
	private final By nationalitydropdown = By.xpath("//option[text()='Non-Singapore Citizen/PR']");
	private final By Age = By.id("age");
	private final By name = By.id("name");
	private final By Nric = By.id("nric");		
	private final By email = By.id("email");
	private final By mobileno = By.id("mobile_no");
	private final By dob = By.id("dob");	
	private final By education = By.id("education_qualification");
	private final By educationdropdown = By.xpath("//option[text()=\"Bachelor's Degree and Above\"]");	
	private final By designation = By.id("designation");
	private final By designationdropdown = By.xpath("//option[text()='Service and Sales Workers']");	
	private final By salary = By.id("salary");
	private final By salarydropdown = By.xpath("//option[text()='$2,000 - $2,499']");
	private final By companyname = By.id("company_name");
	private final By companyuen = By.id("company_uen");
	private final By companycontactperson = By.id("company_contact_person");
	private final By companycontactpersonemail = By.id("company_contact_person_email");
	private final By companycontactpersonnumber = By.id("company_contact_person_number");
	private final By billingmail = By.id("billing_email");
	private final By billingzip = By.id("billing_zip");
	private final By billingaddress = By.id("billing_address");
	private final By billingcounty = By.id("select2-billing_country-container");
	private final By billingcountrydropdown = By.xpath("//li[text()='Singapore']");
	private final By paymenttpgateway = By.id("payment_tpg_status");
	private final By paymenttpgatewaystatus = By.xpath("//option[text()='Partial']");	
	private final By Remark = By.id("remarks");
	private final By Paymentamount = By.id("amount");	
	private final By paymentstatus = By.id("payment_status");
	private final By paymentstatusdropdown = By.xpath("//option[text()='Partial']");
	private final By Mealrestriction = By.xpath("//option[text()='Yes']");
	private final By Mealrestrictiontype = By.xpath("//option[text()='Other']");
	private final By Mealrestricationother = By.id("meal_restrictions_other");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By Addrecord = By.xpath("//a[.='  Add New']");
	private final By Listdots = By.xpath("(//span[@class='list-dots'])[1]");
	private final By View = By.xpath("(//li)[25]");
	private final By Viewpayments = By.xpath("(//a[.='View Payments'])[1]");
	private final By checkbox = By.xpath("(//label[contains(text(),'I/the trainee have/has basic computer navigational')])[1]");
	private final By checkbox1 = By.xpath("(//label[contains(text(),'I/the trainee have/has thoroughly read the course ')])[1]");
	
	public void ClickonCheckbox()
	{
		click(checkbox, WaitStrategy.CLICKABLE, "checkbox button");

	}
	
	public void ClickonCheckbox1()
	{
		click(checkbox1, WaitStrategy.CLICKABLE, "checkbox button");

	}
	
	
	public void View()
	{
		click(View, WaitStrategy.CLICKABLE, "View button");

	}
	
	public void Viewpayments()
	{
		click(Viewpayments, WaitStrategy.CLICKABLE, "Viewpayments button");

	}
	
	public void Addrecord()
	{
		click(Addrecord, WaitStrategy.CLICKABLE, "Addrecord button");

	}
	
	public void clickonListdotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "listdotsclick button");
	}
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public void selectSession()
	{
		click(SelectSession, WaitStrategy.CLICKABLE, "SelectSession button");
	}
	
	public void selectsessionfromdropdown()
	{
		click(selectsessionfromdropdown, WaitStrategy.CLICKABLE, "selectsessionfromdropdown button");
	}
	
	public void selectSponsered()
	{
		click(Sponsered, WaitStrategy.CLICKABLE, "Sponsered button");
	}
	
	public void selectSponseredfromdropdown()
	{
		click(Sponsereddropdown, WaitStrategy.CLICKABLE, "Sponsereddropdown button");
	}
	
	public void selectnationality()
	{
		click(nationality, WaitStrategy.CLICKABLE, "nationality button");
	}
	
	public void selectnationalitydropdown()
	{
		click(nationalitydropdown, WaitStrategy.CLICKABLE, "nationalitydropdown button");
	}
	
	public void selecteducation()
	{
		click(education, WaitStrategy.CLICKABLE, "education button");
	}
	
	
	public void selecteducationdropdown()
	{
		click(educationdropdown, WaitStrategy.CLICKABLE, "educationdropdown button");
	}
	
	public void selectdesignation()
	{
		click(designation, WaitStrategy.CLICKABLE, "designation button");
	}
	
	
	public void selectdesignationdropdown()
	{
		click(designationdropdown, WaitStrategy.CLICKABLE, "designationdropdown button");
	}

	public void selectsalary()
	{
		click(salary, WaitStrategy.CLICKABLE, "salary button");
	}
	
	
	public void selectsalarydropdown()
	{
		click(salarydropdown, WaitStrategy.CLICKABLE, "salarydropdown button");
	}
	
	public void selectpaymentstatus()
	{
		click(paymentstatus, WaitStrategy.CLICKABLE, "paymentstatus button");
	}
	
	
	public void selectpaymentstatusdropdown()
	{
		click(paymentstatusdropdown, WaitStrategy.CLICKABLE, "paymentstatusdropdown button");
	}
	
	public void selecttpgatewaypaymentstatus()
	{
		click(paymenttpgateway, WaitStrategy.CLICKABLE, "paymenttpgateway button");
		click(paymenttpgatewaystatus, WaitStrategy.CLICKABLE, "paymenttpgatewaystatus button");
	}
	
	public void selectbillingcounty()
	{
		click(billingcounty, WaitStrategy.CLICKABLE, "salary button");
	}
	
	
	public void selectbillingcountydropdown()
	{
		click(billingcountrydropdown, WaitStrategy.CLICKABLE, "billingcountrydropdown button");
	}
	
	public void ClickonMealrestrictiondropdown()
	{
		click(Mealrestriction, WaitStrategy.CLICKABLE, "Mealrestriction button");
		click(Mealrestrictiontype, WaitStrategy.CLICKABLE, "Mealrestrictiontype button");		
	}
	
	public StudentEnrollmentPage EnterdetailInName(String Name)
	{
		clear(name, Name, WaitStrategy.PRESENSE, "name Textbox field");
		sendKeys(name, Name, WaitStrategy.PRESENSE, "name Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInNric(String nric)
	{
		clear(Nric, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
		sendKeys(Nric, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanysme(String Companysme)
	{
		clear(companysme, Companysme, WaitStrategy.PRESENSE, "companysme Textbox field");
		sendKeys(companysme, Companysme, WaitStrategy.PRESENSE, "companysme Textbox field");
		return this;
	}

	
	public StudentEnrollmentPage EnterdetailInAge(String age)
	{
		clear(Age, age, WaitStrategy.PRESENSE, "Age Textbox field");
		sendKeys(Age, age, WaitStrategy.PRESENSE, "Age Textbox field");
		return this;
	}

	public StudentEnrollmentPage EnterdetailInemail(String Email)
	{
		clear(email, Email, WaitStrategy.PRESENSE, "email Textbox field");
		sendKeys(email, Email, WaitStrategy.PRESENSE, "email Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInmobileno(String Mobileno)
	{
		clear(mobileno, Mobileno, WaitStrategy.PRESENSE, "mobileno Textbox field");
		sendKeys(mobileno, Mobileno, WaitStrategy.PRESENSE, "mobileno Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIndob(String Dob)
	{
		clear(dob, Dob, WaitStrategy.PRESENSE, "dob Textbox field");
		sendKeys(dob, Dob, WaitStrategy.PRESENSE, "dob Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanyname(String Companyname)
	{
		clear(companyname, Companyname, WaitStrategy.PRESENSE, "companyname Textbox field");
		sendKeys(companyname, Companyname, WaitStrategy.PRESENSE, "companyname Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanyuen(String Companyuen)
	{
		clear(companyuen, Companyuen, WaitStrategy.PRESENSE, "companyuen Textbox field");
		sendKeys(companyuen, Companyuen, WaitStrategy.PRESENSE, "companyuen Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanycontactperson(String Companycontactperson)
	{
		clear(companycontactperson, Companycontactperson, WaitStrategy.PRESENSE, "companycontactperson Textbox field");
		sendKeys(companycontactperson, Companycontactperson, WaitStrategy.PRESENSE, "companycontactperson Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanycontactpersonemail(String Companycontactpersonemail)
	{
		clear(companycontactpersonemail, Companycontactpersonemail, WaitStrategy.PRESENSE, "companycontactpersonemail Textbox field");
		sendKeys(companycontactpersonemail, Companycontactpersonemail, WaitStrategy.PRESENSE, "companycontactpersonemail Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanycontactpersonnumber(String Companycontactpersonnumber)
	{
		clear(companycontactpersonnumber, Companycontactpersonnumber, WaitStrategy.PRESENSE, "companycontactpersonnumber Textbox field");
		sendKeys(companycontactpersonnumber, Companycontactpersonnumber, WaitStrategy.PRESENSE, "companycontactpersonnumber Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInbillingmail(String Billingmail)
	{
		clear(billingmail, Billingmail, WaitStrategy.PRESENSE, "billingmail Textbox field");
		sendKeys(billingmail, Billingmail, WaitStrategy.PRESENSE, "billingmail Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInbillingzip(String Billingzip)
	{
		clear(billingzip, Billingzip, WaitStrategy.PRESENSE, "billingzip Textbox field");
		sendKeys(billingzip, Billingzip, WaitStrategy.PRESENSE, "billingzip Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInbillingaddress(String Billingaddress)
	{
		clear(billingaddress, Billingaddress, WaitStrategy.PRESENSE, "billingaddress Textbox field");
		sendKeys(billingaddress, Billingaddress, WaitStrategy.PRESENSE, "billingaddress Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInRemark(String remark)
	{
		clear(Remark, remark, WaitStrategy.PRESENSE, "Remark Textbox field");
		sendKeys(Remark, remark, WaitStrategy.PRESENSE, "Remark Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInPaymentamount(String paymentamount)
	{
		clear(Paymentamount, paymentamount, WaitStrategy.PRESENSE, "Paymentamount Textbox field");
		sendKeys(Paymentamount, paymentamount, WaitStrategy.PRESENSE, "Paymentamount Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInMealrestrictiontype(String mealrestricationother)
	{
		clear(Mealrestricationother, mealrestricationother, WaitStrategy.PRESENSE, "Mealrestricationother Textbox field");
		sendKeys(Mealrestricationother, mealrestricationother, WaitStrategy.PRESENSE, "Mealrestricationother Textbox field");
		return this;
	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
}
