package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	public static void main(String[] args) {
		int country_index, total_cases_index , total_death_cases ;
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		//maximize
		driver.manage().window().maximize();
		List<WebElement> all_headings = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int j = 0; j < all_headings.size(); j++) {
			String text = all_headings.get(j).getText();
			
			text= text.replaceAll("\n" ,  "");
			System.out.println(text);
			
			if (text.contains("Country")) {
				country_index=j;
				System.out.println("Country index =" +country_index);
				
			}
			else if (text.equals("Total Cases")) {
				total_cases_index = j;
				System.out.println("Total Cases index =" + total_cases_index);
				
				
			}
			else if (text.equalsIgnoreCase("Total Deaths")) {
				total_death_cases = j;
				System.out.println("Total Deaths =" + total_death_cases);
				
				
				
		
			
				

			}
			} 
	}
	}

			
			
		
	


