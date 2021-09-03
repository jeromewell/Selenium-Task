package org.day9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDuplicateMounth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement.click();
	Thread.sleep(3000);
	
	WebElement findElement2 = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select select= new Select(findElement2);
	
	List<WebElement> options = select.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
	}
	int size = options.size();
	System.out.println(size);
	
	Set set= new HashSet();
	set.addAll(options);
	
	int size2 = set.size();
	System.out.println(size2);
	System.out.println("the duplicate values are:");
	System.out.println(size-size2	);
		driver.quit();
	
}}
