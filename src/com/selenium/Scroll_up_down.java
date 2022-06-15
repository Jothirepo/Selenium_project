package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement scrolldown = driver.findElement(By.xpath("(//a[text() ='See all offers'])[2]"));
		
		WebElement sellers = driver.findElement(By.xpath("(//a[text() = 'Best Sellers'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		// narrowing casting
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);   // scroll down
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000);");					  // scroll up
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);	  // scroll down
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -3000);");					  // scroll up
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3000);");					  // scroll down
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", sellers);	  // scroll up
		
	}

}
