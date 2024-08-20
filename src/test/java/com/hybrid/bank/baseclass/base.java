package com.hybrid.bank.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;

public class base {

public static	WebDriver driver;
public static Properties prop;
public static repositry1 rep;
	@BeforeClass
	public void init_driver(ITestContext context) throws IOException {
		 rep=new repositry1();
		prop=rep.init_prop();
	    String  browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
		driver=new  ChromeDriver();
		}		
		else if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		context.setAttribute("driver", driver);
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
}
