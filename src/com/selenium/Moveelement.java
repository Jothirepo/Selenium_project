package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveelement {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/index.html");
		
		Actions key = new Actions (driver);
		
		WebElement online = driver.findElement(By.xpath("//a[text() = 'COURSES']"));
		
		key.moveToElement(online).build().perform(); 
		
		Thread.sleep(1000);
		
		WebElement ds = driver.findElement(By.xpath("//span[text()='Data Science Training']"));
		
		key.moveToElement(ds).build().perform();
		
		WebElement options = driver.findElement(By.xpath("//span[text()='Data Science with R Training']"));
		
		options.click();
		
		
	}

}
