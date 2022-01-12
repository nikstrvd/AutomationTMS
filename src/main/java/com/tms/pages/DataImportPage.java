package com.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import com.tms.enums.WaitStrategy;

public class DataImportPage extends BasePage {
	
	private final By importdata = By.xpath("//button[normalize-space()='Import Data']");
	private final By clickoncoursedd = By.xpath("(//span[@id='select2-coursemain-container'])[1]");
	private final By selectcourse = By.xpath("//li[@class='select2-results__option'][4]");
	private final By courserunid = By.id("courserun_id");
	private final By gerfromtpg = By.id("getFromTPG");
	private final By enrolmentid = By.id("enrolment_id");
	
	
	public void clickonimportdata()
	{
		click(importdata, WaitStrategy.CLICKABLE, "importdata button");
	}
	
	public void clickoncoursedd()
	{
		click(clickoncoursedd, WaitStrategy.CLICKABLE, "clickoncoursedd button");
	}
	
	public void clickonselectcoursefromdataimport()
	{
		click(selectcourse, WaitStrategy.CLICKABLE, "selectcourse button");
	}
	
	public DataImportPage EnrolmentId(String Enrolmentid)
	{
		clear(enrolmentid, Enrolmentid, WaitStrategy.PRESENSE, "enrolmentid Textbox field");
		sendKeys(enrolmentid, Enrolmentid, WaitStrategy.PRESENSE, "Enrolmentid Textbox field");
		return this;
	}
	
	public DataImportPage CourserunId(String Courserunid)
	{
		clear(courserunid, Courserunid, WaitStrategy.PRESENSE, "courserunid Textbox field");
		sendKeys(courserunid, Courserunid, WaitStrategy.PRESENSE, "courserunid Textbox field");
		return this;
	}
	
	public void clickongerfromtpg()
	{
		click(gerfromtpg, WaitStrategy.CLICKABLE, "gerfromtpg button");
	}

}
