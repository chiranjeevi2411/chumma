package Jan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_han {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe" );

     WebDriver driver = new ChromeDriver();
     driver.get("https://www.tamilnadutourism.tn.gov.in/");
		driver.manage().window().maximize();
     

	}

}
