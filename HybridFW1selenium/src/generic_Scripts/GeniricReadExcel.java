package generic_Scripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GeniricReadExcel 
{
   public static String Fetch_Data(String sheet, int row, int cel)
   {
	   String val1="";
	   try
	   {
		 FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		 Sheet sh = book.getSheet(sheet);
		 Row ro = sh.getRow(row);
		 Cell ce = ro.getCell(cel);
		 val1 = ce.toString();
		
	   }
	   catch(Exception e)
	   {
		 System.out.println("unable to open");  
	   }
	return val1;
   }
}
