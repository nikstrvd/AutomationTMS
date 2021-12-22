package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class ProgramTypePage extends BasePage {
	
	private final By Addprogramtype = By.xpath("(//a[normalize-space()='Add Program Type'])[1]");
	private final By name = By.id("name");
	private final By status = By.xpath("(//label[@class='custom-control-label'])[1]//parent::div");
	private final By submit = By.xpath("(//button[normalize-space()='Submit'])[1]");
	private final By cancel = By.xpath("(//a[normalize-space()='Cancel'])[1]");
	private final By edit = By.xpath("(//i[@class='fas fa-edit text-info font-16'])[5]");
	private final By update = By.xpath("(//button[normalize-space()='Update'])[1]");
	
	public void ClickonAddprogram()
	{
		click(Addprogramtype, WaitStrategy.CLICKABLE, "Addprogramtype button");
	}
	
	public ProgramTypePage EnterdetailInName(String Name)
	{
		clear(name, Name, WaitStrategy.PRESENSE, "name Textbox field");
		sendKeys(name, Name, WaitStrategy.PRESENSE, "name Textbox field");
		return this;
	}
	
	public void ClickonStatus()
	{
		click(status, WaitStrategy.CLICKABLE, "status button");
	}
	
	public void ClickonSubmit()
	{
		click(submit, WaitStrategy.CLICKABLE, "submit button");
	}
	
	public void ClickonCancel()
	{
		click(cancel, WaitStrategy.CLICKABLE, "cancel button");
	}
	
	public void ClickonEdit()
	{
		click(edit, WaitStrategy.CLICKABLE, "edit button");
	}
	
	public void ClickonUpdate()
	{
		click(update, WaitStrategy.CLICKABLE, "update button");
	}
}
