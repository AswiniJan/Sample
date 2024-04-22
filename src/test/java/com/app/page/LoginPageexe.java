package com.app.page;

import com.app.base.BaseClass;
import com.app.pageobject.LoginPageLocator;


public class LoginPageexe extends LoginPageLocator{
	public static void username(String user) {
		BaseClass.inputdata(LoginPageLocator.getUsername(), user);
	}
	public static void password(String password) {
		BaseClass.inputdata(LoginPageLocator.getPassword(), password);
	}
}
