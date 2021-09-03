package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('value','jerome')", findElement);
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','wellingston')", findElement2);
		
		//WebElement findElement3 = driver.findElement(By.xpath("//button[@value='1']"));
		//js.executeScript("arguments[0].click()", findElement3);
	
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", findElement);
	System.out.println(executeScript);
		
	Object executeScript2 = js.executeScript("return arguments[0].getAttribute('value')", findElement2);
	System.out.println(executeScript2);
	driver.quit();
	}

}
