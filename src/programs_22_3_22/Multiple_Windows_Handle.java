package programs_22_3_22;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiple_Windows_Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> Alliterator = allWindow.iterator();
		
		String Mainpage = Alliterator.next();
		String childbrowserpage = Alliterator.next();
		
		
		
		driver.switchTo().window(childbrowserpage);  
		Thread.sleep(2000);
		
		String Text = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
//		WebDriverWait obj= new WebDriverWait(driver, Duration.ofMillis(1000));
//		obj.until(ExpectedConditions.textToBePresentInElementValue(By,Text));
		Thread.sleep(1000);
        System.out.println(Text);
	}

}
