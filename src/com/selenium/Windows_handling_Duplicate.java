package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling_Duplicate {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		Robot r = new Robot();

		Thread.sleep(2000);

		WebElement sellers = driver.findElement(By.xpath("(//a[text() = 'Best Sellers'])[1]"));
		a.contextClick(sellers).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement Elect = driver.findElement(By.xpath("//a[text() =' Electronics ']"));
		a.contextClick(Elect).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement sellersagain = driver.findElement(By.xpath("(//a[text() = 'Best Sellers'])[1]"));
		a.contextClick(sellersagain).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();

		for (String id : windowHandles) {
			
			System.out.println(id);
			
			System.out.println(driver.switchTo().window(id).getTitle());
			
			driver.switchTo().window(id).equals("Amazon.in Bestsellers: The most popular items on Amazon");
			
		}
	}

}
