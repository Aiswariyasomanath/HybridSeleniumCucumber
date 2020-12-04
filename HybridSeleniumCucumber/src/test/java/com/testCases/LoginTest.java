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
		launchApplication("chrome","https://facebook.com");
	}
	
	@Test
	public void login() {
		LoginPage lpage=new LoginPage(driver);
		lpage.loginToApp_username("sravanthi");
		lpage.loginToApp_password("abcz1");
		lpage.loginToApp_loginbutton();
		
	}
	
	@AfterTest
	public void close() throws IOException {
		SeleniumUtilities selUtil= new SeleniumUtilities(driver);
		selUtil.to_take_screenshot("src/test/resources/ScreenShots/facebooklogin.png");
		
	}
}
