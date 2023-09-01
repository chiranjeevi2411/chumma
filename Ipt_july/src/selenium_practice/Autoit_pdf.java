package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit_pdf {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.manage().window().maximize();
		WebElement Selectpdfopt = driver.findElement(By.xpath("//a[@title='Add more files']"));
		Selectpdfopt.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\AutoIt\\Evr.exe");
		System.out.println(driver.getTitle());
		
	}

}
