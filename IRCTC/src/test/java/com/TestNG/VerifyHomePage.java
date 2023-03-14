package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.HomePage;

public class VerifyHomePage {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chrome_driver_version110\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://myconnectv1.tinggit.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod 
	
	public void launchMyConnectTing() {
		HomePage homePage = new HomePage(driver);
		homePage.sendValidCredential();
		homePage.clickLoginButton();
	}
	
	
	@Test (priority = 1)
	
	public void verifyPostWithCurrentDate() {
		
		HomePage homePage = new HomePage(driver);
		homePage.clickInputTextBox();
		homePage.sendPost();
		homePage.clickPostButton();
		Assert.assertEquals(homePage.verifyActualDate(), homePage.verifyExpectedDate());
	}
	
	
	
	
	
	@AfterMethod
	public void goToMainPage() {
		driver.navigate().back();
	}
	

}
