package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-SG\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title : " +title);
		driver.navigate().to("https://www.facebook.com/");
		WebElement name = driver.findElement(By.id("email"));
	    name.sendKeys("usha");
	    Thread.sleep(3000);
	    WebElement pass = driver.findElement(By.id("pass"));
	    pass.sendKeys("12345");
	    Thread.sleep(3000);
	    WebElement log = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
	    log.click();
	    Thread.sleep(3000);
	    WebElement fn = driver.findElement(By.name("firstname"));
	    fn.sendKeys("usha");
	    Thread.sleep(3000);
	    WebElement ln = driver.findElement(By.name("lastname"));
	    ln.sendKeys("rani");
	    Thread.sleep(3000);
	    WebElement re = driver.findElement(By.name("reg_email__"));
	    re.sendKeys("123456789");
	    Thread.sleep(3000);
	    WebElement npd = driver.findElement(By.name("reg_passwd__"));
	    npd.sendKeys("987654321");
	    boolean checker = npd.isEnabled();
	    System.out.println(checker);
	    Thread.sleep(3000);
	    WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input"));
	    gender.click();
	    boolean checker1 = gender.isSelected();
	    System.out.println(checker1);
	    
	    
	    		
	    
		
	

	}
}
