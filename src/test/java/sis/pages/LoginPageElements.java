package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class LoginPageElements {
	@FindBy (xpath="//img[@id='logoTop']")
	public WebElement companyLogo;
	
	@FindBy (id="tUsername")
	public WebElement userNameField;
	
	@FindBy (id="tPassword")
	public WebElement passwordField;
	
	@FindBy (xpath="//select[@id='dAcademicYear_list']")
	public WebElement academicYear;
	
	@FindBy (xpath="//input[@id='bLogin']")
	public WebElement loginButton;
	
	@FindBy (xpath = "//a[normalize-space()='Forgot Password']")
	public WebElement forgetLink;
	
	
	
	
	public LoginPageElements() {

		PageFactory.initElements(BaseClass.driver, this);
	}
	
	

}
