package sis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class EnrollStudent extends CommonMethods{
	

@Given("I am logged in as an admin with username {string} and password {string}")
public void i_am_logged_in_as_an_admin_with_username_and_password(String username, String password) {
		driver.get("https://sis.neotechacademy.com/");
		loginPage.userNameField.sendKeys(username);
		loginPage.passwordField.sendKeys(password);
		loginPage.loginButton.click();
		
	
}
@When("I search for the student I created")
public void i_search_for_the_student_i_created() {
		mainPage.studentsMain.click();
		selectDropdown(enrollStudent.selectFilter, "Unenrolled");
		driver.findElement(By.xpath("//option[@value='993']")).click();
    
}
@When("I enroll the student by filling out the required information")
public void i_enroll_the_student_by_filling_out_the_required_information() {
	enrollStudent.enrolllink.click();
	enrollStudent.enrollDate.clear();
	enrollStudent.enrollDate.sendKeys("12/6/2024");
	selectDropdown(enrollStudent.enrollCode, "01-Enrolled");
	jsClick(enrollStudent.enrollButton);
   
}
@Then("I should verify that the student's status is {string} in the student search results")
public void i_should_verify_that_the_student_s_status_is_in_the_student_search_results(String string) {
    selectDropdown(enrollStudent.selectFilter, "Enrolled");
    Assert.assertTrue(driver.findElement(By.xpath("//option[@value='993']")).isDisplayed());
    
}
@Then("I should verify that the student's enrollment status is {string} in the enrollment sub-tab")
public void i_should_verify_that_the_student_s_enrollment_status_is_in_the_enrollment_sub_tab(String string) {
   
}

}
