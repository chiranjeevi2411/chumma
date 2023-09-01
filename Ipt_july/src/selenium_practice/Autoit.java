package selenium_practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("pickfiles")).click();
		 Thread.sleep(3000);
		 Runtime.getRuntime().exec("C:\\AutoIt\\New123.exe");
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
		 
	}

}
