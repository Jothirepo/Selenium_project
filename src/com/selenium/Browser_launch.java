package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_launch {

	public static void main(String[] args) throws IOException {
		// property setup
		// key >> driver name
		// value >> driver path (right click on driver >> properties >> copy paste path)

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Upcasting
		// parent //child
		// interface //class

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.navigate().to("https://www.instagram.com/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.get("https://www.twitter.com/");

		driver.navigate().refresh();

		driver.close();
		
		

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("C:\\Users\\jovin\\Pictures\\Screenshots\\Handle.png");

		FileUtils.copyFile(source, target); // IO EXCEPTION THROWN AT COMPILE TIME
		
		WebDriverWait wb = new WebDriverWait(driver, 2000);
		
	//	wb.until(ExpectedConditions.elementToBeClickable("23"));

		FluentWait w = new FluentWait(driver).withTimeout(2000, TimeUnit.MILLISECONDS);
		
		
	}

}
