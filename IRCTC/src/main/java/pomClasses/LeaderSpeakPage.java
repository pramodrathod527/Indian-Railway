package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaderSpeakPage {
	
	@FindBy(xpath="//span[text()='Leader Speak']")
	private WebElement leaderSpeakButton;
	
	@FindBy(xpath="//label[text()='Announcement']")
	private WebElement announcementSection;
	
	@FindBy(xpath="//label[text()='Upcoming Events']")
	private WebElement upcomingEventsSection;
	
	@FindBy(xpath="//span[text()='Comment']")
	private WebElement commentButton;
	
	@FindBy(xpath="//textarea[@name='commentField']")
	private WebElement commentBox;
	
	@FindBy(xpath="//button[text()='Post']")
	private WebElement postButton;
	
	
	
	
	
	
	
	
	
	
	
	public LeaderSpeakPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLeaderSpeakButton() {
		leaderSpeakButton.click();
	}
	
	public String verifyAnnouncement() {
		String announcementText = announcementSection.getText();
		return announcementText;
	}
	
	public String verifyUpcomingEvents() {
		String upcomingEvents = upcomingEventsSection.getText();
		return upcomingEvents;
	}
	
	public void sendComment() throws InterruptedException {
		commentButton.click();
		Thread.sleep(2000);
		commentBox.sendKeys("Nice!");
		postButton.click();
		
	}
	

}
