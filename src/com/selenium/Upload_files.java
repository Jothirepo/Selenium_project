package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_files {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://smallpdf.com/pdf-converter");

		WebElement upload = driver.findElement(By.xpath("//span[text() = 'Choose Files']"));
		upload.click();

		// control moves to windows
		// then move control to clipboard using toolkit
		// transferable files are from string selection (class used to convert java string into a plain text format)
		// convert the path into a single datatype for ease access everytime

		// to copy the file location
		Thread.sleep(3000);
		String s = "C:\\Users\\jovin\\Documents\\TESTING\\Surya_class.txt";
		StringSelection file1 = new StringSelection(s);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);

		// to paste the file location
		Thread.sleep(3000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);			// To upload

	}

}
