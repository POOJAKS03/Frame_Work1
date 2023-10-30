package test_Scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generic_Scripts.FrameWorkConst;

public class MultiDataWrite 
{
  @Test
  public void writedata() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
	  Workbook book = WorkbookFactory.create(fis);
	  Sheet sh = book.getSheet("Sheet1");
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   List<WebElement> links = driver.findElements(By.xpath("//a"));
	   int count = links.size();
	   for(int i=0;i<count;i++)
	   {
		   WebElement link = links.get(i);
		   String value = link.getAttribute("href");
		   Row ro = sh.createRow(i);
		   Cell cell = ro.createCell(0);
		   cell.setCellValue(value);
		   Thread.sleep(10);
	   }
	  FileOutputStream fout=new FileOutputStream("./excel/Book1.xlsx");
	  book.write(fout);
  }
}
