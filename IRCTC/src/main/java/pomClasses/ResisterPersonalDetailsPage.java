package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResisterPersonalDetailsPage {


	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='middleName']")
	private WebElement middleName;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//span[text()='Select Occupation']")
	private WebElement selectOccupation;
	
	@FindBy(xpath="//input[@placeholder='Date Of Birth']")
	private WebElement dateOfBirth;
	
	@FindBy(xpath="//label[text()='Married']")
	private WebElement marriedCheckBox;
	
	@FindBy(xpath="//label[text()='Unmarried']")
	private WebElement unMarriedCheckBox;
	
	@FindBy(xpath="//Select[@formcontrolname=\"resCountry\"]")
	private WebElement selectCountry;
	
	@FindBy(xpath="//span[text()='Male']")
	private WebElement genderMale;
	
	@FindBy(xpath="//span[text()='Female']")
	private WebElement genderFemale;
	
	@FindBy(xpath="//span[text()='Transgender']")
	private WebElement transGender;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//Select[@formcontrolname='nationality']")
	private WebElement selectNationality;
	
	@FindBy(xpath="//button[text()='Back']")
	private WebElement backButton;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement continueButton;
	
	@FindBy(xpath="//span[text()='GOVERNMENT']")
	private WebElement occupation;
	
	@FindBy(xpath="//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div/div/select[1]/option[1]")
	private WebElement birthMonth;
	
	@FindBy(xpath="//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]/option[9]")
	private WebElement birthYear;
	
	@FindBy(xpath="//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[1]")
	private WebElement birthDay;
	
	@FindBy(xpath="//select[@formcontrolname=\"resCountry\"]/option[4]")
	private WebElement country;
	
	@FindBy(xpath="//Select[@formcontrolname='nationality']/option[5]")
	private WebElement nationality;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private WebDriver driver;
	
	public ResisterPersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void sendPersionalDetails() {
		firstName.sendKeys("Pramod");
		middleName.sendKeys("Arjun");
		lastName.sendKeys("Rathod");
		email.sendKeys("pramodrathod528@gmail.com");
		mobileNumber.sendKeys("9168729713");
		
		
	}
	
	public void clickSelectOccupation() {
		selectOccupation.click();
		occupation.click();
	}
	
	public void sendDateOfBirth() {
		dateOfBirth.sendKeys("01-07-1998");
		
	}
	
	public void clickDateOfBirth() {
		dateOfBirth.click();
		birthYear.click();
		birthMonth.click();
		birthDay.click();
	}
	
	public void clickMarriedCheckBox() {
		marriedCheckBox.click();
	}
	
	public void clickUnmarriedCheckBox() {
		unMarriedCheckBox.click();
	}
	
	public void selectCountry() {
		selectCountry.click();
		country.click();
	}
	
	public void clickMaleButton() {
		genderMale.click();
	}
	
	public void clickFemaleButton() {
		genderFemale.click();
	}
	
	public void clickTransGenderButton() {
		transGender.click();
	}
	
	public void clickSelectNationality() {
		selectNationality.click();
		nationality.click();
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	public void clickBackButton() {
		backButton.click();
	}
	
	
	
	
	
	
	
	
}
