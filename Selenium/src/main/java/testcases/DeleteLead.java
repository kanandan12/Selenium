package testcases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DeleteLead extends SeMethods{

	@Test
	public void deleteLead() throws Exception {
		
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);
		
		//Click on crmsfa link
		WebElement link = locateElement("link", "CRM/SFA");
		click(link);

		//Click on lead
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		
		//Click on Find Lead
		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);
		
		//Click on phone number
		WebElement phoneTab = locateElement("xpath", "//span[text()=\"Phone\"]");
		click(phoneTab);
		
		//Enter Phone Number		
		WebElement phoneCountryCode = locateElement("name", "phoneCountryCode");
		type(phoneCountryCode, "1");
		/*WebElement phoneAreaCode = locateElement("name", "phoneAreaCode");
		type(phoneAreaCode, "91");
		WebElement phoneNumber = locateElement("name", "phoneNumber");
		type(phoneNumber, "90909090");
		*/
		//Click on Find Lead Button
		WebElement findLeadButton = locateElement("xpath", "(//button[text()='Find Leads'])");
		click(findLeadButton);
		
		//click on first row			
		WebElement firstLeadrowlink = locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a");
		String text = getText(firstLeadrowlink);
		System.out.println(text);
		click(firstLeadrowlink);
		
		//Click on Delete Lead
		WebElement deleteRowButton = locateElement("xpath", "//a[text()='Delete']");
		click(deleteRowButton);
		Thread.sleep(4000);
		
		//Click on Find Lead Tab STALE ELEMENT
		WebElement findLeadtab = locateElement("link", "Find Leads");
		click(findLeadtab);
		
		//Enter Find Lead Tab
		WebElement enterFindLead = locateElement("name", "id");
		type(enterFindLead, text);
		
		//Click on Find Lead Button DUPLICAATE VARIABLE CREATED
		WebElement findLeadButton1 = locateElement("xpath", "(//button[text()='Find Leads'])");
		click(findLeadButton1);
		Thread.sleep(3000);
		
		//Verify the No records message
		WebElement noRecMsg = locateElement("xpath", "//div[@class='x-paging-info']");
		
		verifyExactText(noRecMsg, "No records to display");
		//Close the bowser
		closeBrowser();
		
		
				

	}

}
