package Week3.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchWindow  {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		//Open contact us link
		driver.findElementByLinkText("Contact Us").click();
		driver.manage().window().maximize();
		
//		int nWndSize = driver.getWindowHandles().size();
		
		Set<String> allWindowsSize = driver.getWindowHandles();
		int nWndSize = allWindowsSize.size();
		System.out.println(nWndSize);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<String> lsWindows = new ArrayList<String>();
		lsWindows.addAll(allWindowsSize);
		System.out.println(lsWindows);
		String sSecWindow = lsWindows.get(1);
		//System.out.println(sSecWindow);
		
		driver.switchTo().window(sSecWindow);
//		System.out.println(sSecWindow);
		String SCurrentUrl = driver.getCurrentUrl();
		
		System.out.println(SCurrentUrl);
		
		//Close the current tab or window
//		driver.close();
		
		// close the browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
