package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // Used to avoid exception even when the xpath data is correct but exception occurs due to sleep time/ time out

		driver.navigate().to("https://www.gmail.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@autocomplete = 'username']"));
		
		username.sendKeys("jothi1213@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("//div[@id='identifierNext']"));
		
		next.click();		
		
		WebElement tryagain = driver.findElement(By.xpath("//span[text() ='Try again']"));
	
		tryagain.click();

	}

}
