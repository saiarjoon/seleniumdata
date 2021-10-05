package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_hold {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/drop.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	Actions act = new Actions(driver);
	WebElement from_ele = driver.findElement(By.id("draggable"));
	WebElement to_ele = driver.findElement(By.id("droppable"));
	act.clickAndHold(from_ele).moveToElement(to_ele).release().build().perform();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
}

}
