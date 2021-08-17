package Aug17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelDemo {

	@Test
	public void testExcel() throws EncryptedDocumentException, FileNotFoundException, IOException {

		Workbook wb = WorkbookFactory
				.create(new FileInputStream(System.getProperty("user.dir") + "/Data/TestData2.xlsx"));
		Sheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		for (int i = 0; i <= rowCount; i++) {
			try {
				int colCount = sheet.getRow(i).getLastCellNum();

				for (int j = 0; j < colCount; j++) {
					try {
						String val = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(val + " ");
					} catch (Exception e) {
						System.out.print("-- ");
					}

				}
			} catch (Exception e) {
				System.out.print("--  ");
			}
			System.out.println(" ");
		}

		wb.close();

	}

}
