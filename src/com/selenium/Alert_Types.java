package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.dhrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert.click();
		
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		WebElement alert_ok_cancel = driver.findElement(By.xpath("(//a[@class='analystic'])[2] "));
		alert_ok_cancel.click();
		Thread.sleep(3000);
		
		WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirm.click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		WebElement alerttextbox = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		alerttextbox.click();
		Thread.sleep(3000);
		
		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompt.click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Usharani");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.irctc.co.in/");
		Thread.sleep(3000);
		
		WebElement irctc_ok = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		irctc_ok.click();
		
		
		

		
		
		
		
		
		
		
	}

}
