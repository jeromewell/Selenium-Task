package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Middle {
	public static String text;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		WebElement newAcc= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newAcc.click();
	Thread.sleep(3000);
	
	WebElement findElement = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	
	Select select= new Select(findElement);
	
	select.selectByIndex(2);
	
	List<WebElement> options = select.getOptions();
	int a=options.size();
	
	if (a%2==0) {
		WebElement webElement = options.get(a/2);
		text = webElement.getText();
	} else {
		WebElement webElement = options.get((a-1)/2);
		 text = webElement.getText();
	}
		System.out.println(text);
	}
}
