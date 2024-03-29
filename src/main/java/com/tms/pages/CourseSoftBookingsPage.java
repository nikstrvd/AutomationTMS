package com.tms.pages;

import org.openqa.selenium.By;
import com.tms.enums.WaitStrategy;

public class CourseSoftBookingsPage extends BasePage{
	
	private final By Addnew = By.xpath("//i[@class='add-new']");
	private final By Editrecord = By.xpath("(//a[.=' Edit'])[1]");
	private final By SelectCourseRun = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]");
	private final By selectcourserunfromdropdown = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[5]");
	private final By deadlinedate = By.id("deadline_date");
	private final By Name = By.xpath("//div//input[@name='students[0][name]']");
	private final By Name1 = By.id("name");
	private final By Contactnumber = By.xpath("//div//input[@name='students[0][contact_number]']");
	private final By Contactnumber1 = By.xpath("//input[@name='contact_number']");
	private final By Email = By.xpath("//div//input[@name='students[0][email]']");
	private final By Email1 = By.xpath("//input[@name='email']");
	private final By Nric = By.xpath("//div//input[@name='students[0][nric]']");
	private final By Nric1 = By.xpath("//input[@name='nric']");
	private final By Status1 = By.xpath("//select[@name='students[0][status]']");
	private final By Status = By.xpath("//select[@name='status']");
	private final By Selectstatus = By.xpath("//option[contains(text(),'Booked')]");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By Listdots = By.xpath("(//span[@class='list-dots'])[1]");
	private final By Notes = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[6]/div[1]/textarea[1]");
	private final By Enrolstudent = By.xpath("(//a[contains(text(),'Enroll Student')])[1]");
	private final By edit = By.xpath("//div[@class='dropdown dot-list show']//li[2]");
	private final By viewnotes = By.xpath("(//a[@class='viewnotes'][normalize-space()='View Note'])[1]");
	private final By closenotes = By.xpath("//button[normalize-space()='Close']");
	
	
	public void clickonCloseButtonfromNotespopup()
	{
		click(closenotes, WaitStrategy.CLICKABLE, "closenotes button");
	}
	
	public void clickonEnrolstudentfromListdotsButton()
	{
		click(Enrolstudent, WaitStrategy.CLICKABLE, "Enrolstudent button");
	}
	
	public void clickonEditfromListdotsButton()
	{
		click(edit, WaitStrategy.CLICKABLE, "edit button");
	}
	
	public void clickonViewnotesfromListdotsButton()
	{
		click(viewnotes, WaitStrategy.CLICKABLE, "viewnotes button");
	}
	
	public void clickonListdotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "listdotsclick button");
	}
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void SelectCourseRun()
	{
		click(SelectCourseRun, WaitStrategy.CLICKABLE, "SelectCourseRun button");

	}
	
	public void selectcourserunfromdropdown() {
		
		click(selectcourserunfromdropdown, WaitStrategy.CLICKABLE, "selectcourserunfromdropdown button");
	}
	
	public void Status()
	{
		click(Status, WaitStrategy.CLICKABLE, "Status button");
	}
	
	public void Status1()
	{
		click(Status1, WaitStrategy.CLICKABLE, "Status1 button");
	}
	
	public void Selectstatus() {
		
		click(Selectstatus, WaitStrategy.CLICKABLE, "Selectstatus button");
	}
	
	public CourseSoftBookingsPage EnterdetailInName(String name)
	{
		clear(Name, name, WaitStrategy.PRESENSE, "Name Textbox field");
		sendKeys(Name, name, WaitStrategy.PRESENSE, "Name Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInName1(String name)
	{
		clear(Name1, name, WaitStrategy.PRESENSE, "Name Textbox field");
		sendKeys(Name1, name, WaitStrategy.PRESENSE, "Name Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInDeadlinedate(String Deadlinedate)
	{
		clear(deadlinedate, Deadlinedate, WaitStrategy.PRESENSE, "deadlinedate Textbox field");
		sendKeys(deadlinedate, Deadlinedate, WaitStrategy.PRESENSE, "deadlinedate Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInContactnumber(String contactnumber)
	{
		clear(Contactnumber, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
		sendKeys(Contactnumber, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInContactnumber1(String contactnumber)
	{
		clear(Contactnumber1, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
		sendKeys(Contactnumber1, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInEmail(String email)
	{
		clear(Email, email, WaitStrategy.PRESENSE, "Email Textbox field");
		sendKeys(Email, email, WaitStrategy.PRESENSE, "Email Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInEmail1(String email)
	{
		clear(Email1, email, WaitStrategy.PRESENSE, "Email Textbox field");
		sendKeys(Email1, email, WaitStrategy.PRESENSE, "Email Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInNric(String nric)
	{
		clear(Nric, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
		sendKeys(Nric, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInNric1(String nric)
	{
		clear(Nric1, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
		sendKeys(Nric1, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
		return this;
	}
	
	public CourseSoftBookingsPage EnterdetailInNotes(String notes)
	{
		clear(Notes, notes, WaitStrategy.PRESENSE, "Notes Textbox field");
		sendKeys(Notes, notes, WaitStrategy.PRESENSE, "Notes Textbox field");
		return this;
	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}

}
