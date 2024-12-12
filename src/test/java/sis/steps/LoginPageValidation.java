package sis.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class LoginPageValidation extends CommonMethods {
	
	
	@Given("I open a browser")
	public void i_open_a_browser() {
		setUp();
	    
	}
	
	
	@Given("I navigate to correct url {string}")
	public void i_navigate_to_correct_url(String validURL) {
		
		driver.get(validURL);
	  
	}
	
	@Then("I should see the Login page")
	public void i_should_see_the_login_page() {
		
		String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("Failed to navigate to Login page.", currentUrl.contains("sis.neotechacademy.com"));
	  
	}
	
	
	@Then("the following fields should be visible:")
	public void the_following_fields_should_be_visible(DataTable Fields) {
		
		List<String> elements = Fields.asList();
		 // Loop through each field and validate its visibility
	    for (String field : elements) {
	        WebElement element = null;

	        // Map the field name to its corresponding web element
	        switch (field.toLowerCase()) {
	            case "username":
	                element = loginPage.userNameField;
	                break;
	            case "password":
	                element = loginPage.passwordField;
	                break;
	            case "academic year":
	            	element = loginPage.academicYear;
	            case "forgot password":
	                element = loginPage.forgetLink;
	                break;
	            case "login button":
	                element = loginPage.loginButton;
	                break;
	            default:
	                throw new AssertionError("Field not recognized: " + field);
	        }

	        // Assert the visibility of the element
	        Assert.assertTrue(field + " is not visible.", element.isDisplayed());
	}
	}
	
	@When("I navigate to the URL {string}")
	public void i_navigate_to_the_url(String invalidURL) {
		 try {
		        driver.get(invalidURL);
		        System.out.println("Navigated to URL: " + invalidURL);
		    } catch (org.openqa.selenium.WebDriverException e) {
		        // Handle WebDriverException gracefully
		        System.err.println("Failed to navigate to URL: " + invalidURL);
		        if (e.getMessage().contains("ERR_NAME_NOT_RESOLVED")) {
		            System.out.println("Expected error: ERR_NAME_NOT_RESOLVED detected.");
		        } else {
		            throw new AssertionError("Unexpected error during navigation.", e);
		        }
		    }
		
	    
	}
	@Then("I should see an error page or message")
	public void i_should_see_an_error_page_or_message() {
	    String pageSource = driver.getPageSource();
	    System.out.println("Page source captured for validation.");

	    // Validate the error message in the page source
	    boolean isErrorMessagePresent = pageSource.contains("ERR_NAME_NOT_RESOLVED") ||
	                                    pageSource.contains("This site can’t be reached") ||
	                                    pageSource.contains("404 - Page Not Found");

	    Assert.assertTrue("Error message not found in the page source.", isErrorMessagePresent);
	    System.out.println("Error message validated successfully.");
			


}
}





