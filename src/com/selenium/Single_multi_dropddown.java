package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_multi_dropddown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		WebElement dd = driver.findElement(By.xpath("//body[@class = 'page page-id-153 page-template page-template-page-keyword-category page-template-page-keyword-category-php']"));
		
		dd.click();
		
		WebElement Multi = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select (Multi);
		
		s.selectByIndex(0);
		
		s.selectByValue("2");
		
		s.selectByVisibleText("UFT/QTP");
		
		s.deselectByIndex(1);
		
		System.out.println("is it a multiple options : " + s.isMultiple());
		
		System.out.println("*****get all options****");
		
		List<WebElement> opt = s.getOptions();
		
		for (WebElement alloptions : opt) {
			
			System.out.println(alloptions.getText());
			
		}
		
		System.out.println("*****all selected options****");
		
		List<WebElement> allselect = s.getAllSelectedOptions();
		
		for (WebElement selected : allselect) {
			
			System.out.println(selected.getText());
		}
		
		System.out.println("*****first selected option****");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
		WebElement isselected = driver.findElement(By.xpath("(//select)[5]"));
		
		System.out.println("is selected : " + isselected.isSelected());
		
	}

}
