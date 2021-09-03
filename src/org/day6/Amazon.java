package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions actions= new Actions(driver);
		
		Thread.sleep(2000);
		WebElement linkprime = driver.findElement(By.xpath("//span[text()='Prime']"));
		actions.moveToElement(linkprime).perform();
		
		Thread.sleep(2000);

		WebElement freeDelivary= driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		freeDelivary.click();
	}

}
