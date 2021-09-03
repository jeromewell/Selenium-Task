package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	
	Actions actions =new Actions(driver);
	
	Thread.sleep(2000);
	WebElement mobileElement = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
	actions.moveToElement(mobileElement).perform();
		
	Thread.sleep(2000);
	WebElement realme = driver.findElement(By.xpath("//a[text()='Realme']"));
	realme.click();
	

}}
