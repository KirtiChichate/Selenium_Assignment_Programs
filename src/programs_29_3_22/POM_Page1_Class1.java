package programs_29_3_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Page1_Class1 {

//Step1)--->declare data member globally by using access level private by using @FindBy annovatation
		@FindBy(id="userid") private WebElement UserID;
	    @FindBy(id="password") private WebElement Pass;
	    @FindBy(xpath="//button[text()='Login ']") private WebElement ClickLogin;
	
	
//Step2)---> initialize constructor with having access level as public by using pagefactory class
	    public void POM_Page1_Class1(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
//Step3)--->Declare methods as a each element inside it
	    
	    public void enteruserID()
	    {
	    	UserID.sendKeys("HD5857");
	    }
	
	    public void enterPass()
	    {
	    	Pass.sendKeys("Ajinkya@123");
	    }
	
	    public void clicklogin()
	    {
	    	ClickLogin.click();
	    }
}
