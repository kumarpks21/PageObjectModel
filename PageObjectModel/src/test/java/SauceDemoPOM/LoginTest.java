package SauceDemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	
	LoginClass lg=new LoginClass(driver);
	lg.enterUserName("standard_user");
	lg.enterPassword("secret_sauce");
	lg.submitLoginBtm();
	
	
	}

}
