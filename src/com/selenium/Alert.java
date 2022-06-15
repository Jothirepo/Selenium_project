 package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		WebElement alert = driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']"));
		
		alert.click();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[text() = 'click the button to demonstrate the prompt box ']"));
		
		alert2.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("jothi");
		
		driver.switchTo().alert().accept();

	}

}
