package Week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class IRCTCLogin extends ProjectMethods {

	@Test
	public void IrctLogin() throws InterruptedException {
		
		// Launch Browser
		//login();
		
		driver.get("https://www.irctc.co.in/");
		//Wait for 30 Seconds to load the web page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Close the login screen
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		//Thread.sleep(5000);
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("User2020");
		driver.findElementById("userRegistrationForm:password").sendKeys("Pwd2020#");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Pwd2020#");
		
		WebElement webEle1 = driver.findElementById("userRegistrationForm:securityQ");
		Select oPtion1 = new Select(webEle1);
		oPtion1.selectByVisibleText("What make was your first car or bike?");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("yamaha");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("FirstName");
		
		driver.findElementById("userRegistrationForm:middleName").sendKeys("MiddleName");
		
		driver.findElementById("userRegistrationForm:lastName").sendKeys("LastName");
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		WebElement webEle2 = driver.findElementById("userRegistrationForm:dobDay");
		Select oPtion2 = new Select(webEle2);
		oPtion2.selectByIndex(13);
		
		WebElement webEle3 = driver.findElementById("userRegistrationForm:dobMonth");
		Select oPtion3 = new Select(webEle3);
		oPtion3.selectByIndex(4);
		
		WebElement webEle4 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select oPtion4 = new Select(webEle4);
		oPtion4.selectByVisibleText("1988");
		
		WebElement webEle5 = driver.findElementById("userRegistrationForm:occupation");
		Select oPtion5 = new Select(webEle5);
		oPtion5.selectByIndex(2);
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("338018213266");
		
		driver.findElementById("userRegistrationForm:idno").sendKeys("AOSQ23453");
		
		WebElement webEle6 = driver.findElementById("userRegistrationForm:countries");
		Select oPtion6 = new Select(webEle6);
		oPtion6.selectByValue("94");		
		
		driver.findElementById("userRegistrationForm:email").sendKeys("testing@gmail.com");
		
		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
		
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9840198401");
		
		WebElement webEle7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select oPtion7 = new Select(webEle7);
		oPtion7.selectByValue("94");	
		
		driver.findElementById("userRegistrationForm:address").sendKeys("2431");
		
		driver.findElementById("userRegistrationForm:street").sendKeys("Vivekanda Street");
		
		driver.findElementById("userRegistrationForm:area").sendKeys("Old Washernmentpet");
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600021");
		
		Thread.sleep(3000);
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
		
		//driver.findElementById("userRegistrationForm:statesName").sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		WebElement webEle8 = driver.findElementById("userRegistrationForm:cityName");
		Select oPtion8 = new Select(webEle8);
		oPtion8.selectByVisibleText("Chennai");
		
		Thread.sleep(3000);
		
		WebElement webEle9 = driver.findElementById("userRegistrationForm:postofficeName");
		Select oPtion9 = new Select(webEle9);
		oPtion9.selectByVisibleText("Washermanpet S.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("25921130");
				
		// Close Browser
		//closeBrowser();

	}

}
