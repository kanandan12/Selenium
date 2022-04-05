package Week3.Day2;

import org.junit.Test;
import wdMethods.SeMethods;
import org.openqa.selenium.WebElement;

public class WebSelectOption extends SeMethods{
	
	@Test
	public void login() throws InterruptedException {
		
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		
		WebElement webEle1 = locateElement("id", "username");
		type(webEle1, "DemoSalesManager");
		
		WebElement webEle2 = locateElement("id", "password");
		type(webEle2, "crmsfa");
		
		WebElement webEle3 = locateElement("class", "decorativeSubmit");
		click(webEle3);
		
		WebElement webEle4 = locateElement("linktext", "CRM/SFA");
		click(webEle4);
		
		WebElement webEle5 = locateElement("linktext", "Create Lead");
		click(webEle5);
		
		WebElement webEle6 = locateElement("id1", "createLeadForm_companyName");
		type(webEle6, "TestLeaf");
		
		WebElement webEle7 = locateElement("id", "createLeadForm_firstName");
		type(webEle7, "KamalaKannan");
		
		WebElement webEle8 = locateElement("id", "createLeadForm_lastName");
		type(webEle8, "Anandan");
		
		WebElement webEle9 = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(webEle9, "Existing Customer");
		
		
		
		/*WebElement webEle9 = locateElement("name", "submitButton");
		click(webEle9);
		*/
	}
			
	

}
