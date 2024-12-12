package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class MainPageElements {
	
	@FindBy (xpath="//span[normalize-space()='Main Page']")
	public WebElement mainPage;
	
	@FindBy (xpath = "//a[normalize-space()='Students']")
	public WebElement studentsMain;
	
	@FindBy (xpath = "//a[normalize-space()='Staff/Faculty']")
	public WebElement staffMain;
	
	@FindBy (xpath = "//a[normalize-space()='Scheduling']")
	public WebElement schedulingMain;
	
	@FindBy (xpath = "//a[normalize-space()='Attendance']")
	public WebElement attendanceMain;
	
	@FindBy (xpath = "//a[normalize-space()='Discipline']")
	public WebElement disciplineMain;
	
	@FindBy (xpath = "//a[normalize-space()='Lesson Plans']")
	public WebElement lessonPlanMain;
	
	@FindBy (xpath = "//a[normalize-space()='Tests']")
	public WebElement testsMain;
	
	@FindBy (xpath = "//a[normalize-space()='Reports']")
	public WebElement reportsMain;
	
	@FindBy (xpath = "//a[normalize-space()='Dashboard']")
	public WebElement dashboardMain;
	
	@FindBy (xpath = "//a[normalize-space()='Settings']")
	public WebElement settingMain;
	
	@FindBy (xpath = "//a[@class='linkMid']")
	public WebElement logoutButton;
	
	@FindBy (xpath = "//span[@class='titleSmall' and contains(text(), 'Announcements')]")
	public WebElement announcementMain;
	
	@FindBy (xpath = "//img[@id='Header1_imgSchoolLogo']")
	public WebElement logoMain;
	
	
	public MainPageElements() {

		PageFactory.initElements(BaseClass.driver, this);
	}


}
