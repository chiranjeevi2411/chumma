package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_locators {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("samsung mobiles");
		Thread.sleep(3000);
		searchbox.clear();
		searchbox.sendKeys("iphone14");
		Thread.sleep(3000);
		searchbox.clear();
		WebElement hi = driver.findElement(By.id("nav-logo-sprites"));
		hi.click();
		WebElement wel = driver.findElement(By.id("nav-cart-count"));
		wel.click();
		WebElement searchbox1 = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox1.sendKeys("apple mobiles");
		searchbox1.clear();
		WebElement hi1 = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(3000);

		hi1.click();
		String title = driver.getTitle();
		System.out.println(title);
		
	driver.navigate().refresh();

	}

}
