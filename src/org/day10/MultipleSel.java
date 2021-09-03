package org.day10;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	WebElement findElement = driver.findElement(By.id("multi-select"));
	
	Select select= new Select(findElement);
	
	boolean multiple = select.isMultiple();
	System.out.println(multiple);
	
	select.selectByValue("California");
	select.selectByValue("New York");
	select.selectByVisibleText("New Jersey");
	Thread.sleep(2000);
	
	
	
	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	for (int i = 0; i < allSelectedOptions.size(); i++) {
		WebElement webElement = allSelectedOptions.get(i);
		String text = webElement.getText();
		System.out.println(text);
	}
	//select all value using indsx
	List<WebElement> options = select.getOptions();
//	for (int i = 0; i < options.size(); i++) {
//		select.selectByIndex(i);
//	}
	//select all options useing value
	for (int i = 0; i < options.size(); i++) {
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		select.selectByVisibleText(text);
		
	}
	
	
	//driver.quit();
	}

}
