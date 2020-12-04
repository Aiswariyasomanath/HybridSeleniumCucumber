package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRmloginpage {
	WebDriver driver;
	By username=By.id("txtUsername");
	By password =By.id("txtPassword");
	By loginbutton=By.id("btnLogin");
	public OrangeHRmloginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void loginToApp_username(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void loginToApp_loginbutton() {
		driver.findElement(loginbutton).click();
	}
}
