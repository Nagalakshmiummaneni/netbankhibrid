package com.hybrid.bank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcustomerpage {
WebDriver driver;

public addcustomerpage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
    @FindBy(xpath="//input[@name='name']")
	WebElement customername;
	@FindBy(xpath="//input[@type=\"radio\"][1]")
    WebElement gendermale;
	@FindBy(xpath="//input[@type=\"radio\"][2]")
	WebElement genderfemale;
	@FindBy(xpath = "//input[@type=\"date\"]")
	WebElement dateofb;
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	@FindBy(xpath="//input[@name=\"city\"]")
	WebElement city;
	@FindBy(xpath="//input[@name=\"state\"]")
	WebElement state;
	@FindBy(xpath="//input[@name=\"pinno\"]")
	WebElement pin;
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement phonenumber;

	
	@FindBy(xpath="//input[@name=\"emailid\"]")
	WebElement emailid;
	@FindBy(xpath = "//input[@name=\"sub\"]")
	WebElement submit;
	@FindBy(xpath="//input[@name=\"res\"]")
	WebElement reset;
	public void sendCustomername(String name) {
		customername.sendKeys(name);
	}
	public void selectGendermale() {
		gendermale.click();
	}
	public void selectGenderfemale() {
		genderfemale.click();
	}
	public void setDateofb(String dob) {
		dateofb.sendKeys(dob);
	}
	public void sendAddress(String address1) {
		address.sendKeys(address1);
	}
	public void sendCity(String cityname) {
		 city.sendKeys(cityname);;
	}
	public void sendState(String statename) {
		state.sendKeys(statename);
	}
	public void sendPin(String pinno) {
	          pin.sendKeys(pinno);
	}
	public void sendPhonenumber(String number) {
		phonenumber.sendKeys(number);
	}
	public void sendEmailid(String mailid) {
		 emailid.sendKeys(mailid);
	}
	public void clickSubmit() {
		submit.click();
	}
	public void clickReset() {
		reset.click();
	}
	
	
}
