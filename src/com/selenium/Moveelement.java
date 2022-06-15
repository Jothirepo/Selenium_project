package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

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
