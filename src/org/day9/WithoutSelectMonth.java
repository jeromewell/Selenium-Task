package org.day9;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectMonth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement.click();
	
	Thread.sleep(2000);
	WebElement findElement2 = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	
	String text = findElement2.getText();
	System.out.println(text);
	
	

}}
