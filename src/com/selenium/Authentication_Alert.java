package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Authentication_Alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
		op.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jothi:passramjo@the-internet.herokuapp.com/basic_auth");
	}

}
