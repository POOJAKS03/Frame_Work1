package test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class IncognitoLaunch 
{
  @Test
  public void test1()
  {
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	  FirefoxOptions opt=new FirefoxOptions();
	  opt.addArguments("--incognito");
	  WebDriver driver=new FirefoxDriver(opt);
	  driver.get("https://www.google.com");
  }
}
