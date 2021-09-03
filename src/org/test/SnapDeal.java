package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.get("https://www.snapdeal.com/login");

WebElement mobileNub = driver.findElement(By.id("userName"));
mobileNub.sendKeys("1312232");
driver.quit();





}
}
