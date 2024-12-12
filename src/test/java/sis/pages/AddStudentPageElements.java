package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class AddStudentPageElements {
	
	@FindBy (xpath="//input[@id='bAdd']")
	public WebElement addButton;
	
	@FindBy (xpath="//input[@id='tStateId']")
	public WebElement studentID;
	
	@FindBy (xpath="//input[@id='tLastName']")
	public WebElement lastName;
	
	@FindBy (xpath = "//input[@id='tFirstName']")
	public WebElement firstName;
	
	@FindBy (xpath = "//input[@id='tMiddleName']")
	public WebElement middleName;
	
	@FindBy (xpath = "//input[@id='tSSN']")
	public WebElement ssNumber;
	
	@FindBy (xpath="//input[@id='tEmail']")
	public WebElement studentEmail;
	
	@FindBy (xpath = "//input[@id='tBirthDay']")
	public WebElement birthDate;
	
	@FindBy (xpath = "//select[@id='gender_list']")
	public WebElement genderSelect;
	
	@FindBy (xpath = "//select[@id='lunchType']")
	public WebElement lunchSelect;
	
	@FindBy (xpath = "//select[@id='ddEthnicity_list']")
	public WebElement ethnicitySelect;
	
	@FindBy (xpath = "//*[@id=\"form1\"]/table[3]/tbody/tr/td[3]/table[2]/tbody/tr[14]/td[3]/div/button")
	public WebElement raceSelect;
	
	@FindBy (xpath = "//*[@id=\"tUsername\"]")
	public WebElement stUsername;
	
	@FindBy (xpath = "//*[@id=\"tPassword\"]")
	public WebElement stPassword;
	
	@FindBy (xpath = "//input[@id='tParent']")
	public WebElement stParent;
	
	@FindBy (xpath = "//input[@id='tAddress']")
	public WebElement stAddress;
	
	@FindBy (xpath = "//input[@id='tCity']")
	public WebElement stCity;
	
	@FindBy (xpath = "//input[@id='tState']")
	public WebElement stState;
	
	@FindBy (xpath = "//input[@id='tZip']")
	public WebElement stZipcode;
	
	@FindBy (xpath="//input[@id='tHomePhone']")
	public WebElement stPhone;
	
	@FindBy (xpath ="//span[normalize-space()='Asian']")
	public WebElement asian;
	
	
	@FindBy (xpath = "//a[@id='bStatusChange']")
	public WebElement enrollButton;
	
	
	
	public AddStudentPageElements() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}

}
