package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		
		
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("singleframe");	// single frame
		
		WebElement frame1 = driver.findElement(By.xpath("(//input)[@type ='text'][1]"));
		
		frame1.sendKeys("jo");
		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		WebElement iframe = driver.findElement(By.xpath("(//a[@class = 'analystic'])[2]"));  
		
		iframe.click();								//iframe
		

		Thread.sleep(1000);
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']")); 
		
		driver.switchTo().frame(iframe1);			//outer frame
		
		
		Thread.sleep(1000);
		
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@style = 'float: left;height: 250px;width: 400px']"));
		
		driver.switchTo().frame(iframe2);			//inner frame
		
		
		Thread.sleep(1000);
		
		WebElement inbox = driver.findElement(By.xpath("//input[@type='text']"));
		
		inbox.sendKeys("jothi");
		
	}

}
