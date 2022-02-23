package com.qa.opencart.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.Driverfactory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	
	DriverFactory df;
	
	WebDriver driver;
	LoginPage loginpage;
	
	
	@BeforeTest
	public void setup() {
		
		df=  new DriverFactory();
	driver = df.init_driver("chrome");
	loginpage= new LoginPage(driver);
		
	}
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}
	

}
