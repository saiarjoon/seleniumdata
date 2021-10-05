package com.selenium;
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Robot_Windows {
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Actions act = new Actions(driver);
			Robot rob = new Robot();
			Thread.sleep(3000);
			
			WebElement electronics = driver.findElement(By.linkText("Electronics"));
			act.contextClick(electronics).build().perform();
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
			WebElement customer_service = driver.findElement(By.linkText("Customer Service"));
			act.contextClick(customer_service).build().perform();
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
			WebElement amazon_pay = driver.findElement(By.linkText("Amazon Pay"));
			act.contextClick(amazon_pay).build().perform();
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

}
	}
