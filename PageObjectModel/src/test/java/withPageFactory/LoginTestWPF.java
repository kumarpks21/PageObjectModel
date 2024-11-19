package withPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTestWPF {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		LoginClassWPF lg=new LoginClassWPF(driver1);
		driver1.get("https://www.saucedemo.com/v1/");
		lg.enterUserName("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickLoginBtn();
		

	}

}
