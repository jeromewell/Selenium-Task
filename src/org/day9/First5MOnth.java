package org.day9;

import java.awt.TexturePaint;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First5MOnth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement.click();
	
	Thread.sleep(2000);
	WebElement findElement2 = driver.findElement(By.id("month"));
	
	Select select= new Select(findElement2);
	
	List<WebElement> options = select.getOptions();
	for (int i = 0; i < 5; i++) {
		
		WebElement webElement = options.get(i);
		String l = webElement.getText();
		System.out.println(l);
		
	}	
}}