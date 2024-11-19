package org.testing.TestScript;

import org.openqa.selenium.By;
import org.testing.Base.BaseClass;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {
	
	@Test
	public void loginPage() {
	driver.get(pr.getProperty("url"));
	driver.manage().window().maximize();
	driver.findElement(By.xpath(pr.getProperty("userName"))).sendKeys(pr.getProperty("userId"));
	driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(pr.getProperty("pass"));
	driver.findElement(By.xpath(pr.getProperty("loginBtn"))).click();
	}

}
