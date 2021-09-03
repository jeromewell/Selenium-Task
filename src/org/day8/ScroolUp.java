package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");

	ChromeDriver  driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	WebElement findElement = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
	executor.executeScript("arguments[0].scrollIntoView(true)", findElement);
	
	Thread.sleep(2000);
	WebElement findElement2 = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
	executor.executeScript("arguments[0].scrollIntoView(false)", findElement2);
	}

}
