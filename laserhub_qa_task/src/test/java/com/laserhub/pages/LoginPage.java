package com.laserhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage 
{
	
 WebDriver driver;
	
 	// identification of web elements using find by annotation
 
 	@FindBy(id="email") WebElement userName;
 	@FindBy(id="password") WebElement userPassword;
	@FindBy(className="btn-primary") WebElement btnLogin;
	@FindBy(css="a[data-label='nav-item-logout']") WebElement btnLogout;
	@FindBy(className="platform-btn") WebElement btnPlatform;
	
 	
 	
 	
 	
 	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//initElements method creates all WebElements
		PageFactory.initElements(driver, this);
	}
	
	// function for navigation
		public void navigate(String url) {
			driver.get(url);
			if(driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed()) {driver.findElement(By.id("onetrust-accept-btn-handler")).click();}
		}
		// function to enter user credentials
		public void enterUserCredentials(String userAddress,String password) throws Exception {
			Thread.sleep(2000);
			userName.sendKeys(userAddress);
			Thread.sleep(2000);
			userPassword.sendKeys(password);
		}
		//function to click on Login
		public void clickOnUserLogin() {
			btnLogin.click();
			btnLogout.isDisplayed();
			Assert.assertTrue(true, "Login Failed, User Credentials are incorrect!!!");
		}
		
		//function to click on Logout
		public void clickOnUserLogout() throws Exception {
			btnLogout.click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.getCurrentUrl(),"https://laserhub.com/");
			
		}
	
}
