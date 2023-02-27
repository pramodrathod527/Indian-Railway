package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResisterAddressPage {
	
	@FindBy(xpath="//input[@id='resAddress1']")
	private WebElement flatNumber;
	
	@FindBy(xpath="//input[@id='resAddress2']")
	private WebElement street;
	
	@FindBy(xpath="//input[@id='resAddress3']")
	private WebElement area;
	
	@FindBy(xpath="//input[@formcontrolname='resPinCode']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@formcontrolname='resState']")
	private WebElement state;
	
	@FindBy(xpath="//select[@formcontrolname='resCity']")
	private WebElement selectCity;
	
	@FindBy(xpath="//select[@formcontrolname='resPostOff']")
	private WebElement selectPostOffice;
	
	@FindBy(xpath="//input[@formcontrolname='resPhone']")
	private WebElement phone;
	
	@FindBy(xpath="//p-radiobutton[@formcontrolname='officeSameAsRes']/div/div[2]/span")
	private WebElement yesCheckBox;
	
	@FindBy(xpath="//p-radiobutton[@id='no']/div/div[2]/span")
	private WebElement noCheckBox;
	
	@FindBy(xpath="//input[@id='sbi']/..")
	private WebElement checkBox1;
	
	@FindBy(xpath="//input[@formcontrolname='termCondition']/..")
	private WebElement checkBox2;
	
	@FindBy(xpath="//button[text()='Back']")
	private WebElement backButton;
	
	@FindBy(xpath="//button[text()='REGISTER']")
	private WebElement registerButton;
	
	@FindBy(xpath="//select[@formcontrolname='resCity']/option[2]")
	private WebElement city;
	
	@FindBy(xpath="//select[@formcontrolname='resPostOff']/option[2]")
	private WebElement post;
	
	
	
	
	
	
	
	
	private WebDriver driver;
	
	public ResisterAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void sendAddress() {
		flatNumber.sendKeys("40");
		street.sendKeys("MarotiRoad");
		area.sendKeys("Govindpur");
		pincode.sendKeys("431204");
		state.sendKeys("Maharashtra");
		phone.sendKeys("9168729713");
		yesCheckBox.click();
		
	}
	
	public void clickSelectCity() {
		selectCity.click();
		city.click();
		
	}
	public void clickselectPostOffice() {
		selectPostOffice.click();
		post.click();
	}
	
	public void clickCheckBoxes1() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(checkBox1));
		if(!checkBox1.isEnabled()) {
			checkBox1.click();
		}
		
	}
	
	public void clickCheckBoxes2() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(checkBox2));
		if(!checkBox2.isEnabled()) {
			checkBox2.click();
		}
	}
	
	
	
	public void scrollDown() {
		JavascriptExecutor jaavascriptExecutor = (JavascriptExecutor)driver;
		jaavascriptExecutor.executeScript("arguments[0].scrollIntoView();",checkBox2 );
	}
	
	
	

}
