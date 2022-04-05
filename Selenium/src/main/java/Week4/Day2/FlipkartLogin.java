package Week4.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Enter Website name 
		driver.get("https://www.flipkart.com/");
		
		//Wait for 30 Seconds to load the web page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Close the login screen
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		// Mouse over to TVs & Appliances
		WebElement webEleTV = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement webEleSansung = driver.findElementByXPath("(//span[text()='Samsung'])[2]");
		Actions builder = new Actions(driver);
		builder.moveToElement(webEleTV).perform();
				
		// Select Samsung Product in TV & Appliances
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(webEleSansung));
		builder.click(webEleSansung).perform();
		
		// Select minimum price 25000
		WebElement webEleMini = driver.findElementByXPath("(//select[@class='a_eCSK'])[1]");
		WebDriverWait waitMini = new WebDriverWait(driver, 10);
		waitMini.until(ExpectedConditions.elementToBeClickable(webEleMini));
		Select optMini = new Select(webEleMini);
		optMini.selectByIndex(3);
		
		// Select maximun price 6000
		WebElement webEleMax = driver.findElementByXPath("(//select[@class='a_eCSK'])[2]");
		WebDriverWait waitMax = new WebDriverWait(driver, 10);
		waitMax.until(ExpectedConditions.elementToBeClickable(webEleMax));
		Select optMax = new Select(webEleMax);
		optMax.selectByValue("60000");
		
		//String cValue = driver.findElementByXPath("//div[text()='Screen Size']/following-sibling::*").getAttribute("class");
		
		
		//if(cValue.equals("_2vKQKr")) {
		//	System.out.println("Screen size conditions is ok");
			
		//}
		
		
		
		
		
		
		
		
		
		//Thread.sleep(5000);
		
		// Scroll down the web page
		//driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
		//driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
		
		// Filter by screen size options
		//WebElement webEleScreen = driver.findElementByXPath("//div[text()='Screen Size']");
		WebElement webEleScreen = driver.findElementByXPath("//*[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div/div[5]/section/div[1]/div");
		WebDriverWait waitScreen = new WebDriverWait(driver, 10);
		waitScreen.until(ExpectedConditions.elementToBeClickable(webEleScreen));
		webEleScreen.click();
		
		//System.out.println("hi");
		
		//Thread.sleep(5000);
		// Select by TV screens Size 48 - 55
		WebElement webEleScreenSize= driver.findElementByXPath("//div[text()='48 - 55']");
		WebDriverWait waitScreenSize = new WebDriverWait(driver, 10);
		waitScreenSize.until(ExpectedConditions.elementToBeClickable(webEleScreenSize));
		webEleScreenSize.click();
		
		//System.out.println("hi");
		
		
			

		//Select optScreenSize = new Select(webEleScreenSize);
		//optScreenSize.selectByVisibleText("48 - 55");
		
		
		
		
		
		
		
		
		

	}

}
