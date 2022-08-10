package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_dd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Selenium_project\\src\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");

		WebElement multi = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s = new Select(multi);
		List<WebElement> options = s.getOptions();

			for (int i = 0; i < options.size(); i++) {
				
				if (options.get(i).getText().equals("The Avengers") || options.get(i).getText().equals("Ant-Man") ) {
					
					//s.selectByVisibleText(options.get(i).getText());
					s.selectByIndex(i);
				}
			}

		for (WebElement webElement : options) {
			
			if (webElement.getText().equals("Batman") || webElement.getText().equals("Aquaman")) {
				
				webElement.click();
 			}

		}
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement webElement : allSelectedOptions) {
			
			System.out.println(webElement.getText());
			
		}
		
	}
}
