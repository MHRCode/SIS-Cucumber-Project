package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.testbase.BaseClass;

public class ParentalPageElements {
	
	@FindBy (xpath = "//span[normalize-space()='Parental']")
	public WebElement parentalTab;
	
	@FindBy (xpath = "//input[@id='ppFirstName']")
	public WebElement ppfirstName;
	
	@FindBy (xpath = "//input[@id='ppLastName']")
	public WebElement pplastName;
	
	@FindBy (xpath = "//input[@id='ppAddress']")
	public WebElement ppAddress;
	
	@FindBy (xpath = "//input[@id='ppWorkPhone']")
	public WebElement ppworkPhone;
	
	@FindBy (xpath = "//input[@id='ppPassword']")
	public WebElement ppPassword;
	
	@FindBy (xpath = "//input[@id='ppCity']")
	public WebElement ppCity;
	
	@FindBy (xpath = "//select[@id=\"ppState_list\"]")
	public WebElement ppState;
	
	@FindBy (xpath = "//input[@id='ppEmail1']")
	public WebElement ppEmail;
	
	@FindBy (xpath = "//input[@id='ppZipCode']")
	public WebElement ppZipcode;
	
	@FindBy (xpath = "//select[@id=\"ppRelation_list\"]")
	public WebElement ppRelation;
	
	@FindBy (xpath = "//input[@id='bSave']")
	public WebElement ppSaveButton;
	
	@FindBy (xpath= "//input[@id=\"spFirstName\"]")
	public WebElement spFirstName;
	
	@FindBy (xpath = "//input[@id=\"spLastName\"]")
	public WebElement spLastName;
	
	@FindBy (xpath = "//input[@id=\"spPassword\"]")
	public WebElement spPassword;
	
	@FindBy (xpath = "//input[@id=\"spAddress\"]")
	public WebElement spAddress;
	
	@FindBy (xpath = "//input[@id=\"spCity\"]")
	public WebElement spCity;
	
	@FindBy (xpath = "//select[@id=\"spState_list\"]")
	public WebElement spState;
	
	@FindBy (xpath = "//input[@id=\"spZipCode\"]")
	public WebElement spZipcode;
	
	@FindBy (xpath = "//input[@id=\"spHomePhone\"]")
	public WebElement spHomePhone;
	
	@FindBy(xpath = "//input[@id=\"spEmail1\"]")
	public WebElement spEmail;
	
	@FindBy (xpath = "//input[@id=\"bSaveSP\"]")
	public WebElement spSavebutton;
	
	@FindBy (xpath = "//select[@id=\"spRelation_list\"]")
	public WebElement spRelation;
	
	
	
	
	
	
	
	public ParentalPageElements(){
		PageFactory.initElements(BaseClass.driver, this);
	}

}
