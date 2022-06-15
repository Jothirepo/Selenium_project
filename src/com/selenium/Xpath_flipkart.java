package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_flipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.navigate().to("https://affiliate.flipkart.com/login");

		WebElement username = driver1.findElement(By.xpath("//input[@id = 'inputEmail']"));

		username.sendKeys("ramjo@gmail.com");

		WebElement password = driver1.findElement(By.xpath("//input[@type = 'password']"));

		password.sendKeys("jojjoo");
		
		WebElement Signin = driver1.findElement(By.xpath("//input[@type = 'submit']"));
		
		String text = Signin.getText();
		
		System.out.println(text);
		
		Signin.click();
		
		username.clear();
		
		String title = driver1.getTitle();
		
		System.out.println(title);
		

	}

}
