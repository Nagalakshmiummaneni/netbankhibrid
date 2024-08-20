package com.hybrid.bank.baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	public static ExtentSparkReporter report;
	  public static ExtentReports extent;
	
	public ExtentReports setExtent() throws IOException {
	String path=System.getProperty("user.dir") + "/report/hybrid.html";
	ExtentSparkReporter report = new ExtentSparkReporter(path);
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(report);
	return extent;
	}
	
	 public String capture(WebDriver driver,String result) {
			
		 TakesScreenshot ts=(TakesScreenshot) driver; 
			File  src=ts.getScreenshotAs(OutputType.FILE);
			
			String path=System.getProperty("user.dir")+"/Screenshot/p"+result+".png";
			
			File destination=new File(path);
			src.renameTo(destination);
			return path;
		}
	
}
