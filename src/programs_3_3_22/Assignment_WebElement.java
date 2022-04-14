package programs_3_3_22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='HOME ']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement type = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		JSE.executeScript("arguments[0].scrollIntoView();",type);
		
		type.click();
		Thread.sleep(1000);
		type.sendKeys("Type a text");
		
/*		Thread.sleep(1000);
		WebElement display = driver.findElement(By.className("inputs displayed-class"));
		boolean Displaystatus = display.isDisplayed();
		System.out.println("Status of is displayed "+Displaystatus);
		
		Thread.sleep(1000);
		WebElement select = driver.findElement(By.className("checkBoxOption1"));
		boolean Selectstatus = select.isSelected();
		System.out.println("Status of is selected "+Selectstatus);
*/ //till this something wrong
		//Exception in thread "main" org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
	}

}
