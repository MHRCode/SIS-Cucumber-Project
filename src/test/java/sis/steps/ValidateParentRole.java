package sis.steps;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class ValidateParentRole extends CommonMethods {
	
	@When("I log in with valid credentials as {string} and {string}")
	public void i_log_in_with_valid_credentials_as_and(String string, String string2) {
		
		loginPage.userNameField.sendKeys("stevwhite");
		loginPage.passwordField.sendKeys("Jiu87k");
		loginPage.loginButton.click();
	   wait(5);
	}
	@Then("I should see the parent profile section with the following details:")
	public void i_should_see_the_parent_profile_section_with_the_following_details(DataTable dataTable) {
		WebElement parentProfileSection = driver.findElement(By.xpath("//span[normalize-space()='Parent Profile']")); 
		Assert.assertTrue("Parent Profile section is not displayed", parentProfileSection.isDisplayed());

        Map<String, String> expectedDetails = dataTable.asMap(String.class, String.class);

        // Get Full Name
        String firstName = driver.findElement(By.xpath("//span[@id='lFirstName']")).getText().trim();
        String lastName = driver.findElement(By.xpath("//span[@id='lLastName']")).getText().trim();
        String fullName = firstName + " " + lastName;
        Assert.assertTrue(
        	    "Full Name does not match",
        	    expectedDetails.get("Full Name").equalsIgnoreCase(fullName)
        	);

        // Validate other fields
        String actualAddress = driver.findElement(By.xpath("//span[@id='lAddress']")).getText().trim().replace(",", "");
        String expectedAddress = expectedDetails.get("Address").trim();
        Assert.assertEquals("Address does not match", expectedAddress.toLowerCase(), actualAddress.toLowerCase());

        // Validate other fields
        Assert.assertEquals(
            "Work Phone does not match",
            expectedDetails.get("Work Phone"),
            driver.findElement(By.xpath("//span[@id='lWorkPhone']")).getText().trim()
        );
        String actualEmail = driver.findElement(By.xpath("//span[@id='lEmail']")).getText().trim().replace(",", "");
        String expectedEmail = expectedDetails.get("Email").trim();
        Assert.assertEquals("Email does not match", expectedEmail, actualEmail);

        WebElement cellPhoneElement = driver.findElement(By.xpath("//span[@data-trcode='CellPhone']"));
        Assert.assertTrue("Cell Phone field is not displayed", cellPhoneElement.isDisplayed());
	}
	@Then("I should see the student section with the following details:")
	public void i_should_see_the_student_section_with_the_following_details(DataTable dataTable) {
		WebElement studentSection = driver.findElement(By.xpath("//span[normalize-space()='Student']")); 
        Assert.assertTrue("Student section is not displayed", studentSection.isDisplayed());

        Map<String, String> expectedDetails = dataTable.asMap(String.class, String.class);

        // Validate each field in the Student section
        WebElement studentNameElement = driver.findElement(By.xpath("//span[@id='GridStudents_ctl02_lStudentName']"));
        String actualStudentName = studentNameElement.getText().trim();
        Assert.assertEquals("Student Name does not match", expectedDetails.get("Student Name"), actualStudentName);

        // Validate "Student ID"
        WebElement studentIdElement = driver.findElement(By.xpath("//span[@id='GridStudents_ctl02_lStdId']"));
        String actualStudentId = studentIdElement.getText().trim();
        Assert.assertEquals("Student ID does not match", expectedDetails.get("Student ID"), actualStudentId);

        // Validate "Grade Level"
        WebElement gradeLevelElement = driver.findElement(By.xpath("//span[@id='GridStudents_ctl02_lblGradeLevel']"));
        String actualGradeLevel = gradeLevelElement.getText().trim();
        Assert.assertEquals("Grade Level does not match", expectedDetails.get("Grade Level"), actualGradeLevel);

        // Validate "Date of Birth"
        WebElement dobElement = driver.findElement(By.xpath("//span[@id='GridStudents_ctl02_lblDateofBirth']"));
        String actualDob = dobElement.getText().trim();
        Assert.assertEquals("Date of Birth does not match", expectedDetails.get("Date of Birth"), actualDob);
    }
	@Then("I should see the following navigation tabs:")
	public void i_should_see_the_following_navigation_tabs(DataTable dataTable) {
	
		   Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Attendance']")).isDisplayed());
		   Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Grades']")).isDisplayed());
		   Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Homework']")).isDisplayed());
		   Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Results']")).isDisplayed());
		   Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Schedule']")).isDisplayed());
		   Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Discipline']")).isDisplayed());
		   

		        }
		    }
		

