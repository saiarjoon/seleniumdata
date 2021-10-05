package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Keyboard {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		Robot rob = new Robot();
		Thread.sleep(3000);
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		act.contextClick(mobiles).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement best_sellers = driver.findElement(By.linkText("Best Sellers"));
		act.contextClick(best_sellers).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		act.contextClick(fashion).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String s : windowHandles) {
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);	
		}
		String s = "Amazon.in Bestsellers: The most popular items on Amazon";	
		for (String ac : windowHandles) {
			if (driver.switchTo().window(ac).getTitle().equalsIgnoreCase(s)) {
				break;
				}
			
		}
		}
	}

		
		
		
		
		
	


