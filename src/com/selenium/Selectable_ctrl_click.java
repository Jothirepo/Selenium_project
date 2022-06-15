package com.selenium;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_ctrl_click {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> selectable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		System.out.println(selectable.size());
		
		Actions ac = new Actions (driver);
		
		ac.keyDown(Keys.CONTROL).			//press control on keyboard
		click(selectable.get(0)).			//click element on index o
		click(selectable.get(1)).			//click element on index 1
		click(selectable.get(3)).			//click element on index 3
		build().perform();
		
	}

}
