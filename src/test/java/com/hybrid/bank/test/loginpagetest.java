package com.hybrid.bank.test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hybrid.bank.baseclass.base;
import com.hybrid.bank.baseclass.reporting;
import com.hybrid.bank.pageobjects.loginpage;
@Listeners(reporting.class)
public class loginpagetest extends base{

	
    @Test	
	public void test() throws IOException {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	loginpage log=new loginpage(driver);
	log.login(prop.getProperty("username"), prop.getProperty("password"));
	String exptitle="GTPL Bank Manager HomePage";
	String acttitle=driver.getTitle();
	
     Assert.assertEquals(acttitle, exptitle,"title not matched");
       	
	}
}
