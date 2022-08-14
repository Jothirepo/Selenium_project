package com.Selenium_suriya;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		List<WebElement> tables = driver.findElements(By.tagName("table"));
		int size = tables.size();
		System.out.println("no of tables in the webpage based on 'table' tagName : " + size);

		// WAY_1
		WebElement age = driver.findElement(By.xpath("//td[text()='61']"));
		String text = age.getText();
		System.out.println("using text function : " + text);

		System.out.println("********************************************************");

		// WAY_2
		WebElement a = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[1]/td[4]"));
		String text2 = a.getText();
		System.out.println("old way of DYN W.TAB using index position : " + text2);

		System.out.println("********************************************************");

		List<WebElement> astin = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[3]/td"));

		for (WebElement webElement : astin) {

			String text3 = webElement.getText();
			System.out.println("row data : " + text3);
		}

		System.out.println("********************************************************");

		List<WebElement> office = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[3]"));

		for (WebElement webElement : office) {

			String text3 = webElement.getText();
			System.out.println("col data : " + text3);
		}

		System.out.println("********************************************************");

		List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
		for (WebElement webElement : headings) {

			System.out.println("headers by xpath : " + webElement.getText());
		}
		
		System.out.println("********************************************************");

		List<WebElement> headers = driver.findElements(By.tagName("th"));
		for (WebElement webElement : headers) {

			System.out.println("headers by tagname : " + webElement.getText());
		}
	}

}
