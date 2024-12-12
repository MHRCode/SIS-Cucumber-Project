package sis.steps;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class addTeacher extends CommonMethods {
	
	
	@Given("I am logged in as an admin")
	public void i_am_logged_in_as_an_admin() {
		loginPage.userNameField.sendKeys("Admin");
	    loginPage.passwordField.sendKeys("Neotech$123");
	    loginPage.loginButton.click();
	    
	}
	
	@When("I navigate to the {string} tab in the Staff\\/Faculty section")
	public void i_navigate_to_the_tab_in_the_staff_faculty_section(String tabName) {
		mainPage.staffMain.click();
		Assert.assertTrue(addTeacher.personalInfo.isDisplayed());
	}
	@When("I click on {string}")
	public void i_click_on(String string) {
	   jsClick(addTeacher.addButton);
	   selectDropdown(addTeacher.jobPosition, "Teacher/Teacher");
	   wait(2);
	}
	@And("I fill in the staff member details with the following information:")
	public void iFillInTheStaffMemberDetailsWithTheFollowingInformation(DataTable dataTable) {
		addTeacher.reportRadioButton.click();
		selectDropdown(addTeacher.title, "Mr");
		addTeacher.lastName.sendKeys("Limanaj");
		addTeacher.firstName.sendKeys("Elion");
		addTeacher.birthDate.sendKeys("01/01/1980");
		addTeacher.ssNumber.sendKeys("123-45-6789");
		selectDropdown(addTeacher.genderDropdown, "Male");
		addTeacher.tPassword.sendKeys("Password123!");
		addTeacher.jobTitle.sendKeys("Teacer");
		selectDropdown(addTeacher.departmentDropdown, "Computer and Technology");
		
		selectDropdown(addTeacher.advisorDropdown, "5th Grade");
		selectDropdown(addTeacher.homeroomDropdown, "5th Grade");
		selectDropdown(addTeacher.classroomDropdown, "Computer");
		
		addTeacher.address.sendKeys("123 Main St");
		addTeacher.city.sendKeys("Edison");
		selectDropdown(addTeacher.stateDropdown, "NJ");
		addTeacher.zipCode.sendKeys("23897");
		addTeacher.tPhone.sendKeys("(555) 123-4567");
		addTeacher.tEmail.sendKeys("ELimanaj@aol.com");
	    wait(2);
	    addTeacher.submitButton.click();
	    wait(2);
	}
	@When("I upload a photo")
	public void i_upload_a_photo() {
		 WebElement picClick = driver.findElement(By.linkText("Click to Change"));
		    jsClick(picClick);

		    String parentWindow = driver.getWindowHandle(); // Store parent window handle
		    Set<String> allWindows = driver.getWindowHandles(); // Get all window handles

		    for (String window : allWindows) {
		        if (!window.equals(parentWindow)) {
		            // Switch to the file upload window
		            driver.switchTo().window(window);

		            try {
		                // Ensure the file has a valid extension
		                String filePath = "C:\\Users\\Rayya\\Downloads\\elion.jpg";
		                if (!filePath.endsWith(".jpg") && !filePath.endsWith(".gif")) {
		                    throw new IllegalArgumentException("Invalid file extension. Allowed extensions are .jpg and .gif.");
		                }

		                // Upload the file
		                addTeacher.photoUpload.sendKeys(filePath);

		                // Click submit in the upload dialog
		                driver.findElement(By.xpath("//input[@id='bSubmit']")).click();

		            } catch (UnhandledAlertException e) {
		                // Handle any unexpected alert during file upload
		                Alert alert = driver.switchTo().alert();
		                System.out.println("Unexpected alert encountered: " + alert.getText());
		                alert.accept(); // Dismiss the alert
		                throw new RuntimeException("File upload failed: " + alert.getText());
		            }

		            // Switch back to the parent window
		            driver.switchTo().window(parentWindow);
		            return;
		        }
		    }

		    throw new RuntimeException("File upload window not found.");
		}  
	    
	
	@When("I click {string}")
	public void i_click(String string) {
		addTeacher.submitButton.click();
	    
	}
	@Then("the new staff member should be listed with the correct details")
	public void the_new_staff_member_should_be_listed_with_the_correct_details() {
	  String teacher = driver.findElement(By.xpath("//span[@id='lStatus']")).getText();
	  String expected = "Active";
	  Assert.assertEquals(teacher, expected);

}
}


