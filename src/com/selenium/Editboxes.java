package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).click();                     				 // click method
		
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("jothi");
		
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("okay");   // append a key
		
		WebElement one = driver.findElement(By.xpath("//input[@value ='TestLeaf']"));	 // send keys method

		System.out.println(one.getAttribute("value"));									 // get attribute value based on attribute name
	
		driver.findElement(By.xpath("(//input[@name = 'username'])[2]")).clear();		 // to clear the value given already

		WebElement disabled = driver.findElement(By.xpath("(//input[@type = 'text'])[5]"));
		
		boolean enabled = disabled.isEnabled();											 // to know whether an option is enabled or disabled
		
		System.out.println(enabled);
	}

}
