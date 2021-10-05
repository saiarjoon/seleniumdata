package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get( "https://www.myntra.com/" );
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title :" +title);
		Thread.sleep(4000);
		driver.navigate().to("https://meesho.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL :" +currentUrl);
		Thread.sleep(5000);
		driver.navigate().back();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);	
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().forward();	
		driver.close();
		driver.quit();
		
		
		
				

				
	}

}
