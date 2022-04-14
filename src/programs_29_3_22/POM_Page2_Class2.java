package programs_29_3_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Page2_Class2 {

	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement ClickContinue;
	
	
	public POM_Page2_Class2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterpin() 
	{
		Pin.sendKeys("969696");
	}
	
	public void clickcontinue()
	{
		ClickContinue.click();
	}
	
	
	
}
