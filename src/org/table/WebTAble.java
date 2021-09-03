package org.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTAble {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		//table row
		for (int i = 0; i < row.size(); i++) {
			WebElement eachrow = row.get(i);
			//table heading
			List<WebElement> heading = eachrow.findElements(By.tagName("th"));
			for (int j = 0; j < heading.size(); j++) {
				WebElement eachHeading = heading.get(j);
				String text = eachHeading.getText();
				System.out.println(text);
			}
			
			List<WebElement> data = eachrow.findElements(By.tagName("td"));
			for (int k = 0; k < data.size(); k++) {
			WebElement eachdata = data.get(k);
				String text = eachdata.getText();
				System.out.println(text);
				
			}
			
		}
	driver.quit();
	
	}

}
