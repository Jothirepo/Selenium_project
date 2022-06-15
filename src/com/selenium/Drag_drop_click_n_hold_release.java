package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_click_n_hold_release {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));   //drag element
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));	//drop element
		
				//mouse actions
		
		Actions dnd = new Actions(driver);
		
	  //dnd.dragAndDrop(drag, drop).build().perform();   			 	 //drag and drop method : dragAndDrop(WebElement source, WebElement target);
		
		dnd.clickAndHold(drag).build().perform();    					 //click & hold method
		dnd.release(drop).build().perform();							 //release method
		
	  //dnd.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();  //clickandhold, move element & release methods
	}

}
