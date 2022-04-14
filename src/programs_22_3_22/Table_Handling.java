package programs_22_3_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		 int columnSize = driver.findElements(By.xpath("//table[@class='ws-table-all']//th")).size();
		 System.out.println("The columnsize of full table: "+columnSize);
		 
		int Rowsize = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr")).size();
		System.out.println("The Rowsize of full table: "+Rowsize);
		
		for(int i=1; i<=Rowsize; i++)
		{
			for(int j=1; j<=columnSize; j++)
			{
				String Text;
				if(i==1)
				{
				  Text = driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+i+"]//th["+j+"]")).getText();
				  System.out.print(Text+" ");
				}
				else
				{
					Text = driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(Text+" ");
				}
			}
			
			System.out.println();
		}

	}

}
