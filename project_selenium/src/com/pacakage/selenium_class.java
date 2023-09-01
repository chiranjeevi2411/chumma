package com.pacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            
            driver.get("https://www.delhi.com");
            
	}

}
