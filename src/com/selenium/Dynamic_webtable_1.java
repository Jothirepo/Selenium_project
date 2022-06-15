package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement progressvalue = driver
				.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following::td[1]"));

		System.out.println("progress value using relative xpath : " + progressvalue.getText());

		driver.navigate().to("https://www.worldometers.info/coronavirus/#countries");

		/*
		 * List<WebElement> covidtable = driver.findElements(By.id("main_table_countries_today"));
		 * 
		 * for (WebElement alldata : covidtable) {
		 * 
		 * System.out.println(alldata.getText()); }
		 */

		/*WebElement cases = driver.findElement(By.xpath("//a[text()='USA']//following::td[5]"));
		
			//similarly we can do for recovered cases, new cases etc.,

		System.out.println("total no of cases in usa : " + cases.getText());*/
		
		
		
	}
}
