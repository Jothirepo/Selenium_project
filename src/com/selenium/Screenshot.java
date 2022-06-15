package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source1 = ts.getScreenshotAs(OutputType.FILE);

		File target1 = new File(
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Screenshot\\facebook.png");

		FileUtils.copyFile(source1, target1);

		driver.navigate().to("https://www.instagram.com/");

		File source2 = ts.getScreenshotAs(OutputType.FILE);
		
		File target2 = new File(
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Screenshot\\instagram.png");

		FileUtils.copyFile(source2, target2);

	}

}
