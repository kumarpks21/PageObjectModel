package org.testing.TestScript;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOne {

	WebDriver driver;
	Properties pr;
	
	public LoginPageOne(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void loginPage(String userId, String pass) {
	driver.get(pr.getProperty("url"));
	driver.manage().window().maximize();
	driver.findElement(By.xpath(pr.getProperty("userName"))).sendKeys((userId));
	driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys( (pass));
	driver.findElement(By.xpath(pr.getProperty("loginBtn"))).click();
	}
	
}
