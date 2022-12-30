package com.Selenium_suriya;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Keyboard {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Actions ac = new Actions (driver);
		
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("jothi");
		
		ac.keyUp(user, Keys.CONTROL);
//		ac.keyUp(user, Keys.a);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(Keys.CONTROL);
		pass.sendKeys("V");
		
		
	}
	
	
}
