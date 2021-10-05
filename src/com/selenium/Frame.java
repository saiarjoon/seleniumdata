package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement single_frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		 driver.switchTo().frame(single_frame);
		
		 WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		 text.sendKeys("kamala");
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 
		 WebElement iframe = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		 iframe.click();
		 
        WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerframe);
        
        WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerframe);
        
        WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		 text1.sendKeys("usha");
		 
		 driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 
		 WebElement home = driver.findElement(By.xpath("//a[@href='Index.html']"));
		 home.click();
		 
		
		 
		 
		 
        
        
		 
		 
		 
		
	}
	

}
