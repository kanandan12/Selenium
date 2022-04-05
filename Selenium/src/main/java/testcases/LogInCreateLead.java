package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class LogInCreateLead extends SeMethods{
		
	//Go to crm/sfalink, Click on Create Leads, Enter the Mandatory fields, fill the dropdown and click Create Lead
	@Test
	public void login() {
		try {
			startApp("chrome", "http://leaftaps.com/opentaps");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);
		
		//Click on crmsfa link
		WebElement link = locateElement("link", "CRM/SFA");
		click(link);
		
		//Click on Create Lead 
		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);
		
		//Enter the mandatory fields 
		WebElement compName = locateElement("id", "createLeadForm_companyName");
		type(compName, "TATACONS");
		
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		type(firstName, "Durgaa");
		
		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		type(lastName, "Sundarrajj");
		
		
		//Select Dropdown
		//Locate the Drop down section
		WebElement sourceDropDown = locateElement("id", "createLeadForm_dataSourceId");
		
		//Select the value
		selectDropDownUsingText(sourceDropDown, "Cold Call");
		
		
		//Click on Create Lead button
		WebElement createLeadButton = locateElement("name", "submitButton");
		click(createLeadButton);
	}
}
		
	