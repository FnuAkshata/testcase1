package com.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://akshata//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ecommerce.saipratap.net/customerlogin.php");
		
		driver.findElement(By.name("email")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
		
//		Thread.sleep(3000);
		
		
		driver.close();
	}

}
