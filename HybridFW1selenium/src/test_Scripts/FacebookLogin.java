package test_Scripts;

import org.testng.annotations.Test;

import generic_Scripts.Base_Test;
import pom_Scripts.Pom1;

public class FacebookLogin extends Base_Test
{
  @Test
  public void Test1() throws InterruptedException
  { 
      Pom1 p=new Pom1(driver);
      p.passUn("8970972101");
	  p.passPwd("#Kspooja3");
	  Thread.sleep(2000);
	  p.clickBtn();
  }
}
