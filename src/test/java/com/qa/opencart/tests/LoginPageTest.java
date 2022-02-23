package com.qa.opencart.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.qa.openkart.utils.constant;

public class LoginPageTest extends BaseTest{

	
	@Test(priority=1)
	public void LoginPageTitle() {
		
		String actualTitle =loginpage.getLoginPageTitle();
		
		System.out.println("my actual title "+ actualTitle);
		
Assert.assertTrue(actualTitle.contains(constant.LOGIN_PAGE_TITLE));		
		
	}
	
	@Test(priority=2)
	public void loginurl() {
		
		String actUrl=loginpage.getLoginUrl();
		
		Assert.assertTrue(actUrl.contains(constant.LOGIN_PAGE_URL));
		
		
	}
	@Test(priority=3)
	public void forgotPasswordLink() {
		 boolean forgotpwd = loginpage.isForgotPasswordLinkExits();
		Assert.assertTrue(forgotpwd);
	}
	@Test(priority=4)
	public void loginInapplication() {
		
		
	loginpage.doLogin("pawankumar@gmail.com", "123pawan");	
	
	
	}
	
	
	
	
}
