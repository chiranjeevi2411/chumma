package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Program {

	public static void main(String[] args)  {
	
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	     List<WebElement> TotalBooks = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
         System.out.println("Total books===>"+ TotalBooks.size() );
         for (WebElement Book : TotalBooks) {
			String Titles = Book.getText();
			System.out.println(Titles);
		}
         
         WebElement parebook = driver.findElement(By.xpath("(//img[@class='s-image'])[10]"));
         parebook.click();
      // driver.close();
         try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       //driver.quit();
	}

}
