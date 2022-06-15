package com.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_verify_downloads {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/download.html");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		WebElement excel = driver.findElement(By.linkText("Download Excel"));

		excel.click();		
		
		//control moves to windows
		
		File fileloc = new File("C:\\Users\\jovin\\Downloads\\selenium");		//file is a class to access files in our system thru selenium 
		
		File[] allFiles = fileloc.listFiles();							//listfiles() used to list all the downloaded files
		
		for (File file : allFiles) {											//for each to iterate all the files
			
			if (file.getName().equals("testleaf.xlsx")) {						//if statement used to find our downloaded file
				
				System.out.println("file is downloaded");
				
				break;
				
			}
			
		}
	}

}
