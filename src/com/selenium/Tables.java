package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		Thread.sleep(2000);

		List<WebElement> All = driver.findElements(By.xpath("//table[1]//tbody/tr/td"));

		for (WebElement whole : All) {

			System.out.println(whole.getText());

		}

		System.out.println("*****no of columns*****");

		List<WebElement> columns = driver.findElements(By.xpath("//table[1]//tbody/tr/th")); //can be found by using By.tagname("th");

		System.out.println(columns.size());
		
		

		System.out.println("*****no of rows*****");

		List<WebElement> rows = driver.findElements(By.xpath("//table[1]//tbody/tr")); //can be found by using By.tagname("tr");

		System.out.println(rows.size());
		
		
		System.out.println("*****progress value using static*****");
		
		WebElement staticprog = driver.findElement(By.xpath("//table[1]//tbody/tr[@class = 'even']/td[2]"));
	
		System.out.println(staticprog.getText());
		
		
		System.out.println("*****columns title using xpath*****");

		List<WebElement> ct = driver.findElements(By.xpath("//table[1]//tbody/tr/th"));

		for (WebElement titles : ct) {
			
			System.out.println(titles.getText());
		}
		
		
		System.out.println("*****columns title using tagname*****");

		List<WebElement> ct2 = driver.findElements(By.tagName("th"));

		for (WebElement titles2 : ct2) {
			
			System.out.println(titles2.getText());
		}
	}

}
