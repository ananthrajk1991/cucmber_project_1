package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public static void edgeBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	
	public static void firefoxBrowser() {

		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}

	public static void chromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void closeBrowser() {

		driver.quit();
	}

	public static void maxWindow() {

		driver.manage().window().maximize();
	}

	public static String pageTitle() {

		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void fillTextBox(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void btnClick(WebElement element) {

		element.click();
	}

	public static void getDateAndTime() {

		Date d = new Date();
		System.out.println(d);
	}

	private void moveToElement(WebElement ele) {

		a = new Actions(driver);

		a.moveToElement(ele).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement des) {

		a.dragAndDrop(src, des).perform();
	}

	public static void copy() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() {

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

//	public static String readFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {
//
//		// File Location
//
//		File f = new File("D:\\Eclipse\\MavenProject12pm\\Excel\\LoginDetails.xlsx");
//		FileInputStream fin = new FileInputStream(f);
//		Workbook book = new XSSFWorkbook(fin);
//		Sheet sh = book.getSheet(sheetName);
//		Row r = sh.getRow(rowNo);
//
//		Cell c = r.getCell(cellNo);
//
//		int type = c.getCellType();
//
//		String name = "";
//
//		if (type == 1) { // string value
//
//			name = c.getStringCellValue();
//		}
//
//		else if (DateUtil.isCellDateFormatted(c)) {
//
//			Date d = c.getDateCellValue();
//
//			SimpleDateFormat sim = new SimpleDateFormat("dd/mmmm/yyyy");
//			name = sim.format(d);
//
//		}
//
//		else {
//
//			double d = c.getNumericCellValue();
//
//			// double(higher)---->long(lower)
//
//			long l = (long) d;
//
//			name = String.valueOf(l);
//
//		}
//
//		return name;
//
//	}
	
}
