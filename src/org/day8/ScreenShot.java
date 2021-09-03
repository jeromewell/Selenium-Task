package org.day8;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROME\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		//type cast 
			TakesScreenshot tc= (TakesScreenshot)driver;
			File source = tc.getScreenshotAs(OutputType.FILE);
			
			File des= new File("E:\\jeromescreen.jpg");
			
			FileUtils.copyFile(source, des);
			driver.close();
	}

}
