package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();			//Link text
		
		driver.findElement(By.partialLinkText("Verify am I")).click();		//partial link text

	}

}
