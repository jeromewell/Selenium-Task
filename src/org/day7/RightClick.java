package org.day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");

	ChromeDriver driver= new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	
	WebElement linkGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	actions.contextClick(linkGmail).perform();	
	
	Robot robot=new Robot();
	
	//robot.keyPress(KeyEvent.VK_DOWN);
	//robot.keyRelease(KeyEvent.VK_DOWN);
	
	//robot.keyPress(KeyEvent.VK_ENTER);
	//robot.keyRelease(KeyEvent.VK_ENTER);	
	
	for (int i = 1; i <=6 ; i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
