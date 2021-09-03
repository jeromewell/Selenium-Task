package org.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectAll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement.click();
	Thread.sleep(3000);
	WebElement findElement2 = driver.findElement(By.xpath("//select[@aria-label='Day']"));
	
	String text = findElement2.getText();
	System.out.println(text);
	
	WebElement findElement3 = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	String text2 = findElement3.getText();
	System.out.println(text2);
	
	WebElement findElement4 = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	String text3 = findElement4.getText();
	System.out.println(text3);
	
	
	
	

}}
