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

public class New_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Feb_San\\new_chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
        System.out.println(title);
        
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("chiranjeevi12");
        driver.findElement(By.id("password")).sendKeys("twenty");           //Login page
        driver.findElement(By.xpath("//input[@type='Submit']")).click();
        
        WebElement Location = driver.findElement(By.id("location"));
        Select locat = new Select (Location);
        locat.selectByVisibleText("New York");
        List<WebElement> options = locat.getOptions();
        for (WebElement lock : options) {
		System.out.println(lock.getText());}
        System.out.println("========");
        
        WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
        Select hot = new Select (hotel);
        hot.selectByIndex(4);
        
        WebElement RoomType = driver.findElement(By.id("room_type"));
        Select RoomTy = new Select (RoomType);
        RoomTy.selectByValue("Standard");
        List<WebElement> roo = RoomTy.getOptions();
        for (WebElement ro : roo) {
        	System.out.println(ro.getText());
			}
        System.out.println("========");
        
        WebElement Noofroom = driver.findElement(By.name("room_nos"));
        Select noroom = new Select (Noofroom);
        noroom.selectByValue("3");
        
        driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("18/02/2023");
        driver.findElement(By.id("datepick_out")).sendKeys("20/02/2023");
        
        WebElement Adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
        Select room = new Select(Adroom);
        room.selectByValue("3");
        
        WebElement Childroom = driver.findElement(By.name("child_room"));
        Select Croom = new Select(Childroom);
        Croom.selectByVisibleText("2 - Two");
        
        driver.findElement(By.id("Submit")).click();
        
        TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DURAI\\eclipse-workspace\\Feb_San\\Takessc.png");
		FileUtils.copyFile(source, des);
        
        driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
        
        driver.findElement(By.className("reg_button")).click();
        
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
			System.out.println(months.getText());}
		
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select expy = new Select (expyear);
		expy.selectByIndex(12);
		
		
		driver.findElement(By.id("cc_cvv")).sendKeys("4321");
		
		driver.findElement(By.name("book_now")).click();
		
		Thread.sleep(6000);
		
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollTo(0,300)");
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\DURAI\\eclipse-workspace\\Feb_San\\Takessc1.png");
		FileUtils.copyFile(source1,Des);
		
		System.out.println("=======");
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("final url is ====>"+ "  " +currentUrl2);
		
		//driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		
		//driver.findElement(By.xpath("(//input[@class='reg_button'])[3]")).click();
		//driver.findElement(By.xpath("//a[@href='index.php']")).click();
		//driver.quit();
		}
	}
