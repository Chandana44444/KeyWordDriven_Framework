package utilitymethods;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.Select;

import ExcelLibrary.FetchData;

public class ActionsMethods {
	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	
	public void open_browser() {
		driver=new ChromeDriver();
	}
	public void close_browser() {
		driver.quit();
	}
	public void maximize_browser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	public void mouse_hover(String locator ) throws EncryptedDocumentException, IOException {
		a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(locator));
		a.moveToElement(ele).perform();		
	}
	public void right_click(String locator ) throws EncryptedDocumentException, IOException {
		a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(locator));
		a.contextClick(ele).perform();		
	}
	public void scroll(String locator ) throws EncryptedDocumentException, IOException {
		a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(locator));
		a.scrollToElement(ele).click().perform();		
	}
	public void scroll_ele_up(String locator ) throws EncryptedDocumentException, IOException {
		a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(locator));
		ScrollOrigin ref=ScrollOrigin.fromElement(ele);
		a.scrollFromOrigin(ref, 0, 300).perform();	
	}
	public void drop_downs_index(String locator,int index) throws EncryptedDocumentException, IOException {
		WebElement ele = driver.findElement(By.xpath(locator));
		s=new Select(ele);
		s.selectByIndex(index);
	}
	public void drop_downs_value(String locator,String value) throws EncryptedDocumentException, IOException {
		WebElement ele = driver.findElement(By.xpath(locator));
		s=new Select(ele);
		s.selectByValue(value);
	}
	public void drop_downs_text(String locator,String text) throws EncryptedDocumentException, IOException {
		WebElement ele = driver.findElement(By.xpath(locator));
		s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	
	

}
