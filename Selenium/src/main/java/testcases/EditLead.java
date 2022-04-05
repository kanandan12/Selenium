package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class EditLead extends SeMethods{
		
		//Go to crm/sfalink, click on Edit Lead and update the lead
		@Test
		public void login() {
			startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement uName = locateElement("id", "username");
			type(uName, "DemoSalesManager");
			//Thread.sleep(3000);
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
			
			WebElement enterFindLead = locateElement("xpath", "((//input[@name = 'firstName'])[3])");
			type(enterFindLead, "durga");
			
			WebElement findLeadIDButton = locateElement("class", "x-btn-text");
			click(findLeadIDButton);
			
			//click on first row			
			WebElement firstLeadrow = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
			click(firstLeadrow);
			
			//Verify the title of the page NEED CLARIFICATION
			verifyTitle("View Lead");
			
			//Click on Edit button
			WebElement findEditLink = locateElement("link", "Edit");
			click(findEditLink);
			
			//Change the company name
			WebElement companyName = locateElement("id", "updateLeadForm_companyName");
			type(companyName, "TATA3");
			
			//Click on update
			WebElement update = locateElement("xpath", "//input[@class='smallSubmit']");
			update.click();
			
			//Verify the updated company name
			WebElement verifycompanyName = locateElement("id", "viewLead_companyName_sp");
			verifyPartialText(verifycompanyName, "TATA3");
			
			//Close the bowser
			closeBrowser();
			
			
			
			
			
	}

}
