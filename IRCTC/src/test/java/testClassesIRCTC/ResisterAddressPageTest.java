package testClassesIRCTC;

import java.awt.CheckboxGroup;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomClasses.HomePageIrctc;
import pomClasses.ResisterAddressPage;
import pomClasses.ResisterPage;
import pomClasses.ResisterPersonalDetailsPage;

public class ResisterAddressPageTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		HomePageIrctc homePageIrctc = new HomePageIrctc(driver);
		
		homePageIrctc.clickRegisterButton();
		
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
//		resisterPersonalDetailsPage.sendDateOfBirth();
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
		resisterAddressPage.scrollDown();
		resisterAddressPage.clickCheckBoxes2();
		

		
		

	}

}
