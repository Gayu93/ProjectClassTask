package org.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	
	static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName) {
		switch(browserName) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
			
			}
		
		return driver;
		

	}
	
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static void maximize() {
		driver.manage().window().maximize();

	}
	
	public static void minimize() {
		driver.manage().window().minimize();

	}
	
	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}
	

}
