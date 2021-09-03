package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	WebElement userId = driver.findElement(By.id("username"));
	userId.sendKeys("jerome");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("2421223jer");
	
	//driver.quit();
	}

}
