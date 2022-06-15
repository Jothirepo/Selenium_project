package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Auto_completion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		WebElement box = driver.findElement(By.id("tags"));
		box.sendKeys("S");
		
		List<WebElement> autocompletion = driver.findElements(By.xpath("//ul[@id ='ui-id-1']/li"));

		for (WebElement we : autocompletion) {
			
			if (we.getText().equals("Selenium")) {
				
				we.click();
				
				System.out.println(we.getSize());
				
				break;
				
			}
			
		}
		}
		
	}
