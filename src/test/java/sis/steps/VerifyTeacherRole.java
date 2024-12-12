package sis.steps;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.pages.VerifyTeacherRolePageElements;
import sis.utils.CommonMethods;

public class VerifyTeacherRole extends CommonMethods {
	
	@Given("I navigate to {string}")
	public void i_navigate_to(String url) {
		driver.get(url);
	    
	}
	@When("I log in with teacher credentials {string} and {string}")
	public void i_log_in_with_teacher_credentials_and(String username, String password) {
	    loginPage.userNameField.sendKeys(username);
	    loginPage.passwordField.sendKeys(password);
	    loginPage.loginButton.click();
	}
	@Then("I should see the welcome message {string} on the right side")
	public void i_should_see_the_welcome_message_on_the_right_side(String welcomMsg) {
	    wait(5);
	    String expected = welcomMsg;
	    String actual = driver.findElement(By.xpath("//td[contains(text(),'Welcome')]")).getText();
	    Assert.assertEquals(expected, actual);
	}
	@Then("I should see the {string} section")
	public void i_should_see_the_section(String sectionName) {
	    WebElement section = driver.findElement(By.xpath("//table[@id='tablePersonalInfo']"));
	    Assert.assertTrue(sectionName + " section is not displayed", section.isDisplayed());
	    
	}
	@Then("I click {string} under {string}")
	public void i_click_under(String string, String string2) {
	    WebElement showlink = driver.findElement(By.xpath("//a[@id='linkShow']"));
	    showlink.click();
	}
	@Then("I should see the information:")
	public void i_should_see_the_information(DataTable dataTable) {
	   wait(10);
	    VerifyTeacherRolePageElements elements = new VerifyTeacherRolePageElements();
	    Map<String, String> expectedDetails = dataTable.asMap(String.class, String.class);

	    Assert.assertEquals("Local ID does not match", expectedDetails.get("Local ID"), elements.localID.getText().trim());
	    Assert.assertEquals("Classroom does not match", expectedDetails.get("Classroom"), elements.classroom.getText().trim());
	    Assert.assertEquals("Date of Birth does not match", expectedDetails.get("Date of Birth"), elements.birthDate.getText().trim());
	    Assert.assertEquals("Gender does not match", expectedDetails.get("Gender"), elements.gender.getText().trim());
	    Assert.assertEquals("Job Title does not match", expectedDetails.get("Job Title"), elements.jobTitle.getText().trim());
	    System.out.println("Actual Job Title: " + elements.jobTitle.getText().trim());
	}
		
	
	@Then("I should be able to see and click the {string} tab")
	public void i_should_be_able_to_see_and_click_the_tab(String tabName) {
	   wait(10);
	   WebElement student = waitForVisibility(
		        By.xpath("//a[normalize-space()='" + tabName + "']"));
		    
		    Assert.assertTrue(tabName + " tab is not displayed", student.isDisplayed());
		    student.click();
	}

}
