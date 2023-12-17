package com.zohocrm.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	public Filelib f=new Filelib();
	@BeforeClass 
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		String url = f.getPropertyData("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void login() {
		
	}
	@AfterMethod
	public void logout() {
		
	}
	@AfterClass
	public void closeBrowser() {
		
	}
}
