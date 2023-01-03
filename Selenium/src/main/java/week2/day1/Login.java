package week2.day1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Enter Website name 
		driver.get("http://leaftaps.com/opentaps/");
				
		// Enter User name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
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
			
		}
			
		 
		//driver.findElementByName("submitButton").click();
		
		
		
		

	}

}
