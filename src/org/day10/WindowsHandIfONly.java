package org.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandIfONly {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("iphone",Keys.ENTER);
				
		
		WebElement findElement2 = driver.findElement(By.xpath("(//span[text()='Apple iPhone XR (64GB) - Black'])[1]"));
		findElement2.click();
		//parent window id
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		//all window id
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		//find childwindow
		for (String eachWindowId : allWin) {
			if (!parentWindow.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
		//child window
		Thread.sleep(3000);
		WebElement findElement3 = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		findElement3.click();
		
		//switch to parent window
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		//click another option
		WebElement findElement4 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		findElement4.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		//pass set to list
		List<String> li=new ArrayList<String>();
		li.addAll(windowHandles);
		//switch to another window
		driver.switchTo().window(li.get(2));
		
		Thread.sleep(3000);
		WebElement findElement7 = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		findElement7.click();
		
		
		
		
		
	
	}		
}
