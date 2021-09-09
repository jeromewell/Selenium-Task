package org.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement table = driver.findElement(By.tagName("table"));
	List<WebElement> row = table.findElements(By.tagName("tr"));
	for (int i = 0; i < row.size(); i++) {
		WebElement eachRow = row.get(i);
		List<WebElement> headings = eachRow.findElements(By.tagName("th"));
		for (int j = 0; j < headings.size(); j++) {
			
			WebElement eachHeading = headings.get(j);
			String text = eachHeading.getText();
			System.out.println(text);
		}
		List<WebElement> data = eachRow.findElements(By.tagName("td"));
		for (int k = 0; k < data.size(); k++) {
			WebElement eachdata = data.get(k);
			String text1 = eachdata.getText();
			System.out.println(text1);
		}
	}
	driver.quit();
	}
	
	
}
