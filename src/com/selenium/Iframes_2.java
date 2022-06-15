package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

						//single frame
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src ='default.html']"));
		driver.switchTo().frame(frame1);
		WebElement fralik = driver.findElement(By.xpath("//button[@onclick = 'change()']"));
		fralik.click();
		
		
					//get back to original html page 
		driver.switchTo().defaultContent();
		
					//nested frames
		
						//outer frame
		WebElement frame01 = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(frame01);
		
						//inner inner
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@name = 'frame2']"));
		driver.switchTo().frame(frame2);

						//click button
		WebElement fralik2 = driver.findElement(By.xpath("//button[@id = 'Click1']"));
		fralik2.click();
		
		
					//get back to original html page
		driver.switchTo().defaultContent();
		
		
					//no of frames in the webpage
		List<WebElement> noofframes= driver.findElements(By.tagName("iframe"));
		int size = noofframes.size();
		System.out.println(size);
	
	}

}
