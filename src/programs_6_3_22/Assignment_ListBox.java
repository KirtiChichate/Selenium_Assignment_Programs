package programs_6_3_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_ListBox {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Dresses'])[2]")).click();
		Thread.sleep(1000);
	    WebElement sort = driver.findElement(By.id("selectProductSort"));
	    Thread.sleep(1000);
	    sort.click();
		Thread.sleep(1000);
		Select pro= new Select(sort);
		Thread.sleep(1000);
		pro.selectByVisibleText("Price: Highest first");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("")).click();

	}

}
