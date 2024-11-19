package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties pr;
	@BeforeMethod
	public void initiate() throws IOException {
		driver=new ChromeDriver();
		pr=new Properties();
		File f=new File("../PageObjectModel/src/test/java/Object.Properties");
		FileReader fr=new FileReader(f);
		pr.load(fr);
	}
}
