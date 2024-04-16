package ExcelLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class FetchData {
	//public static File file = new File("C:\\Users\\User\\eclipse-workspace\\KeyWordDriven\\src\\test\\resources\\Excel2.xlsx");
	public static File file= new File("./src/test/resources/Excel.xlsx");
	public static Workbook wb;

//public static String sheetname=wb.getSheet("FT_01").toString();
//public static String sheetname=wb.getSheet("Login_DWS").toString();


	public static String locators(int rownumber) throws EncryptedDocumentException, IOException {
		wb = WorkbookFactory.create(file);
		return wb.getSheet("ST_01").getRow(rownumber).getCell(1).toString();
	}

	public static String actions(int rownumber) throws EncryptedDocumentException, IOException {
		wb = WorkbookFactory.create(file);
		return wb.getSheet("ST_01").getRow(rownumber).getCell(2).toString().toLowerCase();
	}

	public static String values(int rownumber) throws EncryptedDocumentException, IOException {
		wb = WorkbookFactory.create(file);
		return wb.getSheet("ST_01").getRow(rownumber).getCell(3).toString();
	}

	public static String teststep(int rownumber) throws EncryptedDocumentException, IOException {
		wb = WorkbookFactory.create(file);
		return wb.getSheet("ST_01").getRow(rownumber).getCell(0).toString();
	}

	public static int rowCount() {
		try {
			wb = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wb.getSheet("ST_01").getPhysicalNumberOfRows();
	}

	public static String propertiesFile(String loc, String key) {
		File f = new File(loc);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
