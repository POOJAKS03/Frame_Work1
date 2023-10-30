package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_Scripts.Base_Test;
import generic_Scripts.GenericScreenshot;
import generic_Scripts.GeniricReadExcel;
import pom_Scripts.Pom2WebForm;

public class TestScript1 extends Base_Test 
{
   @Test
   public void test() throws InterruptedException, IOException
   {    
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	   Pom2WebForm p=new Pom2WebForm(driver);
	   p.passFN(GeniricReadExcel.Fetch_Data("Sheet2",0,0));
	   Thread.sleep(2000);
	   p.passLN(GeniricReadExcel.Fetch_Data("Sheet2",1,0));
	   Thread.sleep(2000);
	   p.passEmail(GeniricReadExcel.Fetch_Data("Sheet2",2,0));
	   Thread.sleep(2000);
	   p.passWord(GeniricReadExcel.Fetch_Data("Sheet2",3,0));
	   Thread.sleep(2000);
	   p.clickBtn();
	   
	  
	   
   }
}
