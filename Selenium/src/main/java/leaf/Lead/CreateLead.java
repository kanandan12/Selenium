package leaf.Lead;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	//@Test(invocationCount=2)
	//@Test(groups="Smoke")
	@Test(dataProvider= "fetchData")
	public void createLead(String szCompanyName, String szFirstName, String szLastName, String szEmailId, String szPhoneNo) throws Exception {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), szCompanyName);
		type(locateElement("id", "createLeadForm_firstName"), szFirstName);
		type(locateElement("id", "createLeadForm_lastName"), szLastName);
		type(locateElement("id", "createLeadForm_primaryEmail"), szEmailId);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), szPhoneNo);
		click(locateElement("name", "submitButton"));
				
	}
		
}




/*@DataProvider(name = "fetchData")
public Object[][] fetchData() {
	
	Object[][] szData = new Object[2][5];
	szData[0][0] = "HCL";
	szData[0][1] = "Kamalakannan";
	szData[0][2] = "Anandan";
	szData[0][3] = "kamalakannan.anandan@gmail.com";
	szData[0][4] = "9840431771";
	
	szData[1][0] = "Infosys";
	szData[1][1] = "Koushika";
	szData[1][2] = "Gopalakrishnan";
	szData[1][3] = "koushika.kamal@gmail.com";
	szData[1][4] = "7550099816";
	
	return szData;
}*/



/*@DataProvider(name = "fetchData")
public String[][] fetchData() {
	
	String[][] szData = new String[2][5];
	szData[0][0] = "HCL";
	szData[0][1] = "Kamalakannan";
	szData[0][2] = "Anandan";
	szData[0][3] = "kamalakannan.anandan@gmail.com";
	szData[0][4] = "9840431771";
	
	szData[1][0] = "Infosys";
	szData[1][1] = "Koushika";
	szData[1][2] = "Gopalakrishnan";
	szData[1][3] = "koushika.kamal@gmail.com";
	szData[1][4] = "7550099816";
	
	return szData;
}*/












