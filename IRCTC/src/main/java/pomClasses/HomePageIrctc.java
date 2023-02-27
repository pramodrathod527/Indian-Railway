package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageIrctc {
	
	@FindBy(xpath="//a[text()=' LOGIN ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//img[@id='disha-banner-close']")
	private WebElement dishaBannerClose;
	
	@FindBy(xpath="//a[text()=' REGISTER ']")
	private WebElement registerButton;
	
	
	private WebDriver driver;
	public HomePageIrctc(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void ClickDishaBannerClose() {
		dishaBannerClose.click();
	}
	
	public void clickRegisterButton() {
		
		registerButton.click();
	}

}
