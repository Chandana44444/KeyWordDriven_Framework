package TestScripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import ExcelLibrary.FetchData;
import utilitymethods.ActionsMethods;

public class TestScript_04_Test extends FetchData {
	public static ActionsMethods am = new ActionsMethods();

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		for (int i = 1; i <rowCount(); i++) {
			System.out.println(rowCount());

			switch (actions(i)) {
			case "open browser": {
				am.open_browser();
			}
				break;

			case "maximize browser": {
				am.maximize_browser();
			}
				break;

			case "launch url": {
				am.navigate_to_app(values(i));
			}
				break;
				
			case "scroll": {
				Thread.sleep(4000);
                am.scroll_ele_up(locators(i));
				Thread.sleep(12000);
			}
				break;


			case "close browser": {
				Thread.sleep(2000);
				am.close_browser();
			}
				break;
			}

		}

	}
}
