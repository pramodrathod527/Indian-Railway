package pomClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResisterPage {
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='usrPwd']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='cnfUsrPwd']")
	private WebElement conformPassword;
	
	@FindBy(xpath="//span[text()='Preferred Language']")
	private WebElement preferredLanguage;
	
	@FindBy(xpath="//span[text()='Security Question']")
	private WebElement securityQuestion;
	
	@FindBy(xpath="//input[@placeholder='Security Answer']")
	private WebElement securityAnswer;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancleButton;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement continueButton;
	
	@FindBy(xpath="//span[text()='English']")
	private WebElement languageEng;
	
	@FindBy(xpath="//span[text()='हिंदी']")
	private WebElement languageHindi;
	
	@FindBy(xpath="//span[text()='What is your pet name?']")
	private WebElement petname;
	
	
	
	
	
	
	
	
	
	
	
	
	
	private WebDriver driver;
	public ResisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		 
	}
	
	public void sendDetailsToResister() {
		userName.sendKeys("PramodRarhod");
		password.sendKeys("Pramod123");
		conformPassword.sendKeys("Pramod123");
	}
	
	public void selectPreferredLanguage() {
		preferredLanguage.click();
		languageEng.click();
		
	}
	
	public void selectSecurityQuestions() {
		securityQuestion.click();
		petname.click();
	}
	
	public void securityAnswer() {
		securityAnswer.sendKeys("Moti");
	}
	
	public void clickCancelButton() {
		cancleButton.click();
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	
	

}
