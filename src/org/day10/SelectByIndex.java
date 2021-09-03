package org.day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement findElement = driver.findElement(By.id("select-demo"));
		//create select classs
		Select select= new Select(findElement);
		
		List<WebElement> options = select.getOptions();
		
		//size of list
		int size = options.size();
		System.out.println(size);
		
		//index pass  get text
		WebElement webElement2 = options.get(6);
		String text = webElement2.getText();
		System.out.println(text);
		
		//get all options
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		//enhanced for loop
		for (WebElement el : options) {
			String attribute = el.getAttribute("value");
			System.out.println(attribute);
		}
		driver.quit();
	
	}

}
