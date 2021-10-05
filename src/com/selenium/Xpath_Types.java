package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Types {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Title : " +title);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension size = new Dimension(1000,6000);
		driver.manage().window().setSize(size);
		driver.navigate().to("https://www.facebook.com/");
		WebElement na = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		na.click();
		Thread.sleep(3000);
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("Usha");
		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys("Rani");
		Thread.sleep(3000);
		WebElement mob = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mob.sendKeys("9876543230");
		Thread.sleep(3000);
		WebElement npw = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		npw.sendKeys("harshitha");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("8");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(9);
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1971");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("//label[@class='_58mt'][1]"));
		gender.click();
		Thread.sleep(3000);
		WebElement sub = driver.findElement(By.xpath("//button[@name='websubmit']"));
		sub.click();
		Thread.sleep(3000);
		
		TakesScreenshot shot = (TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\Screenshots\\error.PNG");
		FileUtils.copyFile(source, destination);
		File destination1 = new File("C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\Screenshots\\error.jpeg");
		FileUtils.copyFile(source, destination1);
		
		
		
	}
	

}
