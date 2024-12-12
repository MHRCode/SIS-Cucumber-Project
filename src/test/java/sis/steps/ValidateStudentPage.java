package sis.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class ValidateStudentPage extends CommonMethods{
	

@Given("I am on the login page")
public void i_am_on_the_login_page() {

	 driver.get("https://sis.neotechacademy.com/");
    
}

@When("I login as Admin with username {string}, password {string}, and academic year {string}")
public void i_login_as_admin_with_username_password_and_academic_year(String string, String string2, String string3) {
   
	loginPage.userNameField.sendKeys("Admin");
	loginPage.passwordField.sendKeys("Neotech$123");
	loginPage.loginButton.click();
}

@Then("I should be on the homepage")
public void i_should_be_on_the_homepage() {
	String actualTitle = driver.getTitle();
	String expectedTitle = "Student Information System";
    Assert.assertEquals(expectedTitle, actualTitle);
 
}

@When("I navigate to the {string} tab")
public void i_navigate_to_the_tab(String studentTab) {
	mainPage.studentsMain.click();
   
}
@Then("I should see the following sub-tabs:")
public void i_should_see_the_following_sub_tabs(DataTable subTabs) {
	
    List<String> expectedSubTabs = subTabs.asList(String.class);
   
    List<String> actualSubTabs = new ArrayList<>();
    for (WebElement tab : studentPage.subTabs) {
        actualSubTabs.add(tab.getText().trim());
    }

    
    System.out.println("Expected Sub-Tabs: " + expectedSubTabs);
    System.out.println("Actual Sub-Tabs: " + actualSubTabs);

    Assert.assertEquals("Sub-tabs do not match!", expectedSubTabs, actualSubTabs);

}
	}
  






