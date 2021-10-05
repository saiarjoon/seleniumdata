package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement all_Options = driver.findElement(By.id("multi-select"));
		Select s = new Select(all_Options);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		for(WebElement web : options) {
			String text = web.getText();
			System.out.println(text);	
		}
		
		System.out.println("***Size of Options***");
		int size1 = options.size();
		System.out.println(size1);
		
		for(int i=0;  i < size1; i++) {
			if(i==1 || i==3 || i==7) {
				s.selectByIndex(i);
			}
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement WebElement : allSelectedOptions) {
			String text = WebElement.getText();
			System.out.println(text);
		}
		
		WebElement fso = s.getFirstSelectedOption();
		String text = fso.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		WebElement dbyindex = driver.findElement(By.id("multi-select"));
	Select selectbyindex = new Select(dbyindex );
	selectbyindex.selectByIndex(1);
	selectbyindex.deselectByIndex(1);
	Thread.sleep(3000);
	
	WebElement dbyvalue = driver.findElement(By.id("multi-select"));
	Select selectbyvalue = new Select(dbyvalue );
	selectbyvalue.selectByValue("New York");
	selectbyvalue.deselectByValue("New York");
	Thread.sleep(3000);
	
	WebElement dbyvt = driver.findElement(By.id("multi-select"));
	Select selectbyvt = new Select(dbyvt );
	selectbyvt.selectByVisibleText("Ohio");
	selectbyvt.deselectByVisibleText("Ohio");
	Thread.sleep(3000);
	
	WebElement deselectall = driver.findElement(By.id("multi-select"));
	s.deselectAll();

	
	
	}

}
