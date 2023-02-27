package testClassesIRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomClasses.HomePageIrctc;
import pomClasses.LoginPage2;

public class LoginPage {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		HomePageIrctc homePageIrctc = new HomePageIrctc(driver);
		
		Thread.sleep(3000);
		
		homePageIrctc.clickLoginButton();
		homePageIrctc.ClickDishaBannerClose();
		
		LoginPage2 loginPage = new LoginPage2(driver);
		
		loginPage.SendLoginData();
		loginPage.clickCheckBoxAndProceed();
//		loginPage.clickSignInButton();
//		loginPage.clickAgentButton();
		loginPage.clickResisterButton();
		
		
		

	}

}
