package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class readExcel implements frameworkConstraints {

	@DataProvider(name="excel")
	public static Object[][] excelData() throws Exception {
		FileInputStream fis = new FileInputStream(excel_path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet(sheet_register);
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(1).getPhysicalNumberOfCells();
		Object[][] d = new Object[rowsize-1][columnsize];
		for (int i = 0; i < rowsize-1; i++) {
			for (int j = 0; j < columnsize; j++) {
				d[i][j] = s.getRow(i+1).getCell(j).toString();
			}
		}
		return d;
	}
}
