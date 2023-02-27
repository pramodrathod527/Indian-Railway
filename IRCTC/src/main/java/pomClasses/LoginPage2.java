package pomClasses;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	@FindBy(xpath="//input[@formcontrolname='userid']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement userPassword;
	
	@FindBy(xpath="//strong[text()='FORGOT ACCOUNT DETAILS?']")
	private WebElement forgetAccountDetails;
	
	@FindBy(xpath="//label[text()='Login & Booking With OTP']")
	private WebElement loginAndBookCheckBox;
	
	@FindBy(xpath="//button[text()='SIGN IN']")
	private WebElement signInButton;
	
	@FindBy(xpath="//label[text()='REGISTER']")
	private WebElement resisterButton;
	
	@FindBy(xpath="//label[text()='AGENT LOGIN']")
	private WebElement agentButton;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedButton;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelButton;
	
	
	
	
	
	
	
	private WebDriver driver;
	private ArrayList<String> address;
	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		address = new ArrayList<String>(driver.getWindowHandles());
		
	}
	
	public void SendLoginData() {
		userName.sendKeys("Pramod");
		userPassword.sendKeys("Pramod123");	
	}
	
	public void clickCheckBoxAndProceed() {
		loginAndBookCheckBox.click();
		driver.switchTo().window(address.get(0));
		proceedButton.click();
	}
	
	public void clickCheckBoxAndCancel() {
		loginAndBookCheckBox.click();
		driver.switchTo().window(address.get(0));
		cancelButton.click();	
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
	public void clickForgetAccountDetails() {
		forgetAccountDetails.click();
	}
	
	public void clickResisterButton() {
		resisterButton.click();
	}
	
	public void clickAgentButton() {
		agentButton.click();
		
	}
	

}
