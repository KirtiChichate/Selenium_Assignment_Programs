package programs_15_3_22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//find the element of locator
/*	WebElement element = driver.findElement(By.xpath(""));
	     Thread.sleep(500);  */
		
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		Thread.sleep(1000);
		JSE.executeScript("window.scollBy(0,3000)");
		Thread.sleep(1000);
		JSE.executeScript("window.scollBy(0,-500)");
		
//		JSE.executeScript("arguments[0].ScrollIntoView();", element);
		

	}

}
