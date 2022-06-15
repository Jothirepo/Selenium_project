package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_gmail_threadsleep_throws {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.gmail.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@autocomplete = 'username']"));
		
		username.sendKeys("jothi1213@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("//div[@id='identifierNext']"));
		
		next.click();		
	
		Thread.sleep(2000);					// Used to avoid exception even when the xpath data is correct but occurs due to thread sleep time
		
		WebElement tryagain = driver.findElement(By.xpath("//span[@class = 'VfPpkd-vQzf8d']"));
	
		tryagain.click();
	}
}
