package com.Selenium_suriya;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Webtable {

	static int index = 0;
	static int ind = 0;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Java_Programs\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");

		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

		List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));

		for (int i = 0; i < headings.size(); i++) {

			String text3 = headings.get(i).getText();

			if (text3.equals("Age")) {

				index = i + 1; // index declared static
				// index = i +1 because, i in java begins with 0, but in html page it is 1
			}

			if (text3.equals("Salary")) {

				ind = i + 1;
				break;
			}
		}

		System.out.println(index);

		System.out.println(ind);

		List<WebElement> agecol = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[" + index + "]"));

		for (int i1 = 0; i1 < agecol.size(); i1++) {

			String aged = agecol.get(i1).getText();
			int parseInt = Integer.parseInt(aged);
			
			if (parseInt>61) {
				
				System.out.println(parseInt);
								
			}
		
		}
		
		System.out.println("********************************************************");

		List<WebElement> salary = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[" + ind + "]"));

		for (int i = 0; i < salary.size(); i++) {

			String text = salary.get(i).getText().replaceAll("[^a-zA-Z0-9]", "");
			int parseInt = Integer.parseInt(text);
			if (parseInt>100000) {
				
				System.out.println(parseInt);
			}

		}

	}
}
