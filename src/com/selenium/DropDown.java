package com.selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Seleniumsuriya\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement cac = driver.findElement(By.xpath("//a[starts-with(text(), 'Create New')]"));
		cac.click();	
		
		WebElement day = driver.findElement(By.xpath("//select[@id='month']"));

		boolean displayed = day.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = day.isEnabled();
		System.out.println(enabled);
		
		boolean selected = day.isSelected();
		System.out.println(selected);
		
		Select s = new Select(day);
		
		s.selectByValue("2");
		s.selectByIndex(2);
		s.selectByVisibleText("May");
		
		
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("no of options : " + size);
	
		//type1
		for (WebElement webElement : options) {
			
			String text = webElement.getText();
			System.out.println("options thru for each : " + text);
		}
		
		//type2
		for (int i = 0; i <= options.size()-1; i++) {
			
			String text = options.get(i).getText();
			System.out.println("options thru for : " + text);
			
		}
		
		boolean multiple = s.isMultiple();
		System.out.println("is multiple or not : " + multiple);
	
	
		
	}

}
