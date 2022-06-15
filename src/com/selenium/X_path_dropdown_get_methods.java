package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class X_path_dropdown_get_methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement user = driver.findElement(By.xpath("//input[@type = 'text']"));

		user.sendKeys("jothi@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@class = 'inputtext _55r1 _6luy _9npi']"));

		pass.sendKeys("sfnwwn");

		WebElement login = driver
				.findElement(By.xpath("//button[@class = '_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));

		System.out.println("get text : " + login.getText()); 							   // to get the text in the web element

		System.out.println("is displayed : " + login.isDisplayed()); 					   // to check whether a web element is visible or not

		System.out.println("is enabled : " + user.isEnabled());							   // to check whether a web element is editable or not

		user.clear(); 																	   // to delete the data sent to a particular web element

		System.out.println("get title : " + driver.getTitle()); 						   // to get title of the page

		System.out.println("get current url : " + driver.getCurrentUrl()); 				   // to get URL of the page

		System.out.println("get att value based on name : " + pass.getAttribute("class")); // to check attribute's value based on name

		WebElement Createaccount = driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));

		Createaccount.click();
		
		Thread.sleep(2000);

		WebElement Firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));

		Firstname.sendKeys("jo");

		Thread.sleep(2000);
		
		WebElement Surname = driver.findElement(By.xpath("//input[@name = 'lastname']"));

		Surname.sendKeys("ram");
		
		Thread.sleep(2000);

		WebElement mob = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));

		mob.sendKeys("1414115");
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//select[@aria-label = 'Day']"));

		Select d = new Select(date);

		d.selectByValue("2");

		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));

		Select m = new Select(month);
		
		m.selectByVisibleText("Mar");
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id = 'year']"));

		Select y = new Select(year);

		y.selectByIndex(4);
		
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.xpath("//label[text() = 'Female']"));
		
		gender.click();

	}

}
