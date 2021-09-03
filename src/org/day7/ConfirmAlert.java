package org.day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	  alert.click();
	  
	 WebElement cliclkButon = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	 cliclkButon.click();
	 
	 Thread.sleep(2000);
	 Alert alert2 = driver.switchTo().alert();
	 alert2.dismiss();
	// driver.quit();
	 
	 
	 
}}
