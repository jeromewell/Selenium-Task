package org.day8;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/");
	driver.manage().window().maximize();
	
	List<WebElement> find = driver.findElements(By.tagName("frameset"));
	int size = find.size();
	System.out.println(size);
	
	driver.switchTo().frame("login_page");
	
	WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
	element.sendKeys("jerome");
	
	WebElement clickEle = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
	clickEle.click();
	
	//Thread.sleep(2000);frameset
	//WebElement findElement = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	//findElement.sendKeys("123456789");
	
	driver.quit();
	
	
	
	
	}

}
