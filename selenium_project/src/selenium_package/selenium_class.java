package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_class {

	public static void main(String[] args) throws Exception  {
		//System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.kvb.co.in/");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		driver.get("https://www.rediffmail.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		
		
	}
	
}
