package generic_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements FrameWorkConst
{
	public WebDriver driver;
	   @BeforeMethod
	   public void openAppn()
	   {
		   System.setProperty(Gecko_Key,Gecko_Value);
		   driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	   }
	   @AfterMethod
	   public void closeAppn()
	   {
		   driver.close();
	   }
}
