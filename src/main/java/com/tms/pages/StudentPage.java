package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class StudentPage extends BasePage {
	
	private final By editstudent = By.xpath("(//i)[24]");
	private final By studnetname = By.id("name");
	private final By nric = By.id("nric");
	private final By email = By.id("email");
	private final By phonenumber = By.id("mobile_no");
	private final By DOB = By.id("dob");
	private final By nationality = By.id("nationality");
	private final By nationalitydropdown = By.xpath("(//option[@value='Non-Singapore Citizen/PR'])[1]");
	private final By sme = By.id("company_sme");
	private final By smedropdown = By.xpath("(//option[@value='Yes'][normalize-space()='Yes'])[1]");
	private final By companyname = By.id("company_name");
	private final By companyuen = By.id("company_uen");
	private final By companycontactperson = By.id("company_contact_person");
	private final By companycontactemail = By.id("company_contact_person_email");
	private final By companycontactphone = By.id("company_contact_person_number");
	private final By address = By.id("billing_address");
	private final By mealrestrications = By.id("meal_restrictions");
	private final By mealresticationdropdown = By.xpath("(//option[@value='Yes'][normalize-space()='Yes'])[2]");
	private final By mealrestricationstype = By.id("meal_restrictions_type");
	private final By mealresticationtypeselect = By.xpath("(//option[@value='Other'])[1]");
	private final By mealrestricationspecify = By.id("meal_restrictions_other");
	private final By submit = By.id("submit_student_edit");
	
	private final By viewcourseruns = By.xpath("(//i[@class='fas fa-eye text-info font-16'])[1]");
	private final By view = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]");
	private final By addpayment = By.xpath("//a[normalize-space()='Add Payment']");
	private final By editenrolment = By.xpath("//a[normalize-space()='Edit Enrollment']");
	private final By backbutton = By.xpath("//a[normalize-space()='Back']");
	private final By viewactivity = By.xpath("//tbody/tr[1]/td[7]/a[3]/i[1]");
	private final By headeractivity = By.xpath("div[class='modal-body'] h4[class='header-title mt-0']");
	private final By closebutton = By.xpath("//button[normalize-space()='Close']");
	
	public void Clickonsubmit()
	{
		click(submit, WaitStrategy.CLICKABLE, "submit button");
	}
	
	public void Clickonviewcourseruns()
	{
		click(viewcourseruns, WaitStrategy.CLICKABLE, "viewcourseruns button");
	}
	
	public void Clickonview()
	{
		click(view, WaitStrategy.CLICKABLE, "view button");
	}
	public void Clickonaddpayment()
	{
		click(addpayment, WaitStrategy.CLICKABLE, "addpayment button");
	}
	public void Clickoneditenrolment()
	{
		click(editenrolment, WaitStrategy.CLICKABLE, "editenrolment button");
	}
	public void Clickonbackbutton()
	{
		click(backbutton, WaitStrategy.CLICKABLE, "backbutton button");
	}
	
	public void Clickonviewactivity()
	{
		click(viewactivity, WaitStrategy.CLICKABLE, "viewactivity button");
	}
	
	public void Clickonheaderactivity()
	{
		click(headeractivity, WaitStrategy.CLICKABLE, "headeractivity button");
	}
	
	public void Clickonclosebutton()
	{
		click(closebutton, WaitStrategy.CLICKABLE, "closebutton button");
	}
	
	public void ClickonMealrestrication()
	{
		click(mealrestrications, WaitStrategy.CLICKABLE, "mealrestrications button");
		click(mealresticationdropdown, WaitStrategy.CLICKABLE, "mealresticationdropdown button");
	}
	
	public void Clickonmealrestricationstype()
	{
		click(mealrestricationstype, WaitStrategy.CLICKABLE, "mealrestricationstype button");
		click(mealresticationtypeselect, WaitStrategy.CLICKABLE, "mealresticationtypeselect button");
	}
	
	public StudentPage EnterdetailInMeal(String Mealrestricationspecify)
	{
		clear(mealrestricationspecify, Mealrestricationspecify, WaitStrategy.PRESENSE, "mealrestricationspecify Textbox field");
		sendKeys(mealrestricationspecify, Mealrestricationspecify, WaitStrategy.PRESENSE, "mealrestricationspecify Textbox field");
		return this;
	}
	
	public void ClickonEditstudnetbutton()
	{
		click(editstudent, WaitStrategy.CLICKABLE, "editstudent button");

	}
	
	public StudentPage EnterdetailInName(String Studnetname)
	{
		clear(studnetname, Studnetname, WaitStrategy.PRESENSE, "studnetname Textbox field");
		sendKeys(studnetname, Studnetname, WaitStrategy.PRESENSE, "studnetname Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInNRIC(String NRIC)
	{
		clear(nric, NRIC, WaitStrategy.PRESENSE, "nric Textbox field");
		sendKeys(nric, NRIC, WaitStrategy.PRESENSE, "nric Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInEmail(String EMAIL)
	{
		clear(email, EMAIL, WaitStrategy.PRESENSE, "EMAIL Textbox field");
		sendKeys(email, EMAIL, WaitStrategy.PRESENSE, "EMAIL Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInPhonenumber(String PHONENumber)
	{
		clear(phonenumber, PHONENumber, WaitStrategy.PRESENSE, "PHONENumber Textbox field");
		sendKeys(phonenumber, PHONENumber, WaitStrategy.PRESENSE, "PHONENumber Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInDOB(String dob)
	{
		clear(DOB, dob, WaitStrategy.PRESENSE, "DOB Textbox field");
		sendKeys(DOB, dob, WaitStrategy.PRESENSE, "DOB Textbox field");
		return this;
	}
	
	public void ClickonNationality()
	{
		click(nationality, WaitStrategy.CLICKABLE, "nationality button");
		click(nationalitydropdown, WaitStrategy.CLICKABLE, "nationalitydropdown button");
	}
	
	public void ClickonCompanySME()
	{
		click(sme, WaitStrategy.CLICKABLE, "sme button");
		click(smedropdown, WaitStrategy.CLICKABLE, "smedropdown button");

	}
	
	public StudentPage EnterdetailInCompanyName(String Companyname)
	{
		clear(companyname, Companyname, WaitStrategy.PRESENSE, "Companyname Textbox field");
		sendKeys(companyname, Companyname, WaitStrategy.PRESENSE, "Companyname Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInCompanyUEN(String Companyuen)
	{
		clear(companyuen, Companyuen, WaitStrategy.PRESENSE, "Companyuen Textbox field");
		sendKeys(companyuen, Companyuen, WaitStrategy.PRESENSE, "Companyuen Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInCompanycontactperson(String Companycontactperson)
	{
		clear(companycontactperson, Companycontactperson, WaitStrategy.PRESENSE, "companycontactperson Textbox field");
		sendKeys(companycontactperson, Companycontactperson, WaitStrategy.PRESENSE, "companycontactperson Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInCompanycontactemail(String Companycontactemail)
	{
		clear(companycontactemail, Companycontactemail, WaitStrategy.PRESENSE, "companycontactemail Textbox field");
		sendKeys(companycontactemail, Companycontactemail, WaitStrategy.PRESENSE, "companycontactemail Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInCompanycontactphone(String Companycontactphone)
	{
		clear(companycontactphone, Companycontactphone, WaitStrategy.PRESENSE, "companycontactphone Textbox field");
		sendKeys(companycontactphone, Companycontactphone, WaitStrategy.PRESENSE, "companycontactphone Textbox field");
		return this;
	}
	
	public StudentPage EnterdetailInAddress(String Address)
	{
		clear(address, Address, WaitStrategy.PRESENSE, "address Textbox field");
		sendKeys(address, Address, WaitStrategy.PRESENSE, "address Textbox field");
		return this;
	}

}
