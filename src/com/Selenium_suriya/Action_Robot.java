package com.Selenium_suriya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action_Robot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Actions ac = new Actions (driver);
		
	}

}
