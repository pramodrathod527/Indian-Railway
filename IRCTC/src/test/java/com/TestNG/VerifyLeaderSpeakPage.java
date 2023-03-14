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
import pomClasses.LeaderSpeakPage;

public class VerifyLeaderSpeakPage {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chrome_driver_version110\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://myconnectv1.tinggit.com/");
		HomePage homePage = new HomePage(driver);
		homePage.sendValidCredential();
		homePage.clickLoginButton();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeMethod 
	
	public void launchMyConnectTing() {

		LeaderSpeakPage leaderSpeakPage = new LeaderSpeakPage(driver);
		leaderSpeakPage.clickLeaderSpeakButton();
	}
	
	
	
	
	@Test (priority = 1)
	
	public void verifyAnnouncementSection() {
		LeaderSpeakPage leaderSpeakPage = new LeaderSpeakPage(driver);
		String actualAnnouncementText = leaderSpeakPage.verifyAnnouncement();
		String expectedAnnouncementText = "Announcement";
		Assert.assertEquals(actualAnnouncementText, expectedAnnouncementText);
		System.out.println("Announcement Section is there!");
		
		String actualUpcomingEventsText = leaderSpeakPage.verifyUpcomingEvents();
		String expectedUpcomingEventsText = "Upcoming Events";
		Assert.assertEquals(actualUpcomingEventsText, expectedUpcomingEventsText);
		System.out.println("Upcoming Events Section is there!");
	}
	
	@Test (priority = 2)
	
	public void verifyLeaderSpeakButton() throws InterruptedException {
		LeaderSpeakPage leaderSpeakPage = new LeaderSpeakPage(driver);
		leaderSpeakPage.sendComment();
	}
	
	
	
	
	
	@AfterMethod
	public void goToMainPage() {
		driver.navigate().back();
	}
	

}
