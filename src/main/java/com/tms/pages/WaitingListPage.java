package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class WaitingListPage extends BasePage {
	
	private final By Addnew = By.xpath("//i[@class='add-new']");
	private final By Editrecord = By.xpath("(//a[.=' Edit'])[1]");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By Listdots = By.xpath("(//span[@class='list-dots'])[1]");
	private final By Courserun = By.xpath("//span[@class='select2-selection__rendered']");
	private final By Courserundropdown = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[5]");
	private final By Name = By.xpath("//div//input[@name='students[0][name]']");
	private final By Contactnumber = By.xpath("//div//input[@name='students[0][contact_number]']");
	private final By Email = By.xpath("//div//input[@name='students[0][email]']");
	private final By Nric = By.xpath("//div//input[@name='students[0][nric]']");
	private final By Status = By.xpath("(//select[@name='students[0][status]'])[1]");
	private final By Selectstatus = By.xpath("//option[@value='1']");
	private final By Name1 = By.id("name");
	private final By Contactnumber1 = By.xpath("//input[@name='contact_number']");
	private final By Email1 = By.xpath("//input[@name='email']");
	private final By Nric1 = By.xpath("//input[@name='nric']");
	private final By Status1 = By.xpath("//select[@name='status']");
	private final By Notes = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/textarea[1]");
	private final By Notes1 = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/h4header-title[1]/div[1]/div[6]/div[1]/textarea[1]");
	
	
	public void clickonListdotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "listdotsclick button");
	}
	
	public void Status1()
	{
		click(Status1, WaitStrategy.CLICKABLE, "Status1 button");
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
		click(Courserun, WaitStrategy.CLICKABLE, "Courserun button");

	}
	
	public void selectcourserunfromdropdown() {
		
		click(Courserundropdown, WaitStrategy.CLICKABLE, "Courserundropdown button");
	}
	
	public void Status()
	{
		click(Status, WaitStrategy.CLICKABLE, "Status button");
	}
	
public void Selectstatus() {
		
		click(Selectstatus, WaitStrategy.CLICKABLE, "Selectstatus button");
	}

public WaitingListPage EnterdetailInNotes(String notes)
{
	clear(Notes, notes, WaitStrategy.PRESENSE, "notes Textbox field");
	sendKeys(Notes, notes, WaitStrategy.PRESENSE, "notes Textbox field");
	return this;
}

public WaitingListPage EnterdetailInNotes1(String notes1)
{
	clear(Notes1, notes1, WaitStrategy.PRESENSE, "notes Textbox field");
	sendKeys(Notes1, notes1, WaitStrategy.PRESENSE, "notes Textbox field");
	return this;
}

public WaitingListPage EnterdetailInName(String name)
{
	clear(Name, name, WaitStrategy.PRESENSE, "Name Textbox field");
	sendKeys(Name, name, WaitStrategy.PRESENSE, "Name Textbox field");
	return this;
}

public WaitingListPage EnterdetailInName1(String name)
{
	clear(Name1, name, WaitStrategy.PRESENSE, "Name Textbox field");
	sendKeys(Name1, name, WaitStrategy.PRESENSE, "Name Textbox field");
	return this;
}

public WaitingListPage EnterdetailInContactnumber1(String contactnumber)
{
	clear(Contactnumber1, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
	sendKeys(Contactnumber1, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
	return this;
}

public WaitingListPage EnterdetailInContactnumber(String contactnumber)
{
	clear(Contactnumber, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
	sendKeys(Contactnumber, contactnumber, WaitStrategy.PRESENSE, "Contactnumber Textbox field");
	return this;
}

public WaitingListPage EnterdetailInEmail1(String email)
{
	clear(Email1, email, WaitStrategy.PRESENSE, "Email1 Textbox field");
	sendKeys(Email1, email, WaitStrategy.PRESENSE, "Email1 Textbox field");
	return this;
}

public WaitingListPage EnterdetailInEmail(String email)
{
	clear(Email, email, WaitStrategy.PRESENSE, "Email Textbox field");
	sendKeys(Email, email, WaitStrategy.PRESENSE, "Email Textbox field");
	return this;
}


public WaitingListPage EnterdetailInNric(String nric)
{
	clear(Nric, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
	sendKeys(Nric, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
	return this;
}

public WaitingListPage EnterdetailInNric1(String nric)
{
	clear(Nric1, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
	sendKeys(Nric1, nric, WaitStrategy.PRESENSE, "Nric Textbox field");
	return this;
}

public void updaterecord()
{
	click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
}
	
	
	
}
