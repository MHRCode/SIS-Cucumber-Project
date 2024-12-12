package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class EnrollStudentPages {
	 
	@FindBy (xpath= "//a[@id='bStatusChange']")
	public WebElement enrolllink;
	
	@FindBy (xpath = "//input[@id='enrollDate']")
	public WebElement enrollDate;
	
	@FindBy (xpath = "//select[@id='enrollCode_list']")
	public WebElement enrollCode;
	
	@FindBy (xpath = "//input[@id='bEnroll']")
	public WebElement enrollButton;
	
	@FindBy (xpath = "//select[@id='studentStatus_list']")
	public WebElement selectFilter;
	
	
	
	
	
	public EnrollStudentPages () {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
