package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSite {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		 
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[1]"));
		actions.dragAndDrop(source, target).perform();
		
		Thread.sleep(4000);
		WebElement source1 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement target1= driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		actions.dragAndDrop(source1, target1).perform();
		
		Thread.sleep(4000);
		WebElement source2= driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2= driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
		actions.dragAndDrop(source2, target2).perform();

		Thread.sleep(4000);
	WebElement source3= driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
	WebElement target3= driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
	actions.dragAndDrop(source3, target3).perform();
}
}
