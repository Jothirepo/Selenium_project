 package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {

	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Selenium_project\\src\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/alert");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		WebElement sim = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		sim.click();
		
		driver.switchTo().alert().accept();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File ("C:\\Users\\jovin\\Pictures\\Screenshots\\Selenium_project\\src\\alerts\\simplealert.png");
		FileUtils.copyFile(source, target);
	
		WebElement con = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		con.click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement pro = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		pro.click();
		
//		driver.switchTo().alert().getText(); ----> captures if there is a message in the alert box
		
		driver.switchTo().alert().sendKeys("it's jo");
		driver.switchTo().alert().accept();
		
		
	}

}
