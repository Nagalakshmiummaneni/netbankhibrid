package com.hybrid.bank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class loginpage {

	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "uid")
	WebElement userid;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "btnLogin")
	WebElement login;
	@FindBy(name = "btnReset")
	WebElement reset;

	public void sendUserid(String  user) {
		userid.sendKeys(user);
	}
	public void sendPassword(String  pass) {
		password.sendKeys(pass);
	}
	public void clickLogin() {
		login.click();
	}
	public void clickReset() {
	     reset.click();
	}
	
	public void login(String user,String pass) {
		sendUserid(user);
		sendPassword(pass);
		clickLogin();
	}
}
