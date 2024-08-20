package com.hybrid.bank.test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hybrid.bank.baseclass.base;
import com.hybrid.bank.baseclass.reporting;
import com.hybrid.bank.pageobjects.addcustomerpage;
import com.hybrid.bank.pageobjects.gtplbank_homepage;
import com.hybrid.bank.pageobjects.loginpage;
@Listeners(reporting.class)
public class addcustomertest extends base {

	@Test
	public void test1() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage log=new loginpage(driver);
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		gtplbank_homepage home=new gtplbank_homepage(driver);
		home.opennewcustomer();
		Thread.sleep(2000);
		addcustomerpage addcust=new addcustomerpage(driver);
		addcust.sendCustomername("lakshmi");
		addcust.selectGendermale();
		addcust.setDateofb("7252024");
		addcust.sendAddress("bangalore");
		addcust.sendCity("bangalore");
		addcust.sendState("karnataka");
		addcust.sendPin("560054");
		addcust.sendPhonenumber("1234567890");
		addcust.sendEmailid("naga@gmail.com");
		addcust.clickSubmit();
	}
}
