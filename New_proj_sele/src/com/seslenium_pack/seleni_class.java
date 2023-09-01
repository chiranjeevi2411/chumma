package com.seslenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleni_class {

	public static void main(String[] args) throws Exception {
     
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		String title = driver.getTitle();
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("https://www.rediff.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.get("https://www.yahoo.com/");
		//driver.quit();
		String title1 = driver.getTitle();
		System.out.println(title1);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		
		 
	}

}
