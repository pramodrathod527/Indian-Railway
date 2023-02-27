package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyBookingPage {
	
	@FindBy(xpath="(//input[@role=\"searchbox\"])[1]")
	private WebElement journeyFrom;
	
	@FindBy(xpath="(//input[@role=\"searchbox\"])[2]")
	private WebElement journeyTo;
	
	@FindBy(xpath="//p-calendar[@formcontrolname='journeyDate']")
	private WebElement date;
	
	
	
	
	@FindBy(xpath="//p-dropdown[@formcontrolname='journeyClass']")
	private WebElement selectClasses;
	
	@FindBy(xpath="//p-dropdown[@formcontrolname='journeyQuota']")
	private WebElement journeyQuota;
	
	@FindBy(xpath="//input[@formcontrolname='concessionBooking']/..")
	private WebElement concessionBookingCheckBox ;
	
	@FindBy(xpath="//input[@formcontrolname='dateSpecific']/..")
	private WebElement flexibleDateCheckBox;
	
	@FindBy(xpath="//input[@formcontrolname='availableBerth']/..")
	private WebElement availableBerthCheckBox;
	
	@FindBy(xpath="//input[@formcontrolname='passBooking']/..")
	private WebElement passConcessionCheckBox;
	
	@FindBy(xpath="//button[text() = 'Search']")
	private WebElement searchButton;
	
	@FindBy(xpath="//a[text() = '  Try booking in Ask DISHA 2.0  ']")
	private WebElement askDishaBooking;
	
	@FindBy(xpath="//p-dropdown[@formcontrolname='journeyClass']/div/div[4]/div/ul/p-dropdownitem[3]")
	private WebElement clickClass;
	
	@FindBy(xpath="//p-dropdown[@formcontrolname='journeyQuota']/div/div[4]/div/ul/p-dropdownitem[1]\r\n"
			+ "	")
	private WebElement selectQuota;
	
	
	
	
	
	
	
	WebDriver driver;
	public VerifyBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void startJourney() {
		journeyFrom.sendKeys("Jalna");
		journeyTo.sendKeys("Aurangabad");
//		date.sendKeys("06/02/2023");
	}
	
	public void selectClass() {
		selectClasses.click();
		clickClass.click();
	}
	
	public void selectJourneyQuota() {
		journeyQuota.click();
		selectQuota.click();
	}
	
	public void selectConcession() {
		concessionBookingCheckBox.click();
	}

}
