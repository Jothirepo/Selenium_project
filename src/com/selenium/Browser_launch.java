package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	public static void main(String[] args) {
		// property setup
		// key >> driver name
		// value >> driver path (right click on driver >> properties >> copy paste path)
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  	// Upcasting
		//parent 				//child
		//interface				//class
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.get("https://www.twitter.com/");
		
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
