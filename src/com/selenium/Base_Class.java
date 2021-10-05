package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;
		
	
	public static void browser_Launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		
	}
	public static void input_Value(WebElement s,String s1) {
		s.sendKeys(s1);
		
		
	}
	public static void clickonElement(WebElement clk) {
		clk.click();
		
	}
	public static void close() {
driver.close();

	}
	public static void quit() {
		driver.quit();
		
	}
	public static void navigate_back() {
		driver.navigate().back();
		
	}
	public static void navigate_Forward() {
		driver.navigate().forward();
		
	}
	public static void navigate_To(String s) {
		driver.navigate().to(s);
			
	}
	public static void navigate_Refresh() {
		driver.navigate().refresh();
		
	}
	public static void Alert() {
		driver.switchTo().alert();
		
	}
	public static void get_Title(String s) {
		driver.getTitle();
		
	}
	public static void windows_Handles(String s) {
		driver.switchTo().window(s);
		
	}
	public static void screenshot(String despath) throws IOException {
		TakesScreenshot shot = (TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File("Location path.jpeg");
		FileUtils.copyFile(source, destination);
		
	}
	public static void enabled(WebElement Enable) {
		Enable.isEnabled();
		
	}
	public static void selected(WebElement Selected) {
		Selected.isSelected();
			
	}
	public static void displayed(WebElement Displayed) {
		Displayed.isDisplayed();
		
	}
	

}
