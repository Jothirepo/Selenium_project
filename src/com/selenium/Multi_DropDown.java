package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_DropDown {

	public static void main(String[] args) throws My_Exception {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Selenium_project\\src\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");

		WebElement multi = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s = new Select(multi);

		if (s.isMultiple()) {

			boolean multiple = s.isMultiple();
			System.out.println("is it multiple : " + multiple);

		} else {

			throw new My_Exception("it's a single dropdown");
		}

		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("no of dropdowns : " + size);

		for (int i = 0; i < options.size(); i++) {

			String text = options.get(i).getText();
			System.out.println("the superhero at index " + i + " is :" + text);
			
			if (options.get(i).getText().equals("Batman") || options.get(i).getText().equals("Ant-Man")) {
				
				String text2 = options.get(i).getText();
				s.selectByVisibleText(text2);

			} else {

			}
		}

		s.selectByValue("aq");
		s.selectByVisibleText("The Avengers");
		s.selectByIndex(5);

		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement multip : allSelectedOptions) {

			String text = multip.getText();
			System.out.println(text);
		}

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("first selected option : " + text);

		//s.deselectAll();

		WebElement single = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select ss = new Select(single);
		if (ss.isMultiple()) {

			boolean multiple = ss.isMultiple();
			System.out.println("is it multiple : " + multiple);

		} else {

			throw new My_Exception("it's a single dropdown");
		}

		driver.quit();

		System.out.println("multiple dropdown ended");

	}

}
