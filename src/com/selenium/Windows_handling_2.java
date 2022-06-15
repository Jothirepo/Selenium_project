package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Window.html");

		String oldhandle = driver.getWindowHandle();  // control is on home page (parent window)

		WebElement firstwindow = driver.findElement(By.id("home"));

		firstwindow.click();

		Set<String> newhandle = driver.getWindowHandles(); // new handle has both the parent & newly opened child
															// window's data

		for (String newwindows : newhandle) { // since newhandle has both of them, we are requesting ide to iterate and
												// switch from current/parent to new window

			driver.switchTo().window(newwindows);

		}

		WebElement editbox = driver.findElement(By.xpath("//h5[text() = 'Edit']"));  // control now in new window
		editbox.click();

		driver.close();									//if we fail to switch window in next step, ide will throw excp cos handle lies in new window & it is closed
		driver.switchTo().window(oldhandle);			// switching back the window handle to parent window

		WebElement multiplewindows = driver.findElement(By.xpath("//button[text() = 'Open Multiple Windows']"));
		multiplewindows.click();

		System.out.println("no of new windows opened : " + driver.getWindowHandles().size()); // get the no of opened windows based on size
																								 
		WebElement donotclose = driver.findElement(By.id("color"));
		donotclose.click();
		
		System.out.println("getWindowHandles() needs to be created newly every single time when new open windows are opened");
		System.out.println("no of new windows opened AGAIN : " + driver.getWindowHandles().size());
		

		Set<String> newwinhandle = driver.getWindowHandles();

		for (String closenewwin : newwinhandle) {
			if (!closenewwin.equals(oldhandle)) {				//if all windows opened is not equal to parent window, close the newly opened windows

				driver.switchTo().window(closenewwin);
				driver.close();

			}
		}
		
		

	}

}
