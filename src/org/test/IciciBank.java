package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	
	WebElement userName = driver.findElement(By.name("DUMMY1"));
	userName.sendKeys("jerome2122");
	
	WebElement clickElement = driver.findElement(By.xpath("(//img[@height='8'])[1]"));
	clickElement.click();
	
	Thread.sleep(2000);
	WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
	pass.sendKeys("wellingston",Keys.ENTER);
	
	
}
}
