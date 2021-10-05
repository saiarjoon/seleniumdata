package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		Thread.sleep(3000);
		 driver.manage().window().maximize();
		 
		 Actions act = new Actions(driver);
		 WebElement women = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		 act.moveToElement(women).build().perform();
		 
		 WebElement casual = driver.findElement(By.xpath("//a[@title='Casual Dresses'][1]"));
		 act.click(casual).build().perform();
		 Thread.sleep(3000);
		 
		 JavascriptExecutor j = (JavascriptExecutor) driver;
		 j.executeScript("window.scroll(0,800)", "");
		 
		
		 WebElement print_dress = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
		 act.click().build().perform();
		 Thread.sleep(2000);
		 
		 WebElement add2cart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span"));
		 act.click(add2cart).build().perform();
		 Thread.sleep(2000);
		 
		 
		 WebElement proceed = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
		 act.click(proceed).build().perform();
		 Thread.sleep(2000);
		 
		 
		 WebElement proceed2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
		 act.click(proceed2).build().perform();
		 
		 WebElement email = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
		 email.sendKeys("xyz123abc@gmail.com");
		 
		 WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
		 password.sendKeys("123456789");
		 
		 WebElement signin = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button"));
		 signin.click();
		 
		 WebElement proceed3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
		 proceed3.click();
		 

		 WebElement terms = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
		 act.click(terms).build().perform();
	
		 
		 WebElement proceed4 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
		 proceed4.click();
		 
		 WebElement cheque = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
		 cheque.click();
		 
		 
		 WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
		 confirm.click();
	}

}
