package TestScripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import ExcelLibrary.FetchData;
import utilitymethods.ActionsMethods;

public class TestScript_01_Test extends FetchData {
	public static ActionsMethods am = new ActionsMethods();

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for (int i = 0; i < rowCount(); i++) {

			switch (actions(i)) {
			case "open browser": {
//				driver = new ChromeDriver();
				am.open_browser();
			}
				break;

			case "maximize browser": {
//				driver.manage().window().maximize();
				am.maximize_browser();
			}
				break;

			case "launch url": {
//				driver.get(values(3));
				am.navigate_to_app(values(i));
			}
				break;

			case "search": {
				am.locating_ele(locators(i));
			}
				break;

			case "send keys": {
                am.send_data(locators(i), values(i));
			}
				break;
				
			case "click": {
                am.click(locators(i));
			}
				break;

			case "close browser": {
//				driver.quit();
				am.close_browser();
			}
				break;
			}

		}

	}
}
