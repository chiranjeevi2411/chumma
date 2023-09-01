package selenium_2ndpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_2ndclass {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();

    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
     String title=driver.getTitle();
     System.out.println(title);
     driver.navigate().to("https://www.rediffmail.com/");
     driver.get("https://www.sportschannel.com/");

Thread.sleep(4000);
driver.navigate().back();
driver.navigate().forward();
Thread.sleep(4000);
driver.navigate().refresh();
	}

}
