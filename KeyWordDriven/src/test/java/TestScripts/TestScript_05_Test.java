package TestScripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import ExcelLibrary.FetchData;
import utilitymethods.ActionsMethods;

public class TestScript_05_Test extends FetchData {
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
				
			case "click": {
				Thread.sleep(2000);
                am.click(locators(i));
				Thread.sleep(2000);
			}
				break;
			
			case "dropdown": {
				Thread.sleep(2000);
                am.drop_downs_text(locators(i),values(i));
                System.out.println(values(i));
				Thread.sleep(2000);
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
