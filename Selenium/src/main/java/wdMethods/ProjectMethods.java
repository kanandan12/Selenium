package wdMethods;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Week6.Day1.ReadExcelFile;

public class ProjectMethods extends SeMethods {	

	@Parameters( {"url", "username", "password"} )
	@BeforeMethod(groups="Common")
	public void login(String szURL, String szUserName, String szPassword) {
		startApp("chrome", szURL);
		type(locateElement("id", "username"), szUserName);
		type(locateElement("id", "password"), szPassword);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}

	@AfterMethod(groups="Common")
	public void closeApp() {
		closeBrowser();
	}
	
	@DataProvider(name = "fetchData")
	public Object[][] ReadExcelCreateLead() throws IOException {
		ReadExcelFile objExcel = new ReadExcelFile();
		objExcel.ReadExcel();
		
		return null;
		
	}

}
