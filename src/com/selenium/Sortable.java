package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/sortable.html");

		List<WebElement> sortable = driver.findElements(By.xpath("//ul[@id='sortable']/li"));

		Actions ac = new Actions(driver);

		// sorting based on xpath using draganddrop on for each with if condition
		WebElement source = driver.findElement(By.xpath("//li[text() = 'Item 7']"));
		WebElement target = driver.findElement(By.xpath("//li[text() = 'Item 1']"));

		Thread.sleep(3000);

		ac.dragAndDrop(source, target).build().perform();

		// sorting based on index using get function with index
		WebElement so = sortable.get(0);
		WebElement ta = sortable.get(5);

		Thread.sleep(3000);

		ac.clickAndHold(so);
		ac.moveToElement(ta);
		ac.release(ta);
		ac.build().perform();

	}

}
