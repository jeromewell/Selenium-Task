package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	Thread.sleep(2000);
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	userName.sendKeys("jeromewellingston");
	
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("214323393",Keys.ENTER);
	
	}

}
