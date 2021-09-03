package org.day10;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement findElement2 = driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])"));
		findElement2.click();
		//MOUSE OVER ACTION
		Actions actions= new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[2]"));
		actions.moveToElement(findElement).perform();
		
		WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
		actions.moveToElement(findElement3).perform();
		
		WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Laptop Keyboards']"));
		actions.moveToElement(findElement4).perform();
		actions.click(findElement4).perform();
		//SCROLL DOWN
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		WebElement findElement5 = driver.findElement(By.xpath("//a[text()='PRODOT kb-207s USB Keyboard with Mouse Wired USB Laptop...']"));
		js.executeScript("arguments[0].scrollIntoView(true)", findElement5);
		Thread.sleep(3000);
		WebElement key = driver.findElement(By.xpath("//h1[text()='Keyboards']"));
		js.executeScript("arguments[0].scrollIntoView(false)", key);
		
		//CLICK PRODUCT
		Thread.sleep(3000);
		WebElement findElement6 = driver.findElement(By.xpath("//a[text()='PRODOT kb-207s USB Keyboard with Mouse Wired USB Laptop...']"));
		findElement6.click();
		
		//NOW OPEN NEW WINDOW
		//find the parent window id
		String pwin = driver.getWindowHandle();
		System.out.println(pwin);
		//find allwindow id
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		for (String string : allWin) {
			if (pwin!=string) {
				driver.switchTo().window(string);
			}
		}
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Brand Directory']"));
		js.executeScript("arguments[0].scrollIntoView(true)", link);
		Thread.sleep(2000);
		//childWindow1
		WebElement link2 = driver.findElement(By.xpath("(//a[@title='Agrima A 55 A 55 USB Hub'])[2]"));
		link2.click();
		

		Set<String> set = driver.getWindowHandles();
		System.out.println(set);
		int count=0;
		for (String all : set) {
			if (count==2) {
				driver.switchTo().window(all);
			}
			count++;
		}
		WebElement scrrolDown = driver.findElement(By.xpath("//div[text()='You might be interested in']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrrolDown);
		//child window 2
		WebDriverWait wait=new  WebDriverWait(driver, 30);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='QUANTUM QUANTUM 4 PORT HUB QHM 6660 USB Hub']")));
		until.click();
	
		Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
		List<String> li= new ArrayList<>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(3));
		//take screenshots
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File sourse = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\flipcart.jpg");
		
		FileUtils.copyFile(sourse, des);
		
		
	WebElement until2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='BUY NOW']")));
	until2.click();
	
	driver.switchTo().window(pwin);
		
		
		//driver.quit();
		
		

		}
	}
	

