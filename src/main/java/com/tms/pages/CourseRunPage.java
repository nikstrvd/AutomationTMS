package com.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;

import com.tms.enums.WaitStrategy;

public class CourseRunPage extends BasePage {
	
	private final By SelectCourse = By.id("select2-course_main_id-container");
	private final By SelectCourseoption = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[5]");
	private final By Add = By.id("coursemain_selection_btn");
	private final By Addnew = By.xpath("//a[.=' Add New']");
	private final By Maintrainer = By.xpath("(//span[@id='select2-coursetrainers-container'])[1]");	
	private final By selecttrainers = By.xpath("//li[text()='Nikhil Trivedi']");	
	private final By Assistenttrainer = By.xpath("(//ul[@class='select2-selection__rendered'])[1]");
	private final By SelectAssitent = By.xpath("//li[text()='Nikhil Trivedi']");	
	
	private final By Selectmodeoftraining = By.id("select2-modeoftraining-container");
	private final By SelectMod = By.id("select2-modeoftraining-m4-container");
	
	private final By Selectoption = By.xpath("//li[text()='On-the-Job']");
	private final By Courseprimatyvenue = By.xpath("(//span[@id='select2-venue_id-container'])[1]");
	private final By Selectvenue = By.xpath("(//li[@class='select2-results__option'])[2]");
	private final By Coursevacancycode = By.xpath("//select[@name='coursevacancy_code']");
	private final By Selectcoursevacancycode = By.xpath("//option[text()='Full']");
	
	private final By Minintakesize = By.id("minintakesize");
	private final By Maxintakesize = By.id("intakesize");
	private final By Threshold = By.id("threshold");
	
	private final By AddSession = By.cssSelector(".btn.btn-danger.btn-sm");
	
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	
		
	public void SelectAssitent()
	{
		click(SelectAssitent, WaitStrategy.CLICKABLE, "SelectAssitent button");

	}
	
	public void clickonSelectCourseButton()
	{
		click(SelectCourse, WaitStrategy.CLICKABLE, "SelectCourse button");
	}
	
	public void clickonSelectCourse()
	{
		click(SelectCourseoption, WaitStrategy.CLICKABLE, "SelectCourse button");
	}
	
	public void clickonAddButton()
	{
		click(Add, WaitStrategy.CLICKABLE, "Add button");
	}
	
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void SelectTrainers()
	{
		click(Maintrainer, WaitStrategy.CLICKABLE, "trainers button");
		click(selecttrainers, WaitStrategy.CLICKABLE, "selectvalue button");
	}
	
	public void SelectAssistantTrainers()
	{
		click(Assistenttrainer, WaitStrategy.CLICKABLE, "trainers button");
		click(SelectAssitent, WaitStrategy.CLICKABLE, "selectvalue button");
	}
	
	public void SelectModeofTraining()
	{
		click(Selectmodeoftraining, WaitStrategy.CLICKABLE, "Modeoftraining button");
		click(Selectoption, WaitStrategy.CLICKABLE, "Selecttrainingmode button");
	}
	
	public void SelectMod()
	{
		click(SelectMod, WaitStrategy.CLICKABLE, "Modeoftraining button");
		click(Selectoption, WaitStrategy.CLICKABLE, "Selecttrainingmode button");
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
	
	public void AddSession()
	{
		click(AddSession, WaitStrategy.CLICKABLE, "AddSession button");

	}
	
	
	public CourseRunPage Minintakesize(String minintakesize)
	{
		clear(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		sendKeys(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		return this;
	}
	
	public CourseRunPage Maxintakesize(String maxintakesize)
	{
		clear(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		sendKeys(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		return this;
	}
	
	public CourseRunPage Threshold(String threshold)
	{
		clear(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		sendKeys(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		return this;
	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
	public void cancelrecord()
	{
		click(cancelprofile, WaitStrategy.CLICKABLE, "cancelprofile button");
	}

}
