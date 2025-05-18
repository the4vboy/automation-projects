package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features= "src//test//java//com//feature",glue="com.stepdefinition",monochrome = true, dryRun = false, strict = true,
tags = "@smokeTest")
public class Runner {
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\eclipse-workspace\\com.CrmPro\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void close() {
		driver.close();
	}
}

