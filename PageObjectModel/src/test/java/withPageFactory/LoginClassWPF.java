package withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClassWPF {

	WebDriver driver;
	public LoginClassWPF(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name") WebElement userName;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement loginBtn;
	
	public void enterUserName(String uname) {
		userName.sendKeys("unsme");
	}
	public void enterPassword(String pass) {
		password.sendKeys("pass");
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
}
