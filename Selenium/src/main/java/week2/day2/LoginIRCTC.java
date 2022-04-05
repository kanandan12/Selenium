package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginIRCTC {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> tagN1 = driver.findElementsByTagName("a");
		int nCount = 0;
		nCount = tagN1.size();
		System.out.println("Total links in the webpage: " +nCount);
		
		nCount = 0;
		for (WebElement webElement : tagN1) {
			if(webElement.getText().contains("a")) {
				System.out.println("Links Details");
				System.out.println(webElement.getText());
				nCount++;
			}
		}
		
		System.out.println("Link Contains a: " +nCount);
		
/*				
		// Signup Link
		driver.findElementByLinkText("Sign up").click();
		
		
		// Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		// Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		// Click Create Lead 
		driver.findElementByLinkText("Create Lead").click();
		
		//Entering fields name
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL Technologies");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kamalakannan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Anandan");
		// Getting value from Listbox
		WebElement sourceDropdown = driver.findElementById("createLeadForm_dataSourceId");
		Select scdropdown = new Select(sourceDropdown);
		scdropdown.selectByVisibleText("Existing Customer");
		
		WebElement marketingDropdown = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mkdropdown = new Select(marketingDropdown);
		mkdropdown.selectByIndex(3);
	
		WebElement industryDropdown = driver.findElementById("createLeadForm_industryEnumId");
		Select indropdown = new Select(industryDropdown);
		List<WebElement> allOptions = indropdown.getOptions();
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
			
		}*/
			
		 
		//driver.findElementByName("submitButton").click();
		
		
		
		

	}

}
