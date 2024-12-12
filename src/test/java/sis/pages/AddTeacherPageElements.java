package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class AddTeacherPageElements {
	
	@FindBy (xpath = "//a[normalize-space()='Staff/Faculty'] | //span[normalize-space()='Personal Info']")
	public WebElement personalInfo;
	
	@FindBy (xpath = "//input[@id='bAdd']")
	public WebElement addButton;
	
	@FindBy (xpath = "//select[@id='jPosAccLev']")
	public WebElement jobPosition;
	
	@FindBy (xpath = "//input[@id=\"cbIncludeToStateReports\"]")
	public WebElement reportRadioButton;
	
	@FindBy (xpath = "//select[@id='myTitle_list']")
	public WebElement title;
	
	@FindBy (xpath = "//input[@id=\"tLastName\"]")
	public WebElement lastName;
	
	@FindBy (xpath = "//input[@id=\"tFirstName\"]")
	public WebElement firstName;
	
	@FindBy (xpath = "//input[@id=\"tMiddleName\"]")
	public WebElement middleName;
	
	@FindBy (xpath = "//input[@id=\"tDateofBirth\"]")
	public WebElement birthDate;
	
	@FindBy (xpath = "//input[@id=\"tSSN\"]")
	public WebElement ssNumber;
	
	@FindBy (xpath = "//select[@id=\"dGender_list\"]/option[1]")
	public WebElement genderFemale;
	
	@FindBy (xpath = "//select[@id=\"dGender_list\"]/option[2]")
	public WebElement genderMale;
	
	@FindBy (xpath = "//input[@id=\"tPassword\"]")
	public WebElement tPassword;
	
	@FindBy (xpath = "//input[@id=\"tJTitle\"]")
	public WebElement jobTitle;
	
	@FindBy (xpath = "//select[@id=\"dDepartment_list\"]")
	public WebElement department;
	
	@FindBy (xpath = "//select[@id=\"dDepartment_list\"]/option[14]")
	public WebElement computerDepartment;
	
	@FindBy (xpath = "//select[@id=\"dAdvisory\"]")
	public WebElement advisorList;
	
	@FindBy (xpath = "//select[@id=\"dHomeroom\"]")
	public WebElement homeroomList;
	
	@FindBy (xpath = "//select[@id=\"dClassroom_list\"]")
	public WebElement classroomList;
	
	@FindBy (xpath = "//input[@id=\"tAddress\"]")
	public WebElement address;
	
	@FindBy (xpath = "//input[@id=\"tCity\"]")
	public WebElement city;
	
	@FindBy (xpath = "//select[@id=\"state_list\"]")
	public WebElement stateList;
	
	@FindBy (xpath = "//input[@id=\"tZip\"]")
	public WebElement zipCode;
	
	@FindBy (xpath = "//input[@id=\"tHomePhone\"]")
	public WebElement tPhone;
	
	@FindBy (xpath = "//input[@id=\"tSchoolEmail\"]")
	public WebElement tEmail;
	
	@FindBy (xpath = "//input[@id=\"bSubmit\"]")
	public WebElement submitButton;
	
	@FindBy (css="input#fileUpload")
	public WebElement photoUpload;
	
	@FindBy (xpath = "//select[@id='state_list']")
	public WebElement stateDropdown;

	@FindBy (xpath = "//select[@id='dGender_list']")
	public WebElement genderDropdown;

	@FindBy (xpath = "//select[@id='dDepartment_list']")
	public WebElement departmentDropdown;

	@FindBy (xpath = "//select[@id='dAdvisory']")
	public WebElement advisorDropdown;

	@FindBy (xpath = "//select[@id='dHomeroom']")
	public WebElement homeroomDropdown;

	@FindBy (xpath = "//select[@id='dClassroom_list']")
	public WebElement classroomDropdown;
	
	
	
	
	
	
	public AddTeacherPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
