package com.qa.opencart.Driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	/**
	 * This mehtod is used to initialize the webdriver
	 * 
	 * @param browserName
	 * @return this will return the driver
	 */
	public WebDriver init_driver(String browserName) {
		System.out.println("this is browser name " + browserName);
		
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
		
			}
		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("safari")) {
			
			
			
			System.out.println("please pass the right browser: " + browserName);
		}

		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		return driver;
	}

	
	
	
	
	
	
}
