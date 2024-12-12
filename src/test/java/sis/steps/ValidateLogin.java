package sis.steps;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class ValidateLogin extends CommonMethods {
	

@Given("I open a browser and navigate to the login page")
public void i_open_a_browser_and_navigate_to_the_login_page() {
	driver.get("https://sis.neotechacademy.com/");
  
}
@When("I enter valid credentials and click the login button")
public void i_enter_valid_credentials_and_click_the_login_button() {
	loginPage.userNameField.sendKeys("Admin");
	loginPage.passwordField.sendKeys("Neotech$123");
	loginPage.loginButton.click();
	
   
}
@Then("I should be logged in and landed on the Main Page")
public void i_should_be_logged_in_and_landed_on_the_main_page() {
	Assert.assertTrue(mainPage.mainPage.isDisplayed());
   
}

@Then("the Announcement section should be visible")
public void the_announcement_section_should_be_visible() {
	Assert.assertTrue(mainPage.announcementMain.isDisplayed());
    
}
@Then("the company logo should be visible")
public void the_company_logo_should_be_visible() {
	Assert.assertTrue(mainPage.logoMain.isDisplayed());
    
}
@Then("the URL should include {string}")
public void the_url_should_include(String mainURL) {
	String currentUrl = driver.getCurrentUrl();
    Assert.assertTrue("URL does not contain expected text: " + mainURL, currentUrl.contains(mainURL));
    
}

@When("I enter invalid credentials and click the login button")
public void i_enter_invalid_credentials_and_click_the_login_button() {
	loginPage.userNameField.sendKeys("administration");
	loginPage.passwordField.sendKeys("Neotech");
	loginPage.loginButton.click();
	wait(5);
    
}
@Then("I should see an error message")
public void i_should_see_an_error_message() {
	Alert alert = driver.switchTo().alert();
	String alertMsg = alert.getText();
	String actualMsg = "Either username and password do not match or your account doesn't have  access for the selected Academic Year.";
	
	Assert.assertEquals(alertMsg, actualMsg );
	alert.accept();
	
	
    
}

}
