package Aug16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelDemo {
	
	@Test
	public void testExcel() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		File path=new File(System.getProperty("user.dir")+"/Data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String value=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
		//Write into file
		wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Sunil");
		File path1=new File(System.getProperty("user.dir")+"/Data/TestData1.xlsx");
		wb.write(new FileOutputStream(path1));
		wb.close();
		
	}

}
