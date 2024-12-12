package sis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class AddParents extends CommonMethods {
	
	@Given("I log in as an admin")
	public void i_log_in_as_an_admin() {
		loginPage.userNameField.sendKeys("Admin");
	    loginPage.passwordField.sendKeys("Neotech$123");
	    loginPage.loginButton.click();

	}
	@When("I navigate to the Students tab")
	public void i_navigate_to_the_students_tab() {
	    wait(5);
	   mainPage.studentsMain.click();

	}

	@When("I select a student")
	public void i_select_a_student() {
		wait(5);
		driver.findElement(By.xpath("//option[normalize-space()='Smith Obama']")).click();
	}
	@When("I add a primary parent with details {string}, {string}, {string}, {string}")
	public void i_add_a_primary_parent_with_details(String string, String string2, String string3, String string4) {
		studentPage.parentalTab.click();
		driver.findElement(By.xpath("//input[@id=\"bAddNew\"]")).click();
		parentTab.ppfirstName.sendKeys("Steve");
		parentTab.pplastName.sendKeys("white");
		parentTab.ppPassword.sendKeys("Jiu87k");
		selectDropdown(parentTab.ppRelation, "Father");
		parentTab.ppAddress.sendKeys("98 ave");
		parentTab.ppCity.sendKeys("New York");
		selectDropdown(parentTab.ppState, "NY");
		parentTab.ppworkPhone.sendKeys("123-456-7890");
		parentTab.ppEmail.sendKeys("twhite@aol.com");
		parentTab.ppSaveButton.click();

	}
	@When("I add a secondary parent with details {string}, {string}, {string}, {string}")
	public void i_add_a_secondary_parent_with_details(String string, String string2, String string3, String string4) {
		driver.findElement(By.xpath("//input[@id=\"bAddNewSP\"]")).click();
		parentTab.spFirstName.sendKeys("Jane");
		parentTab.spLastName.sendKeys("white");
		parentTab.spPassword.sendKeys("Jiu87k");
		selectDropdown(parentTab.spRelation, "Mother");
		parentTab.spAddress.sendKeys("98 ave");
		parentTab.spCity.sendKeys("New York");
		selectDropdown(parentTab.spState, "NY");
		parentTab.spHomePhone.sendKeys("987-654-3210");
		parentTab.spEmail.sendKeys("swhite@aol.com");
		parentTab.spSavebutton.click();

	}
	@Then("I should see both parents saved with generated credentials")
	public void i_should_see_both_parents_saved_with_generated_credentials() {
		String actualPrimaryName = parentTab.ppfirstName.getAttribute("value");
		String expectedPrimary = "Steve";
		String actualSecondary = parentTab.spFirstName.getAttribute("value");
		String expectedSecondary = "Jane";
		Assert.assertEquals(actualPrimaryName, expectedPrimary );
		Assert.assertEquals(actualSecondary, expectedSecondary);
	}


	
}


