package Feb;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Feb_San\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is ===>"+ "  "+ currentUrl);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("chiranjeevi12");
		
		driver.findElement(By.id("password")).sendKeys("twenty");
		driver.findElement(By.id("login")).click();
		
		
		
		
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select locations = new Select(location);
		locations.selectByValue("London");
		boolean multiple = locations.isMultiple();
		System.out.println(multiple);
		
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select hotel = new Select(Hotel);
		hotel.selectByIndex(2);
		System.out.println("=======");
		
		
		WebElement Roomtype = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select room = new Select (Roomtype);
		room.selectByVisibleText("Deluxe");
		List<WebElement> options = room.getOptions();
		for (WebElement rrr : options) {
		System.out.println(rrr.getText());
	    }
		
		System.out.println("=======");
		
		WebElement noofroom = driver.findElement(By.name("room_nos"));
		Select roono = new Select (noofroom);
		roono.selectByValue("7");
		
		driver.findElement(By.id("datepick_in")).sendKeys("17/02/2023");
		
		driver.findElement(By.id("datepick_out")).sendKeys("20/02/2023");
		
		WebElement Adultroom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select adroom = new Select(Adultroom);
		adroom.selectByValue("3");
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select cdroom = new Select (childroom);
		cdroom.selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DURAI\\eclipse-workspace\\Feb_San\\Takessc.png");
		FileUtils.copyFile(source, des);
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.className("reg_input")).sendKeys("Chiran");
		
		driver.findElement(By.id("last_name")).sendKeys("jeevi");
		
		driver.findElement(By.className("txtarea")).sendKeys("NO;47, MGR NAGAR MAIN RD,CHENNAI - 70");
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567891023456");
		
		WebElement cardtype = driver.findElement(By.className("select_combobox"));
		Select cdtype = new Select(cardtype);
		cdtype.selectByValue("MAST");
		
		
		
		WebElement expiry = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select exp = new Select(expiry);
		exp.selectByVisibleText("August");
		List<WebElement> month = exp.getOptions();
		for (WebElement months : month) {
			System.out.println(months.getText());
		}
		
		
		
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select expy = new Select (expyear);
		expy.selectByIndex(12);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("4321");
		
		driver.findElement(By.name("book_now")).click();
		
		Thread.sleep(5000);
		
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollTo(0,300)");
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\DURAI\\eclipse-workspace\\Feb_San\\Takessc1.png");
		FileUtils.copyFile(source1,Des);
		
		System.out.println("=======");
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("final url is ====>"+ "  " +currentUrl2);
		
		driver.close();
		
		
	}
}
