package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
	driver.manage().window().maximize();
	
	List<WebElement> alldatas = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement webelement:alldatas) {
		String text = webelement.getText();
		System.out.println(text);
	}
	
	System.out.println("------------------------------------");
		
	List<WebElement> rowdatas= driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
	for (WebElement webelement:rowdatas) {
		String text = webelement.getText();
		System.out.println(text);
		
	}
	
	System.out.println("------------------------------------");
		
	
List<WebElement> columndatas= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
for (WebElement webelement : columndatas) {
	String text = webelement.getText();
	System.out.println(text);
	
}
System.out.println("------------------------------------");

  WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[6]/td[3]"));
  System.out.println(particular.getText());
  
  System.out.println("------------------------------------");
  
  List<WebElement> task = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
  int size = task.size();
  for (int i = 0; i <size; i++) {
	String text = task.get(i).getText();
   System.out.println(text);
	  if (i==4) {
		  break;
		
	}
	 
	
}
}
}
		



		

	
	
	

