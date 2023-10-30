package pom_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_Scripts.Base_page;

public class Pom2WebForm extends Base_page
{
  @FindBy(name="firstname")
  private WebElement fntext;
  @FindBy(name="lastname")
  private WebElement lntext;
  @FindBy(name="reg_email__")
  private WebElement emailtext;
  @FindBy(id="password_step_input")
  private WebElement passtext;
  @FindBy(name="websubmit")
  private WebElement subbtn;
  public Pom2WebForm(WebDriver driver)
  {
	  super(driver);
  }
	  public void passFN( String firstname)
		{
			fntext.sendKeys(firstname);
		}
		public void passLN( String lastname) 
		{ 
			lntext.sendKeys(lastname);
		}
		public void clickBtn()
		{
			subbtn.click();
		}
		 public void passEmail( String email)
			{
				emailtext.sendKeys(email);
			}
			public void passWord( String password) 
			{ 
				passtext.sendKeys(password);
			}
  }

