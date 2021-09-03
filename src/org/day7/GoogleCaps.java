package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleCaps {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
			
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions actions=new Actions(driver);
		
		WebElement searchElement = driver.findElement(By.xpath("//input[@name='q']"));
		actions.keyDown(searchElement,Keys.SHIFT).sendKeys(searchElement,"facebook").keyUp(searchElement,Keys.SHIFT).perform();
		
		
		
	
	}

}
