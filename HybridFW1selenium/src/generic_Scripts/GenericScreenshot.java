package generic_Scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericScreenshot 
{
   public static void getPhoto(WebDriver driver) throws IOException 
   {
	   String photo="./photos";
	   Date d=new Date();
	   String d1=d.toString();
	   String d2=d1.replaceAll(":","-");
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File dst=new File(d2+photo+".jpeg");
	   FileHandler.copy(src, dst);
	   }
       }
