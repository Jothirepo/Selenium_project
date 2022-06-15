package com.Mini_project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Mini_proj {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jovin\\Documents\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// login
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("ramajothis");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("36XN60");
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		// location
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");
		// hotel
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
		// roomtype
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByValue("Double");
		// room_nos
		WebElement room_nos = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(room_nos);
		s3.selectByValue("3");
		// checkin
		WebElement datepick_in = driver.findElement(By.id("datepick_in"));
		datepick_in.clear();
		datepick_in.sendKeys("10/02/2022");
		// check_out
		WebElement datepick_out = driver.findElement(By.id("datepick_out"));
		datepick_out.clear();
		datepick_out.sendKeys("11/02/2022");
		// adult_room
		WebElement adult_room = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adult_room);
		s4.selectByValue("4");
		// children_room
		WebElement child_room = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child_room);
		s5.selectByValue("2");
		// search
		WebElement Submit = driver.findElement(By.name("Submit"));
		Submit.click();
		// radiobutton
		WebElement radio = driver.findElement(By.name("radiobutton_0"));
		radio.click();
		// continue
		WebElement conti = driver.findElement(By.name("continue"));
		conti.click();
		// firstname
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("jothi");
		// lastname
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("ramalingam");
		// address
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("1214, fsfwkb street, sfiwf nagar, chennai");
		// creditcard
		WebElement credit = driver.findElement(By.xpath("(//input[@type ='text'])[13]"));
		credit.sendKeys("1314151511111213");
		// cardtype
		WebElement cc_type = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cc_type);
		s6.selectByValue("VISA");
		// month
		WebElement cc_exp_month = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(cc_exp_month);
		s7.selectByValue("2");
		// year
		WebElement cc_exp_year = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(cc_exp_year);
		s8.selectByValue("2019");
		// cc_cvv
		WebElement cc_cvv = driver.findElement(By.name("cc_cvv"));
		cc_cvv.sendKeys("234");
		// book_now
		WebElement book_now = driver.findElement(By.name("book_now"));
		book_now.click();
		//logout
		WebElement logout = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		logout.click();

	}

}
