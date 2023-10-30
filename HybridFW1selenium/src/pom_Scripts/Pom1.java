package pom_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generic_Scripts.Base_page;

public class Pom1 extends Base_page 
{
  
@FindBy(id="email")
  private WebElement untext;
  @FindBy(id="pass")
  private WebElement pwdtext;
  @FindBy(name="login")
	private WebElement logbtn;
	
	public Pom1(WebDriver driver)
	{
		super(driver);
	}

	public void passUn( String email)
	{
		untext.sendKeys(email);
	}
	public void passPwd( String pass) 
	{ 
		pwdtext.sendKeys(pass);
	}
	public void clickBtn()
	{
		logbtn.click();
	}

}

