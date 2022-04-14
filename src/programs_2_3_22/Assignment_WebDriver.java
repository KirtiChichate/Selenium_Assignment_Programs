package programs_2_3_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_WebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.booking.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-decider-header='flights']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		String showtitle = driver.getTitle();
		System.out.println("Title of booking.com is "+showtitle);
		Thread.sleep(1000);
		String showurl = driver.getCurrentUrl();
		System.out.println("url of booking.com is "+showurl);
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		
		WebDriver driver2= new ChromeDriver();
		driver2.navigate().to("https://vctcpune.com/selenium/practice.html#");
		Thread.sleep(1000);
		driver2.quit();
		
//		WebDriver driver2= new ChromeDriver();
//		driver2.navigate().to("https://vctcpune.com/selenium/practice.html#");
		

	}


	

}
