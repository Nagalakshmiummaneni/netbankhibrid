package com.hybrid.bank.baseclass;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reporting   implements ITestListener  {
	WebDriver driver;
	 ExtentManager extents=new ExtentManager();
		ExtentReports ex ;
    ExtentTest logger;
	
	public void onStart(ITestContext context) {
		System.out.println("test started");
		
	}
	public void onTestStart(ITestResult result) {
			try {
			ex = extents.setExtent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	    logger = ex.createTest(result.getName());
	  }

	public void onTestSuccess(ITestResult result) {
		
		logger = ex.createTest("login");
		logger.log(Status.PASS, "test is passed");
		ITestContext context=result.getTestContext();
		driver=(WebDriver) context.getAttribute("driver");
		String path= extents.capture(driver,"logintest");
		logger.pass("test passed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		ex.flush();
	}
	 public void onTestFailure(ITestResult result) {
		   
		 
		 logger = ex.createTest("login");
			logger.log(Status.FAIL, "test is failed");
			ITestContext context=result.getTestContext();
			driver=(WebDriver) context.getAttribute("driver");
			String path= extents.capture(driver,"logintest");
			logger.fail("test failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			ex.flush();
		 
		  }
	
	

}
