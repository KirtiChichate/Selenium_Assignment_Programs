package programs_29_3_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Page3_Class3 {

	@FindBy(xpath="//span[text()='HD5857']") private WebElement HomeID;
	@FindBy(xpath="//a[@target=\"_self\"]") private WebElement ClickLogout;
	
	
	public POM_Page3_Class3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void validateID()
	{
		String ActualId = HomeID.getText();
		String ExpectedId= "HD5857";
		if(ExpectedId.equals(ActualId))
		{
			System.out.println("Tc is Matching,so it is passed");
		}
		else
		{
			System.out.println("TC is Not matching , so it is not passed");
		}
	}
	
	public void clicklogout()
	{
		ClickLogout.click();
	}
	
	
}
