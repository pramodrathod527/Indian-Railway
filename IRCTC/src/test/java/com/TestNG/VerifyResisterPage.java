package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.HomePageIrctc;
import pomClasses.LoginPage2;
import pomClasses.ResisterAddressPage;
import pomClasses.ResisterPage;
import pomClasses.ResisterPersonalDetailsPage;
import pomClasses.VerifyBookingPage;
import testClassesIRCTC.LoginPage;

public class VerifyResisterPage {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		System.out.println("afterMethod");
	}
	
	
	
	@BeforeMethod
	public void openRegisterForm() {
		driver.get("https://www.irctc.co.in/nget/train-search");
		HomePageIrctc homePage = new HomePageIrctc(driver); 
		homePage.ClickDishaBannerClose();
		
		
		
	}
	
	
	
	@Test (priority = 1)
	
	public void VerifyBasicDetails() throws InterruptedException {
		HomePageIrctc homePage = new HomePageIrctc(driver);
		homePage.clickRegisterButton(); 
		
		ResisterPage resisterPage = new ResisterPage(driver);
		
		resisterPage.sendDetailsToResister();
		resisterPage.selectPreferredLanguage();
		resisterPage.selectSecurityQuestions();
		resisterPage.securityAnswer();
//		resisterPage.clickCancelButton();
		resisterPage.clickContinueButton();
		
		ResisterPersonalDetailsPage resisterPersonalDetailsPage = new ResisterPersonalDetailsPage(driver);
		
		resisterPersonalDetailsPage.sendPersionalDetails();
		resisterPersonalDetailsPage.clickSelectOccupation();
		resisterPersonalDetailsPage.clickDateOfBirth();
		resisterPersonalDetailsPage.clickMaleButton();
		resisterPersonalDetailsPage.clickUnmarriedCheckBox();
		resisterPersonalDetailsPage.clickSelectNationality();
		resisterPersonalDetailsPage.clickContinueButton();
		
		
		ResisterAddressPage resisterAddressPage = new ResisterAddressPage(driver);
		
		resisterAddressPage.sendAddress();
		resisterAddressPage.clickSelectCity();
		resisterAddressPage.clickselectPostOffice();
		
		resisterAddressPage.clickCheckBoxes1();
//		resisterAddressPage.scrollDown();
		resisterAddressPage.clickCheckBoxes2();
		
		
		
	}
	
	@Test (priority = 2)
	
	public void verifyBooking() {
		VerifyBookingPage verifyBookingPage = new VerifyBookingPage(driver);
		verifyBookingPage.startJourney();
		verifyBookingPage.selectClass();
		verifyBookingPage.selectJourneyQuota();
		verifyBookingPage.selectConcession();
		
		
		
	}

	@AfterMethod
	public void NavigateToMainPage() {		
		System.out.println("afterMethod");
		driver.navigate().back();
		
	}
	
	
	@AfterClass
	public void CloseBrowser() {
//		driver.close();
	}
	
	
	
	
	
	

}
