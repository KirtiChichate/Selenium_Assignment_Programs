package programs_29_3_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_TestClass {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		POM_Page1_Class1 obj1= new POM_Page1_Class1();
		obj1.enteruserID();
		obj1.enterPass();
		obj1.clicklogin();
		
		POM_Page2_Class2 obj2= new POM_Page2_Class2(driver);
		obj2.enterpin();
		obj2.clickcontinue();
		
		POM_Page3_Class3 obj3= new POM_Page3_Class3(driver);
		obj3.validateID();
		obj3.clicklogout();

	}

}
