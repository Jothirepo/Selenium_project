package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Image.html");

		WebElement brokenimage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));

		if (brokenimage.getAttribute("naturalWidth").equals("0")) {		//naturalwidth is a css indicator if it '0' then image is broken			

			System.out.println("image is broken");
		}

		else {
			System.out.println("image is good");
		}
	}
}
