package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelect{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JEROME\\eclipse-workspace\\JeganSelenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement newAcc= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			newAcc.click();
			Thread.sleep(2000);
			
			WebElement year = driver.findElement(By.xpath("(//select[@name='birthday_year'])"));
		
			Thread.sleep(2000);
			Select select=new Select(year);
			select.selectByIndex(2);
			
		
		List<WebElement> options = select.getOptions();
		WebElement webElement = options.get(3);
		String text = webElement.getText();
		System.out.println(text);
		driver.quit();
			
			
			
}}
