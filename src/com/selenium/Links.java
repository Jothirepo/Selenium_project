package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Link.html");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// find target page using href without clicking
		WebElement findlink = driver.findElement(By.partialLinkText("Find where am"));
		String targetinfo = findlink.getAttribute("href");
		System.out.println("this link is going to = " + targetinfo);

		// check whether link is broken or not
		WebElement brokenornot = driver.findElement(By.xpath("//a[text() = 'Verify am I broken?']"));
		brokenornot.click();

		String title = driver.getTitle();

		if (title.contains("404")) {

			System.out.println("link is broken & title is " + title);
		}

		driver.navigate().back();

		// same link same name but different index
		WebElement samelinksamename = driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[2]"));
		samelinksamename.click();

		driver.navigate().back();

		List<WebElement> nooflinks = driver.findElements(By.tagName("a"));

		System.out.println("total no of links : " + nooflinks.size());
		

	}

}
