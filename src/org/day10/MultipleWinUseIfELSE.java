package org.day10;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWinUseIfELSE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iphone",Keys.ENTER);
	
	WebElement findElement2 = driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (128GB) - White']"));
	findElement2.click();
	
	String pwin = driver.getWindowHandle();
	System.out.println(pwin);
	
	Set<String> allwindowHandles = driver.getWindowHandles();
	System.out.println(allwindowHandles);
	
	for (String string : allwindowHandles) {
		if (pwin.equals(allwindowHandles)) {
		driver.switchTo().window(string);
			
		} else {
			driver.switchTo().window(string);
		}
	}
	//child window
	Thread.sleep(3000);
	WebElement findElement3 = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
	findElement3.click();
	Thread.sleep(2000);
//switch to parent window
	driver.switchTo().window(pwin);
	Thread.sleep(2000);
		WebElement findElement4 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	findElement4.click();
	
	driver.close();
	
	
	
	
	
	
	}
}
