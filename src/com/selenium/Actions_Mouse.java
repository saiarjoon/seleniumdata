package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[1]/ul/li[1]/a"));
		act.moveToElement(men).build().perform();
		Thread.sleep(3000);
		
		WebElement watches = driver.findElement(By.xpath("//a[@title='Watches']"));
		act.click(watches).build().perform();
		Thread.sleep(3000);
		
		
		
		

		
	}

}
