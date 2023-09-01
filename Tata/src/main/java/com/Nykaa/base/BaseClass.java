package com.Nykaa.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 public static WebDriver driver;
	
	public static void browserLaunch(String browsername) {

		if(browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		
		}
		driver.manage().window().maximize();
		}
       public static void LaunchUrl(String url) {
		driver.get(url);
	}	
       public static void elementClick(WebElement element) {
         element.click();
	}
       public static void elementInput(WebElement element, String input) {
    	   
		element.sendKeys(input);
		}
       
      
       public static void implicit() {
    	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       }
       
       public static void title() {
    	   System.out.println(driver.getTitle());
       }
       
       public static void  threadsleep(int a) throws InterruptedException {
    	   
    	   Thread.sleep(a);
       }
       
       public void ScreenShot(String fileName) {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\DURAI\\eclipse-workspace\\Tata\\screenshots\\"+fileName+".png");
	    try {
			FileHandler.copy(src,dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
       }
       
}
