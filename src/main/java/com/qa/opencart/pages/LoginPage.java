package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By forgotpassword = By.linkText("Forgotten Password");
	private By userName = By.id("input-email");
	private By password = By.id("input-password");
	private By logInbutton =By.xpath("//input[@class=\"btn btn-primary\"]");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public String getLoginPageTitle() {
		
		
	return	driver.getTitle();
		
	}
	
	
	public String getLoginUrl() {
		
		
		return driver.getCurrentUrl();
	}
	
	
	public boolean isForgotPasswordLinkExits() {
		
	return 	driver.findElement(forgotpassword).isDisplayed();
		
		
	}
	
	
	public void doLogin(String un , String pwd) {
		
		driver.findElement(userName).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		
		driver.findElement(logInbutton).click();
		
	}
	
}
