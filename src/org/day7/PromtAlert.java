package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromtAlert {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	  alert.click();
	  
	 WebElement cliclkButon = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	 cliclkButon.click();
	 
	 WebDriverWait wait= new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.alertIsPresent());
	
	 //screenShot
//	 TakesScreenshot screenshot=(TakesScreenshot)driver;
//	File source = screenshot.getScreenshotAs(OutputType.FILE);
//	File dest= new File("E:\\alert.jpg");
//	
	//	FileUtils.copyFile(source, dest);
	 Alert alert2 = driver.switchTo().alert();
	 alert2.sendKeys("java application");
	 String text = alert2.getText();
	 System.out.println(text);
	 
	 
	 alert2.accept();
	 driver.quit();
	

}}
