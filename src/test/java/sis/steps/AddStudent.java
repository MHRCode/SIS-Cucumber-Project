package sis.steps;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class AddStudent extends CommonMethods{
	

@Given("I am logged in as Admin")
public void i_am_logged_in_as_admin() {
	loginPage.userNameField.sendKeys("Admin");
    loginPage.passwordField.sendKeys("Neotech$123");
    loginPage.loginButton.click();
    
}
@When("I navigate to the {string} tab and click on {string}")
public void i_navigate_to_the_tab_and_click_on(String mainStudent, String addSt) {
	
	 mainPage.studentsMain.click();
	    addStudent.addButton.click();
   
}
@When("I enter the student details excluding Local ID, Grade Section, and Username")
public void i_enter_the_student_details_excluding_local_id_grade_section_and_username() {
	addStudent.firstName.sendKeys("Obama");
    addStudent.lastName.sendKeys("Smith");
    addStudent.middleName.sendKeys("M");
    addStudent.birthDate.sendKeys("09/20/2008");
    addStudent.ssNumber.sendKeys("231-82-1289");
    addStudent.studentEmail.sendKeys("obamawhite@aol.com");
    addStudent.studentID.sendKeys("2332");
    addStudent.stPassword.sendKeys("J97kyel#rr");

    // Dropdown Selections
    selectDropdown(addStudent.genderSelect, "Male");
    selectDropdown(addStudent.lunchSelect, "Free");
    selectDropdown(addStudent.ethnicitySelect, "Hispanic or Latino");
    selectDropdown(addStudent.raceSelect, "Asian");
    wait(2);
    
	
}

@When("I submit the student details")
public void i_submit_the_student_details() {
    WebElement submitButton = driver.findElement(By.xpath("//input[@id='bSubmit']"));
    submitButton.click();
}

@When("A success message displayed")
public void a_success_message_displayed() {
	wait(5);
	Alert alert = driver.switchTo().alert(); // Handle the alert
    String actualMessage = alert.getText().trim();
    String expectedMessage = "Successfully Added";
    Assert.assertEquals("Success message does not match!", expectedMessage, actualMessage);
    alert.accept(); // Dismiss the alert
    wait(5);
}

@When("I upload a profile picture for the student")
public void i_upload_a_profile_picture_for_the_student() {
	 WebElement picClick = driver.findElement(By.linkText("Click to Change"));
	    clickWithJS(picClick);

	    // Switch to the file upload dialog and upload the file
	    String parentWindow = driver.getWindowHandle();
	    Set<String> allWindows = driver.getWindowHandles();
	    for (String window : allWindows) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window);
	            break;
	        }
	    }

	    WebElement picUpload = driver.findElement(By.cssSelector("input#fileUpload"));
	    picUpload.sendKeys("C:\\Users\\Rayya\\Downloads\\obama.jpg");

	    driver.findElement(By.xpath("//input[@id='bSubmit']")).click();
	    driver.switchTo().window(parentWindow);
	}
@When("I click the {string} button to save the uploaded picture")
public void i_click_the_button_to_save_the_uploaded_picture(String string) {
	WebElement submitChangesButton = driver.findElement(By.xpath("//input[@id='bSubmit']"));
    submitChangesButton.click();
}

@Then("A success message {string} should be displayed")
public void a_success_message_should_be_displayed(String Message) {
	wait(5);
	Alert alert = driver.switchTo().alert(); // Handle the alert
    String actualMessage = alert.getText().trim();
    String expectedMessage = "Successfully Updated";
    Assert.assertEquals("Success message does not match!", expectedMessage, actualMessage);
    alert.accept(); // Dismiss the alert
    wait(5);
}
@Then("The system should display the Username and Password for the student")
public void the_system_should_display_the_Username_and_Password_for_the_student() {
	 
	 String actualUsername = addStudent.stUsername.getAttribute("value");
	    String actualPassword = addStudent.stPassword.getAttribute("value");
	    String expectedUsername = "ObamaSmith7";
	    String expectedpassword = "******";
    Assert.assertEquals("Username does not match!", expectedUsername, actualUsername);
    Assert.assertEquals("Password does not match!", expectedpassword, actualPassword);

    System.out.println("Generated Username: " + actualUsername);
    System.out.println("Generated Password: " + actualPassword);
    
    
}


}
