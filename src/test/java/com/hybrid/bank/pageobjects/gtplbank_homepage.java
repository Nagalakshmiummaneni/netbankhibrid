package com.hybrid.bank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gtplbank_homepage {

	WebDriver driver;

	public gtplbank_homepage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='New Customer']")
	WebElement newcustomer;
	@FindBy(xpath = "//*[text()='Edit Customer']")
	WebElement editcustomer;
	@FindBy(xpath = "//*[text()='Delete Customer']")
	WebElement deletecustomer;
	@FindBy(xpath = "//*[text()='New Account']")
	WebElement newaccount;
	@FindBy(xpath = "//*[text()='Edit Account']")
	WebElement editaccount;
	@FindBy(xpath = "//*[text()='Delete Account']")
	WebElement deleteaccount;
	@FindBy(xpath = "//*[text()='Mini Statement']")
	WebElement ministatement;
	@FindBy(xpath = "//*[text()='Customised Statement']")
	WebElement customisedstatement;
	@FindBy(xpath = "//*[text()='Log out']")
	WebElement logout;

	public void opennewcustomer() {
		newcustomer.click();
	}

	public void openeditcustomer() {
		editcustomer.click();
	}

	
	public void openDeletecustomer() {
		 deletecustomer.click();;
	}

	public void openNewaccount() {
		newaccount.click();;
	}

	public void openEditaccount() {
		 editaccount.click();;
	}

	public void openDeleteaccount() {
		 deleteaccount.click();;
	}

	public void openMinistatement() {
		 ministatement.click();;
	}

	public void openCustomisedstatement() {
		customisedstatement.click();
	}

	public void clickLogout() {
		logout.click();
	}
}
