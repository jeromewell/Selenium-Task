package org.frame1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	List<WebElement> frameset = driver.findElements(By.tagName("iframe"));
	int size = frameset.size();
	System.out.println(size);
	JavascriptExecutor executor= (JavascriptExecutor)driver;
	
	WebElement scrollDown = driver.findElement(By.xpath("(//div[@class='post-header'])[5]"));
	executor.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	driver.switchTo().frame(3);
							
	WebElement adv = driver.findElement(By.xpath("//iframe[@id='aswift_3']"));
	adv.click();
	
//driver.quit();
}
}