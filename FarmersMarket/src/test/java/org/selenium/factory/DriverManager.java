package org.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
		

	    public WebDriver initializeDriver() {
	    	
	        System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://65.108.242.101/");
	        driver.manage().window().maximize();
	        return driver;
	    }
}
