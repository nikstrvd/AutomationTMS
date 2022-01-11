package com.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;

import com.tms.enums.WaitStrategy;

public class CoursePage extends BasePage {
	
	
	private final By Addnew = By.xpath("//a[.=' Add New']");
	private final By name = By.xpath("//input[@name='name']");
	private final By selectcoursemodule = By.id("select2-course_type_id-container");
	private final By Selectcourse = By.xpath("//li[text()='Single Course ']");
	private final By Coursetype = By.id("course_type");
	private final By Selectcoursetype = By.xpath("//option[text()='WSQ']");
	private final By referencenumber = By.id("reference_number");
	private final By Skillcode = By.id("skill_code");
	private final By Modeoftraining = By.id("course_mode_training");
	private final By Mod = By.id("select2-modeoftraining-container");
	private final By Mod1 = By.id("select2-modeoftraining-bq-container");
	private final By Selecttrainingmode = By.xpath("//option[text()='Offline']");
	private final By trainers = By.xpath("(//ul[@class='select2-selection__rendered'])[1]");
	private final By items = By.xpath("(//ul[@class='select2-selection__rendered'])[3]");
	private final By items1 = By.xpath("//ul/li[@class='select2-results__option'][1]");
	private final By items2 = By.xpath("//ul/li[@class='select2-results__option'][2]");
	private final By items3 = By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	
	
	private final By Listdots = By.xpath("(//span[@class='list-dots'])[3]");
	private final By Viewcourserun = By.xpath("(//a[contains(text(),'View Course Run')])[3]");
	private final By Addcourserun = By.xpath("(//i[@class='fas fa-plus font-16'])[1]");	
	private final By Editrecord = By.xpath("(//a[contains(text(),'Edit')])[3]");	
	
	private final By coursecode = By.xpath("//input[@name='course_code']");
	private final By Maintrainer = By.xpath("(//span[@id='select2-coursetrainers-container'])[1]");	
	private final By selecttrainers = By.xpath("//li[text()='Nikhil Trivedi']");	
	private final By Assistenttrainer = By.xpath("(//ul[@class='select2-selection__rendered'])[1]");
	private final By SelectAssitent = By.xpath("//li[text()='Nikhil Trivedi']");	
	
	private final By Selectmodeoftraining = By.xpath("(//option[normalize-space()='Select option'])[1]");
	private final By Selectoption = By.xpath("//li[text()='On-the-Job']");
	private final By Courseprimatyvenue = By.xpath("(//span[@id='select2-venue_id-container'])[1]");
	private final By Selectvenue = By.xpath("(//li[@class='select2-results__option'])[2]");
	private final By Coursevacancycode = By.xpath("//select[@name='coursevacancy_code']");
	private final By Selectcoursevacancycode = By.xpath("//option[text()='Full']");
	
	private final By Minintakesize = By.id("minintakesize");
	private final By Maxintakesize = By.id("intakesize");
	private final By Threshold = By.id("threshold");
	
	private final By AddSession = By.cssSelector(".btn.btn-danger.btn-sm");
	
	private final By View = By.xpath("//ul[@class='dropdown-menu show']//a[contains(text(),'View')]");
	private final By StudentList = By.xpath("//ul[@class='dropdown-menu show']//a[contains(text(),'Students List')]");
	private final By Attendence = By.xpath("//ul[@class='dropdown-menu show']//a[contains(text(),'Attendance & Assessments')]");
	private final By Editrecord1 = By.xpath("//ul[@class='dropdown-menu show']//a[contains(text(),'Edit')]");	
	
	private final By Traineelist = By.xpath("//button[@id='nav-trainee-tab']");
	private final By CancelledTraineelist = By.id("nav-trainee-cancelled-tab");
	private final By Softbookingstab = By.xpath("//button[@id='nav-soft-booking-tab']");
	private final By Waitinglisttab = By.xpath("//button[@id='nav-waiting-list-tab']");
	private final By Paymentlisttab = By.xpath("//button[@id='nav-payments-list-tab']");
	private final By Refersherstab = By.xpath("//button[@id='nav-refresher-tab']");
	private final By TPGatewayResponse = By.id("nav-response-list-tab");
	private final By ActivityList = By.id("nav-activity-list-tab");
	private final By View1 = By.xpath("//div[@class='dropdown dot-list show']//li[1]");
	private final By edit1 = By.xpath("//ul[@class='dropdown-menu show']//a[contains(text(),'Edit')]");
	private final By viewpayments = By.xpath("//ul[@class='dropdown-menu show']//a[@class='viewpayment'][normalize-space()='View Payments']");
	
	public void clickonView1()
	{
		click(View1, WaitStrategy.CLICKABLE, "View1 Button");
	}
	
	public void clickonedit1()
	{
		click(edit1, WaitStrategy.CLICKABLE, "edit1 Button");
	}
	
	public void clickonviewpayments()
	{
		click(viewpayments, WaitStrategy.CLICKABLE, "viewpayments Button");
	}
	public void clickonTraineelistTab()
	{
		click(Traineelist, WaitStrategy.CLICKABLE, "Traineelist Tab");
	}
	
	public void clickonCancelledTraineelistTab()
	{
		click(CancelledTraineelist, WaitStrategy.CLICKABLE, "CancelledTraineelist Tab");
	}
	
	public void clickonTPGatewayResponseTab()
	{
		click(TPGatewayResponse, WaitStrategy.CLICKABLE, "TPGatewayResponse Tab");
	}
	
	public void clickonActivityListTab()
	{
		click(ActivityList, WaitStrategy.CLICKABLE, "ActivityList Tab");
	}
	
	public void clickonSoftbookingstab()
	{
		click(Softbookingstab, WaitStrategy.CLICKABLE, "Softbookingstab Tab");
	}
	
	public void clickonWaitinglisttab()
	{
		click(Waitinglisttab, WaitStrategy.CLICKABLE, "Waitinglisttab Tab");
	}
	
	public void clickonPaymentlisttab()
	{
		click(Paymentlisttab, WaitStrategy.CLICKABLE, "Paymentlisttab Tab");
	}
	
	public void clickonRefersherstab()
	{
		click(Refersherstab, WaitStrategy.CLICKABLE, "Refersherstab Tab");
	}
	
	public void clickonViewFromListdotsButton()
	{
		click(View, WaitStrategy.CLICKABLE, "View button");
	}
	
	public void clickonStudentListFromListdotsButton()
	{
		click(StudentList, WaitStrategy.CLICKABLE, "StudentList button");
	}
	
	public void clickonAttendenceListFromListdotsButton()
	{
		click(Attendence, WaitStrategy.CLICKABLE, "Attendence button");
	}
	
	public void clickonEditrecordFromListdotsButton()
	{
		click(Editrecord1, WaitStrategy.CLICKABLE, "Editrecord button");
	}
	
	
	
	public void Addcourserun()
	{
		click(Addcourserun, WaitStrategy.CLICKABLE, "Addcourserun button");

	}
	
	public void AddSession()
	{
		click(AddSession, WaitStrategy.CLICKABLE, "AddSession button");

	}
	
	public CoursePage Skillcode(String skill)
	{
		clear(Skillcode, skill, WaitStrategy.PRESENSE, "skill Textbox field");
		sendKeys(Skillcode, skill, WaitStrategy.PRESENSE, "skill Textbox field");
		return this;

	}
	
	public void clickonListdotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "listdotsclick button");
	}
	
	public void ClickonViewCourseRunfromListDotsButton()
	{
		click(Viewcourserun, WaitStrategy.CLICKABLE, "Viewcourserun button");
	}
	
	public void ClickonAddCourseRunfromListDotsButton()
	{
		click(Addcourserun, WaitStrategy.CLICKABLE, "Addcourserun button");
	}
	
	public void ClickonEditfromListDotsButton()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");
	}
	
	public void Viewcourserun()
	{
		click(Viewcourserun, WaitStrategy.CLICKABLE, "Viewcourserun button");

	}
	
	public void SelectMainTrainer()
	{
		click(Maintrainer, WaitStrategy.CLICKABLE, "Maintrainer button");

	}
	
	public void Coursetype()
	{
		click(Coursetype, WaitStrategy.CLICKABLE, "Coursetype button");

	}
	
	public void Selectcoursetype()
	{
		click(Selectcoursetype, WaitStrategy.CLICKABLE, "Selectcoursetype button");

	}
	
	public void Assistenttrainer()
	{
		click(Assistenttrainer, WaitStrategy.CLICKABLE, "Assistenttrainer button");

	}
	
	public void SelectAssitent()
	{
		click(SelectAssitent, WaitStrategy.CLICKABLE, "SelectAssitent button");

	}
	
	public void Courseprimatyvenue()
	{
		click(Courseprimatyvenue, WaitStrategy.CLICKABLE, "Courseprimatyvenue button");

	}
	
	public void Selectvenue()
	{
		click(Selectvenue, WaitStrategy.CLICKABLE, "Selectvenue button");

	}
	
	public void Coursevacancycode()
	{
		click(Coursevacancycode, WaitStrategy.CLICKABLE, "Coursevacancycode button");

	}
	
	public void Selectcoursevacancycode()
	{
		click(Selectcoursevacancycode, WaitStrategy.CLICKABLE, "Selectcoursevacancycode button");

	}
	
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
	public void Selectcoursemodule()
	{
		click(selectcoursemodule, WaitStrategy.CLICKABLE, "selectcoursemodule button");
		click(Selectcourse, WaitStrategy.CLICKABLE, "selectvalue button");
		//List<WebElement> values = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values.size());
		//selectOptionFromDropDown(values, "Single");
		
		
	}
	
	public void SelectModeofTraining()
	{
		click(Modeoftraining, WaitStrategy.CLICKABLE, "Modeoftraining button");
		click(Selecttrainingmode, WaitStrategy.CLICKABLE, "Selecttrainingmode button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void SelectModeofTraining1()
	{
		click(Mod, WaitStrategy.CLICKABLE, "Modeoftraining button");
		click(Selectoption, WaitStrategy.CLICKABLE, "Selectoption button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void SelectModeofTraining2()
	{
		click(Mod1, WaitStrategy.CLICKABLE, "Modeoftraining button");
		click(Selectoption, WaitStrategy.CLICKABLE, "Selectoption button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void SelectItems()
	{
		click(items, WaitStrategy.CLICKABLE, "items button");
		click(items1, WaitStrategy.CLICKABLE, "items1 button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void SelectItems1()
	{
		click(items, WaitStrategy.CLICKABLE, "items button");
		click(items2, WaitStrategy.CLICKABLE, "items2 button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void SelectItems2()
	{
		click(items, WaitStrategy.CLICKABLE, "items button");
		click(items3, WaitStrategy.CLICKABLE, "items3 button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void SelectTrainers()
	{
		click(trainers, WaitStrategy.CLICKABLE, "trainers button");
		click(selecttrainers, WaitStrategy.CLICKABLE, "selectvalue button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void cancelreocrd()
	{
		click(cancelprofile, WaitStrategy.CLICKABLE, "Cancel button");
	}
	
	public CoursePage EnterdetailInName(String Name)
	{
		clear(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		sendKeys(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		return this;
	}
	
	public CoursePage EnterdetailInReferenceNumber(String ReferenceNumber)
	{
		clear(referencenumber, ReferenceNumber, WaitStrategy.PRESENSE, "ReferenceNumber Textbox field");
		sendKeys(referencenumber, ReferenceNumber, WaitStrategy.PRESENSE, "ReferenceNumber Textbox field");
		return this;
	}
	
	public CoursePage EnterdetailInCoursecode(String Coursecode)
	{
		clear(coursecode, Coursecode, WaitStrategy.PRESENSE, "Coursecode Textbox field");
		sendKeys(coursecode, Coursecode, WaitStrategy.PRESENSE, "Coursecode Textbox field");
		return this;
	}
	
	public CoursePage Minintakesize(String minintakesize)
	{
		clear(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		sendKeys(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		return this;
	}
	
	public CoursePage Maxintakesize(String maxintakesize)
	{
		clear(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		sendKeys(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		return this;
	}
	
	public CoursePage Threshold(String threshold)
	{
		clear(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		sendKeys(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		return this;
	}

}
