package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2_Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driv = new ChromeDriver();

		driv.manage().window().maximize();

		driv.navigate().to("https://www.facebook.com/");

		String title = driv.getTitle(); 			// to get the title of the page

		System.out.println(title);

		String url = driv.getCurrentUrl(); 			// to get the url of the current page

		System.out.println(url);

		WebElement mail = driv.findElement(By.id("email"));

		mail.sendKeys("jot1111@gmail.com");

		WebElement password = driv.findElement(By.name("pass"));

		password.sendKeys("fhfn@1213");

		WebElement login = driv.findElement(By.name("login"));

		login.click();
		
		
	}

}
