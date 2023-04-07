package pages;
//this is Card Payment project of Maven on GitHub
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginbutton;
	
	public LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginApplication() {
		
		username.sendKeys("locked_out_user");
		password.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginbutton() {
		
		loginbutton.click();
	}

}
