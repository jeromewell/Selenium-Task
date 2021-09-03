package org.day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	WebElement newAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	newAcc.click();

	//webdriver wait----------explicity wait
	WebDriverWait driverWait=new WebDriverWait(driver, 30);
			WebElement until = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='First name']")));
	until.sendKeys("jerome");
	
	//driver.quit();
	
	
}
}