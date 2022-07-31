package org.selenium;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.selenium.pom.BaseTest;
import org.testng.annotations.Test;


public class MyNewTestCase extends BaseTest {
	@Test
	
public void myTestcase() throws InterruptedException, IOException, AWTException {
		
		
        //Login
	
		

        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/form/div[1]/input")).sendKeys("superadmin@coherent.in");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/form/div[2]/input")).sendKeys("pass1234");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/form/button")).click();
        
        
        //Take Screenshot here
        
       /* TakesScreenshot screenshot=(TakesScreenshot) driver;
        File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("D:\\sample.png");
        FileHandler.copy(sourceFile,destinationFile);*/
        
       /* TakesScreenshot screenshot=(TakesScreenshot) driver;
        File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("D:\\Selenium Screenshots.png");
        FileUtils.copyFile(sourceFile,destinationFile);*/
        
        
Robot robot = new Robot();
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Rectangle rectangle = new Rectangle(screenSize);
BufferedImage source = robot.createScreenCapture(rectangle);

File destinationFile=new File("D:\\Selenium Screenshots.png");
ImageIO.write(source,"png", destinationFile);

Thread.sleep(5000);



        driver.findElement(By.xpath("//*[@id=\"navbar5\"]/ul/li[2]/a")).click();
     
        driver.findElement(By.xpath("//button[normalize-space()='Create Admin']")).click();

        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).sendKeys("Vigne");
        driver.findElement(By.cssSelector("input[name='mobile_number'][type='text']")).sendKeys("9944001291");
        driver.findElement(By.cssSelector("input[name='email_id']")).sendKeys("v@coherent.in");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("vicky123");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"district_id\"]"));
        Select sel = new Select(element);
        sel.selectByVisibleText("Mysore");

        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(3) > input:nth-child(2)")).sendKeys("K K Nagar");
        driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
        
    







    //Seller
    driver.findElement(By.xpath("//a[normalize-space()='Seller']")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("input[placeholder='Search by seller name']")).sendKeys("vanitha");
    Thread.sleep(5000);



    //Buyer
    driver.findElement(By.xpath("//a[normalize-space()='Buyer']")).click();
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("input[placeholder='Search by buyer name']")).sendKeys("ravi");
    Thread.sleep(5000);


    //Products
    //driver.findElement(By.xpath("//*[@id=\"navbar5\"]/ul/li[3]/a")).click();
    //driver.findElement(By.xpath("//button[normalize-space()='Add Product']")).click();

    //WebElement element1 = driver.findElement(By.xpath("//*[@id=\"category_id_fk\"]"));
    //Select select = new Select(element);
    //sel.selectByVisibleText("vegetable");



    //District
    driver.findElement(By.xpath("//a[normalize-space()='District']")).click();
    driver.findElement(By.xpath("//button[normalize-space()='Add District']")).click();
    driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("Then");
    driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
    Thread.sleep(3000);

    //Pagination
    //driver.findElement(By.xpath("//div[contains(@class,'tab-content')]//li[1]//a[1]")).click();
    //Thread.sleep(3000);


    //Feedback
    driver.findElement(By.xpath("//nav[contains(@class,'flex-sm-nowrap flex-wrap')]")).click();
    Thread.sleep(5000);



    //Request
    driver.findElement(By.xpath("//a[normalize-space()='Request']")).click();
    Thread.sleep(6000);
	
	}
	
}

