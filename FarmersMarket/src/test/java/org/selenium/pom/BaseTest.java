package org.selenium.pom;


import org.openqa.selenium.WebDriver;
import org.selenium.factory.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void startDriver() {
		
		driver = new DriverManager().initializeDriver();
		
	}
	
	

	@AfterMethod
	public void quitDriver() {
		driver.quit();
	
		
	}
	
}
