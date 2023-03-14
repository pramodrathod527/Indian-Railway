package pomClasses;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//textarea[@placeholder='Write a Post ']/../span")
	private WebElement inputTextBox;
	
	@FindBy(xpath="//textarea[@id='mytextarea']")
	private WebElement sendInputTextBox;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[text()='Post']")
	private WebElement postButton;
	
	@FindBy(xpath="//div[@id=\"leftCard\"]/following-sibling::div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div/li/div/div/div/div/span")
	private WebElement date;
	
	@FindBy(xpath="//span[text()='Comment']/..")
	private WebElement commentButton;
	
	@FindBy(xpath="//textarea[@placeholder='Write a comment..']")
	private WebElement commentInputBox;
	
	@FindBy(xpath="//button[text()='Post']")
	private WebElement commentPostButton;
	
	@FindBy(xpath="(//a[text()='Read More'])[1]")
	private WebElement readMoreButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendValidCredential() {
		username.sendKeys("manoj.jadhav@thehigherpitch.com");
		password.sendKeys("Sara@9090");
		
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void clickInputTextBox() {
		inputTextBox.click();
	}
	
	public void sendPost() {
		sendInputTextBox.sendKeys("Hi Everyone hope your doing well! Exciting news for everyone! I am thrilled to announce that I have joined THP company as a [ Software Test Engineer ] I am looking forward to being a part of this dynamic team and contributing to the company success . Thank you for your support and encouragement as I start this new chapter in my life....");
		
	}
	
	public void clickPostButton() {
		postButton.click();
	}
	
	public String verifyActualDate() {
		String actualText = date.getText();
		return actualText;
		
	}
	
	public String verifyExpectedDate() {
			String expectedText= ". 03 March";
			return expectedText;
		}
	
	public void clickCommentText() {
		commentButton.click();
	}
	
	public void sendComment() {
		commentInputBox.sendKeys("Very Nice");
		commentPostButton.click();
	}
	
	public void clickReadMoreButton() {
		readMoreButton.click();
	}
	
	
	
		
	
	
	
	
}
