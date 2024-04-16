package utilitymethods;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelLibrary.FetchData;

public class ActionsMethods {
	public static WebDriver driver;
	
	public void open_browser() {
		driver=new ChromeDriver();
	}
	public void close_browser() {
		driver.quit();
	}
	public void maximize_browser() {
		driver.manage().window().maximize();
	}
	public void navigate_to_app(String url) {
		driver.get(url);
	}
	public void locating_ele(String locators) throws EncryptedDocumentException, IOException {
		driver.findElement(By.xpath(locators));
	}
	public void send_data(String locators,String value) throws EncryptedDocumentException, IOException {
		driver.findElement(By.xpath(locators)).sendKeys(value);
	}
	public void click(String locators) throws EncryptedDocumentException, IOException {
		driver.findElement(By.xpath(locators)).click();
	}
	public void back() throws EncryptedDocumentException, IOException {
		driver.navigate().back();
	}
	
	

}
