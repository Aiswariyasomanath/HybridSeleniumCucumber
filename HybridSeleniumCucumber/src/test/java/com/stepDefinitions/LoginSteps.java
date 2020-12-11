package com.stepDefinitions;

import com.baseClasses.Library;
import com.pages.LoginPage;
import com.reusableFunctions.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Library {
	LoginPage lpage;
	
	
	@Given("To open the application and navigate to url")
	public void to_open_the_application_and_navigate_to_url() {
		browserSetUp();
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		lpage = new LoginPage(driver);
		lpage.loginToApp_username(properties.getProperty("username"));
		lpage.loginToApp_password(properties.getProperty("password"));
	}

	@Then("click the submit button")
	public void click_the_submit_button() {
	    lpage.loginToApp_loginbutton();
	}

	@Then("take screenshot")
	public void take_screenshot() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.to_take_screenshot("src/test/resources/ScreenShots/facebooklogin.png");
	}

	@Then("close the browser")
	public void close_the_browser() {
		tearDown();
	}
	
}