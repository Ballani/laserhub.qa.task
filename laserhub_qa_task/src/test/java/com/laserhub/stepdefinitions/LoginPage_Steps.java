package com.laserhub.stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.laserhub.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginPage_Steps {
	
	WebDriver driver; 
	LoginPage LoginPageObj;

	//Creation of driver and navigating to URL
	@Given("I open {string} on browser")
	public void i_open_url_on_browser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPageObj= new LoginPage(driver);
		LoginPageObj.navigate(url);
	}
	
	//Enters User name and Password
	@Then("I enter username {string} and password {string}")
	public void i_enter_username(String userName, String password){
		try {
		LoginPageObj= new LoginPage(driver);
		LoginPageObj.enterUserCredentials(userName,password);
		}catch(Exception e) {e.printStackTrace();}
		
		
	}
	
	//Clicks on login button and verify login is successful
	@When("I click on login and verify login is successful")
	public void i_click_on_login() {
		LoginPageObj= new LoginPage(driver);
		LoginPageObj.clickOnUserLogin();
	}
	
	//Logout
	@Then("I click on logout")
	public void logout() {
		try {
		LoginPageObj= new LoginPage(driver);
		LoginPageObj.clickOnUserLogout();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	//Driver tear down
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}








