package sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class VerifyTeacherRolePageElements {
	@FindBy (xpath = "//span[@id='lblStaffId']")
	public WebElement localID;
	
	@FindBy (xpath = "//span[@id='lblJobTitle']")
	public WebElement jobTitle;
	
	@FindBy (xpath = "//span[@id='lblRoomNo']")
	public WebElement classroom;
	
	@FindBy (xpath = "//span[@id='lblDateofBirth']")
	public WebElement birthDate;
	
	@FindBy (xpath = "//span[@id='lblGender']")
	public WebElement gender;
	
	@FindBy (xpath = "//table[@id='tablePersonalInfoShow']/tbody//tr//td")
	public List<WebElement> personalInfo;
	
	
	
	
	
	
	public VerifyTeacherRolePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
