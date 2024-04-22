package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class LoginPageLocator extends BaseClass {

	public static WebElement getUsername() {
		return driver.findElement(By.id("uid"));
		
	}
	public static WebElement getPassword() {
		return driver.findElement(By.id("pwd"));
		
	}
}
