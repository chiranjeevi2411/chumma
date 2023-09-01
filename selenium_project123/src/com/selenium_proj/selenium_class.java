package com.selenium_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_class {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURAI\\eclipse-workspace\\selenium_project123\\Driver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
		
     driver.get("https://www.google.com/");
	//Thread.sleep(5000);
     driver.get("https://lipi.in/");
     
      String  title = driver.getTitle();
      System.out.println(title);
       String pagesource = driver.getPageSource();
       //System.out.println(pagesource);
         String windowHandle = driver.getWindowHandle();
      System.out.println(windowHandle);
      driver.navigate().to("https://www.google.com/");
      driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().refresh();
        
       String hello = driver.getTitle();
       System.out.println(hello);
        
        
     
	}

}
