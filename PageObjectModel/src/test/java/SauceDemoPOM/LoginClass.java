package SauceDemoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {

	WebDriver driver;
	
	public LoginClass(WebDriver d) {
		driver=d;
	}
	
	By userName=By.id("user-name");
	By password=By.id("password");
	By loginBtn=By.id("login-button");
	
	
	public void enterUserName(String uname) {
		driver.findElement(userName).sendKeys(uname);
	}
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void submitLoginBtm() {
		driver.findElement(loginBtn).click();
	}
}
