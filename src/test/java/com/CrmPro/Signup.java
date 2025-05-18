package com.CrmPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import DataValues.Signupcrm;

public class Signup {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\eclipse-workspace\\com.CrmPro\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		Select free=new Select(driver.findElement(By.id("payment_plan_id")));
		free.selectByIndex(1);
		
		 WebElement firstname = driver.findElement(By.name("first_name"));
		    firstname.sendKeys(Signupcrm.readJSONFile("First_Name"));
		    
		    WebElement lastname = driver.findElement(By.name("surname"));
		    lastname.sendKeys(Signupcrm.readJSONFile("Last_Name"));
		    
		    WebElement email = driver.findElement(By.name("email"));
		    email.sendKeys(Signupcrm.readJSONFile("Email"));
		    
		    WebElement cnfrmemail = driver.findElement(By.name("email_confirm"));
		    cnfrmemail.sendKeys(Signupcrm.readJSONFile("Confirm_Email"));
		    
		    WebElement username = driver.findElement(By.name("username"));
		    username.sendKeys(Signupcrm.readJSONFile("Username"));
		    
		    WebElement pswrd = driver.findElement(By.name("password"));
		    pswrd.sendKeys(Signupcrm.readJSONFile("password"));
		    
		    WebElement cnfrmpsword = driver.findElement(By.name("passwordconfirm"));
		    cnfrmpsword.sendKeys(Signupcrm.readJSONFile("confirm_password"));
		    
		    driver.findElement(By.name("agreeTerms")).click();
		    
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    //Thread.sleep(4000);
		    WebElement cmpnyname = driver.findElement(By.name("company_name"));
		    cmpnyname.sendKeys(Signupcrm.readJSONFile("company_name"));
		    
		    WebElement phone = driver.findElement(By.name("phone"));
		    phone.sendKeys(Signupcrm.readJSONFile("phone_number"));
		    
		    WebElement cmpnyemail = driver.findElement(By.name("company_email"));
		    cmpnyemail.sendKeys(Signupcrm.readJSONFile("company_email"));
		    
		    WebElement address = driver.findElement(By.name("address"));
		    address.sendKeys(Signupcrm.readJSONFile("Address"));
		    
		    WebElement city = driver.findElement(By.name("city"));
		    city.sendKeys(Signupcrm.readJSONFile("city"));
		    
		    WebElement state = driver.findElement(By.name("state"));
		    state.sendKeys(Signupcrm.readJSONFile("city"));
		    
		    WebElement postcode = driver.findElement(By.name("postcode"));
		    postcode.sendKeys(Signupcrm.readJSONFile("postcode"));
		    
		    Select country=new Select(driver.findElement(By.name("country")));
		    country.selectByVisibleText("India");
		    
		    driver.findElement(By.name("copy_address")).click();
		    
		    driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
		    
		    driver.findElement(By.name("finish")).click();
		    
		    
			}
		}
	   
