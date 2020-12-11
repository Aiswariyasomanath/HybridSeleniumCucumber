package com.testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClasses.Library;
import com.pages.LoginPage;
import com.reusableFunctions.SeleniumUtilities;

public class LoginTest extends Library {
	@BeforeTest
	public void stratUp() {
		browserSetUp();
	
		logger.info("*******Browser has launched*********");
	}
	
	@Test
	public void login() {
		LoginPage lpage=new LoginPage(driver);
		lpage.loginToApp_username(properties.getProperty("username"));
		lpage.loginToApp_password(properties.getProperty("password"));
		lpage.loginToApp_loginbutton();
		logger.info("*******login successful*********");
		
	}
	
	@AfterTest
	public void close() throws IOException {
		SeleniumUtilities selUtil= new SeleniumUtilities(driver);
		selUtil.to_take_screenshot("src/test/resources/ScreenShots/facebooklogin.png");
		logger.info("*******took screenshot*********");
		
	}
}
