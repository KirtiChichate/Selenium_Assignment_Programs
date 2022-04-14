package extra_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position_Size_Scrolling_Screenshot {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://holidayz.makemytrip.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		JavascriptExecutor JS = ((JavascriptExecutor)driver);
		JS.executeScript("window.scrollBy(500,800)");
		Thread.sleep(500);
		
		WebElement Singp = driver.findElement(By.xpath("//p[text()='Singapore']"));
		JS.executeScript("arguments[0].scrollIntoView();",Singp);
		Thread.sleep(500);
		
		//to set position create point class
		Point pn= new Point(100, -50);
		Thread.sleep(500);
		driver.manage().window().setPosition(pn);
		Thread.sleep(1000);
		
		//to set size create dimension class
		Dimension Di= new Dimension(-1000, -600);
		Thread.sleep(500);
		driver.manage().window().setSize(Di);

	}

}
