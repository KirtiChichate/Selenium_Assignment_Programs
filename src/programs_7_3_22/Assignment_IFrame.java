package programs_7_3_22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_IFrame {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame("moneyiframe");
		Thread.sleep(1000);
		 WebElement Money = driver.findElement(By.xpath("//span[text()='NSE']"));
		
		Thread.sleep(1000);
		Money.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Enter the text");
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(500);
		submit.click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
