package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		//maximize
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		List<WebElement> real_price = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < real_price.size(); i++) {
			String text = real_price.get(i).getText().substring(4);
			int parseInt = Integer.parseInt(text);
			a.add(parseInt);
			System.out.println(parseInt);
			}
		int size = a.size();
		System.out.println(size);
		System.out.println("Minimum price:" + Collections.min(a));
		

			
	}

}
