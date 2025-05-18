package com.stepdefinition;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	import com.runner.Runner;

	import DataValues.Signupcrm;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Definition {
		public static WebDriver driver = Runner.driver;
		
		@Given("^user Launch The Crmpro Application$")
		public void user_Launch_The_Crmpro_Application() throws Throwable {
			driver.get("https://classic.crmpro.com/");
		}
		
		@When("^user Enter The signup credentidals$")
		public void user_Enter_The_signup_credentidals() throws Throwable {
			
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
		    Thread.sleep(4000);
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

		@When("^user Enter the Login credentials$")
		public void user_Enter_the_Login_credentials() throws Throwable {
			WebElement usrname = driver.findElement(By.name("username"));
		    usrname.sendKeys(Signupcrm.readJSONFile("Username"));
		    
		    WebElement paswrd = driver.findElement(By.name("password"));
		    paswrd.sendKeys(Signupcrm.readJSONFile("password"));
		    
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		@Then("^user Navigated to Home Page$")
		public void user_Navigated_to_Home_Page() throws Throwable {
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
		}

	}
