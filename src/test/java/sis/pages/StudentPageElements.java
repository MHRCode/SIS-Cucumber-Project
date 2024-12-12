package sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class StudentPageElements {
	

	//@FindBy(xpath = "//a[contains(text(), 'Personal')]")
	//public WebElement personalTab;
	
	@FindBy (xpath="//a[normalize-space()='Parental']")
	public WebElement parentalTab;
	
	@FindBy (xpath = "//a[normalize-space()='Academic']")
	public WebElement academicTab;
	
	@FindBy (xpath = "//a[normalize-space()='Override Final Grade']")
	public WebElement overrideGradeTab;
	
	@FindBy (xpath = "//a[normalize-space()='Schedule']")
	public WebElement scheduleTab;
	
	@FindBy (xpath = "//a[normalize-space()='Discipline Stats']")
	public WebElement disciplineTab;
	
	@FindBy(xpath = "//a[normalize-space()='Personal 2']")
	public WebElement personal2Tab;
	
	@FindBy (xpath = "//a[normalize-space()='Enrollment']")
	public WebElement enrollmentTab;
	
	@FindBy (xpath = "//a[normalize-space()='Notes']")
	public WebElement notesTab;
	
	@FindBy (xpath = "//a[normalize-space()='E-Portfolio']")
	public WebElement portfolioTab;
	
	@FindBy (xpath = "//a[normalize-space()='Program Enrollment']")
	public WebElement programEnrollmentTab;
	
	//@FindBy(xpath = "//a[@class='subMenuItem'] | //a[contains(text(), 'Personal')]")
	//public List<WebElement> subTabs;
	
	@FindBy(xpath = "//div[@id='divDetail']/preceding::table[3]//tr//td/span | //div[@id='divDetail']/preceding::table[3]//tr//td/a")
	public List<WebElement> subTabs;
	
	
	
	public StudentPageElements() {

		PageFactory.initElements(BaseClass.driver, this);
	} 
	} 


