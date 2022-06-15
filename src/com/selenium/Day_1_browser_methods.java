package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_1_browser_methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.guru99.com/");
		
		drive.navigate().refresh();
		
		drive.navigate().to("https://www.amazon.in/");
		
		drive.navigate().back();
		
		drive.navigate().refresh();
		
		drive.manage().window().maximize();
		
		drive.navigate().to("https://www.youtube.in/");
		

	}

}
