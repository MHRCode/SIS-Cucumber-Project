package sis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class VerifyStudent extends CommonMethods {

	 @Given("User navigates to SIS login page")
	    public void userNavigatesToSISLoginPage() {
	       
	        driver.get("https://sis.neotechacademy.com/");
	    }

	    @When("User logs in with username {string} and password {string}")
	    public void userLogsInWithUsernameAndPassword(String username, String password) {
	        loginPage.userNameField.sendKeys(username);
	        loginPage.passwordField.sendKeys(password);
	        loginPage.loginButton.click();
	    }

	    @Then("User should be logged in successfully")
	    public void userShouldBeLoggedInSuccessfully() {
	        WebElement dashboard = driver.findElement(By.xpath("//span[@data-trcode='mainpage']"));
	        Assert.assertTrue("Login failed!", dashboard.isDisplayed());
	    }

	    @And("Verify Student ID matches {string}")
	    public void verifyStudentIDMatches(String expectedStudentID) {
	        WebElement studentID = driver.findElement(By.xpath("//span[@id='lStudentID']"));
	        Assert.assertEquals("Student ID mismatch!", expectedStudentID, studentID.getText());
	    }

	    @And("Verify Student Name matches {string}")
	    public void verifyStudentNameMatches(String expectedStudentName) {
	        WebElement studentName = driver.findElement(By.xpath("//span[@id='lStdName']"));
	        Assert.assertEquals("Student Name mismatch!", expectedStudentName, studentName.getText());
	    }

	    @And("Verify Grade Section is {string}")
	    public void verifyGradeSectionIs(String expectedGradeSection) {
	        WebElement gradeSection = driver.findElement(By.xpath("//span[@id='lGrdSec']"));
	        Assert.assertEquals("Grade Section mismatch!", expectedGradeSection, gradeSection.getText());
	    }

	    @And("Verify Username matches {string}")
	    public void verifyUsernameMatches(String expectedUsername) {
	        WebElement username = driver.findElement(By.xpath("//span[@id='lUserName']"));
	        Assert.assertEquals("Username mismatch!", expectedUsername, username.getText());
	    }
}