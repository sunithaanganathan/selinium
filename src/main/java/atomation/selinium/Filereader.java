package atomation.selinium;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Filereader {
	 String filepath = "C:\\Users\\sunit\\OneDrive\\Documents\\input.xls";
	 
	 public void ReadData()throws IOException
	 {
		 File F =new File (filepath);
		 Sheet sheet;
		for (int i = 0; i < array.length; i++) {
			FileInputStream FS = new FileInputStream(F);
			HSSFWorkbook Workbook = new HSSFWorkbook(FS);
			sheet = Workbook.getSheet("login");
		}
		 
		 int totalRows=sheet.getPhysicalNumberOfRows();
		 for(int i=0;i<totalRows;i++)
		 {
			 Row inputRow=sheet.getRow(i);
			 int totalColumn=inputRow.getLastCellNum();
			 for(int j=0;j<totalColumn;j++)
			 {
				 Cell cellValue=inputRow.getCell(j);
				 String actualValue=cellValue.getStringCellValue();
				 System.out.print(actualValue);
				 System.out.print(" ");
			 }
			 System.out.println("");
				 
		     
		 }
	 }			 
		 
	 

	public static void main(String[] args) throws IOException {
		Filereader F=new Filereader();
		F.ReadData();
		
	}

}
