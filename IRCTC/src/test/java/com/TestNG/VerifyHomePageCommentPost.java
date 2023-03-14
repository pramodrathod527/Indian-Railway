package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.HomePage;

public class VerifyHomePageCommentPost {
	

	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chrome_driver_version110\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod 
	
	public void launchMyConnectTing() {
		driver.get("https://myconnectv1.tinggit.com/");
		HomePage homePage = new HomePage(driver);
		homePage.sendValidCredential();
		homePage.clickLoginButton();
	}
	
	
	
	
	@Test  
	
	public void VerifyCommentBox() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickCommentText();
		Thread.sleep(2000);
		homePage.sendComment();
	}
	
	@Test  
	
	public void VerifyReadEntireComment() {
		HomePage homePage = new HomePage(driver);
		homePage.clickReadMoreButton();
		
	}
	
	
	
	
	@AfterMethod
	public void goToMainPage() {
		driver.navigate().refresh();
	}
	

}
