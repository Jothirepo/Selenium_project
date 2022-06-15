package com.selenium;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Static_table_fluentwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		/*
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		
		System.out.println("no of columns in the static table : " + columns.size());
		
		
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		System.out.println("no of rows in the static table : " + rows.size());
		
		
		
		/*WebElement progress_value = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		
		System.out.println("memory location : " + progress_value);*/
		
		
		
		/*WebElement progressvalue = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		
		System.out.println(progressvalue.getText());*/
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(org.openqa.selenium.NoSuchElementException.class);
		
		WebElement prof = wait.until(new Function <WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
			}});
			
		System.out.println(prof.getText());
 
}}