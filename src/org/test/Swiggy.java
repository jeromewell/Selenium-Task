package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	WebElement loacaion = driver.findElement(By.id("location"));
	loacaion.sendKeys("omr");
	driver.quit();
	
	
	}

}
