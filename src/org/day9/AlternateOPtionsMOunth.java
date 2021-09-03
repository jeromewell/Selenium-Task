package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.DateCache.Tick;

public class AlternateOPtionsMOunth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement.click();
	
	Thread.sleep(2000);
	WebElement findElement2 = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
	
	Select select= new Select(findElement2);
	
	List<WebElement> options = select.getOptions();

	for (int i = 0; i < options.size(); i++) {
		if (i%2==0) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
		

}}}

