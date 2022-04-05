package Week3.Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FremesMethod  {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Framework
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
						
		String sInputValue = "Kamalakannan";
		driver.switchTo().alert().sendKeys(sInputValue);
		driver.switchTo().alert().accept();
		
		String sGetTextMsg = driver.findElementByXPath("//p[contains(text(),'Kamalakannan')]").getText();
				
		if(sGetTextMsg.contains(sInputValue))
		{
			System.out.println(sGetTextMsg);
		}
				
		
		
		
		
		
		
		
		
		

	}

}
