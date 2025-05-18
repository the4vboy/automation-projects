package com.CrmPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import DataValues.Signupcrm;

public class Login {
	public static void main(String[] args) throws Exception {
	    WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\eclipse-workspace\\com.CrmPro\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		
		WebElement usrname = driver.findElement(By.name("username"));
	    usrname.sendKeys(Signupcrm.readJSONFile("Username"));
	    
	    WebElement paswrd = driver.findElement(By.name("password"));
	    paswrd.sendKeys(Signupcrm.readJSONFile("password"));
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    WebElement frmElement = driver.findElement(By.name("mainpanel"));
	    driver.switchTo().frame(frmElement);
	    
	    WebElement sales = driver.findElement(By.xpath("//a[text()='Sales Targets']"));
	    sales.click();
	 
	    driver.findElement(By.xpath("//input[@value='New Target']")).click();
	    
	    WebElement descrpton = driver.findElement(By.name("target_text"));
	    descrpton.sendKeys(Signupcrm.readJSONFile("Description"));
	    
	    WebElement trgt = driver.findElement(By.name("target"));
	    trgt.sendKeys(Signupcrm.readJSONFile("Target"));
	    
	    WebElement time = driver.findElement(By.name("target_days"));
	    time.sendKeys(Signupcrm.readJSONFile("Timeframe"));
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//input[@value='New Target']")).click();
	    
	    WebElement descrpton1 = driver.findElement(By.name("target_text"));
	    descrpton1.sendKeys(Signupcrm.readJSONFile("Description1"));
	    
	    WebElement trgt1 = driver.findElement(By.name("target"));
	    trgt1.sendKeys(Signupcrm.readJSONFile("Target1"));
	    
	    WebElement time1 = driver.findElement(By.name("target_days"));
	    time1.sendKeys(Signupcrm.readJSONFile("Timeframe1"));
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//input[@value='New Target']")).click();
	    
	    WebElement descrpton2 = driver.findElement(By.name("target_text"));
	    descrpton2.sendKeys(Signupcrm.readJSONFile("Description2"));
	    
	    WebElement trgt2 = driver.findElement(By.name("target"));
	    trgt2.sendKeys(Signupcrm.readJSONFile("Target2"));
	    
	    WebElement time2 = driver.findElement(By.name("target_days"));
	    time2.sendKeys(Signupcrm.readJSONFile("Timeframe2"));
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    boolean enabled = driver.findElement(By.xpath("//td[text()='Targets']")).isEnabled();
	    if(enabled=true){
	    	System.out.println("Targets added successfully");
	    }else {
	    	System.out.println("Targets not added successfully");
	    }
	    
	    WebElement edit = driver.findElement(By.xpath("(//i[@class='fa fa-edit'])[1]"));
	    edit.click();
	    WebElement time3 = driver.findElement(By.name("target_days"));
	    time3.sendKeys(Signupcrm.readJSONFile("Timeframe3"));
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    WebElement delete = driver.findElement(By.xpath("(//i[@title='Delete'])[2]"));
	    delete.click();
	    driver.switchTo().alert().accept();
	    
	    boolean enable = driver.findElement(By.xpath("//td[text()='Targets']")).isEnabled();
	    if(enable=true){
	    	System.out.println("Deleted successfully");
	    }else {
	    	System.out.println("Not Deleted successfully");
	    }
	    driver.close();
		}
	}


