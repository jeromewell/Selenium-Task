package org.day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	WebElement closeElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	closeElement.click();
	WebElement home = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[4]"));
	home.click();
	
	Actions actions=new Actions(driver);
	
	Thread.sleep(2000);
	WebElement homeAndFurniture = driver.findElement(By.xpath("(//span[text()='Home & Furniture'])"));
	actions.moveToElement(homeAndFurniture).perform();
	
	Thread.sleep(2000);
	WebElement towel = driver.findElement(By.xpath("(//a[text()='Bath Towels'])[1]"));
	towel.click();
	Thread.sleep(2000);
	
	}

}
