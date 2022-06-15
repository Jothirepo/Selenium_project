package com.selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_types {

	public static void main(String[] args) throws IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.youtube.com/watch?v=FVwSjBXb20o");
		
		TakesScreenshot t = (TakesScreenshot) driver;			//narrowing casting
		
		File SO = t.getScreenshotAs(OutputType.FILE);
		
		File ta = new File("C:\\Users\\jovin\\Pictures\\Screenshots\\youtube.png");
		
		FileUtils.copyFile(SO, ta);
		
		// screenshot using robot class for full size screenshot
		
		driver.navigate().to("https://maven.apache.org/download.cgi#downloading-apache-maven-3-8-5");
		
		Robot r = new Robot();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rectangle  = new Rectangle(screenSize);
		
		BufferedImage Source = r.createScreenCapture(rectangle);
		
		File target	= new File("C:\\Users\\jovin\\Pictures\\Screenshots\\maven.png");
		
		ImageIO.write(Source, "png", target);
	}

}
