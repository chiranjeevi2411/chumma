package Jan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAkesc {

	public static void main(String[] args) throws IOException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\TAKESCREEN\\tsc.png");
		FileUtils.copyFile(source,dest);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is ====> "+ currentUrl);
		close.click();
		driver.quit();
		

	}

}
