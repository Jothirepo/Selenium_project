package com.Selenium_suriya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//
//		WebElement single = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		driver.switchTo().frame(single);
//
//		WebElement input = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		input.sendKeys("jothi");
//
//		driver.switchTo().defaultContent();
		
		WebElement net = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		net.click();

		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		
		WebElement input2 = driver.findElement(By.xpath("//input[@type='text']"));
		input2.sendKeys("ramalingam");

		
		
		

	}

}
