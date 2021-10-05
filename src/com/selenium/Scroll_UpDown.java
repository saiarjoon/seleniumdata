package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//particular  place
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1200)", "");
		Thread.sleep(3000);
		
		//bottom page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		
		//return to top
		js.executeScript("window.scroll(0,0)", "");
		Thread.sleep(3000);
		
		//specific element
		WebElement Todays_Deals = driver.findElement(By.xpath("//h2[@class='a-color-base as-title-block-left']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Todays_Deals);
		Thread.sleep(3000);
	    
	    
	
	}
	

}
